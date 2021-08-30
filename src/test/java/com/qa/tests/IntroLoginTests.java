package com.qa.tests;

import com.qa.BaseTest;
import com.qa.pages.HomePge;
import com.qa.pages.IntroLoginPage;

import com.qa.pages.SignInPage;
import com.qa.pages.SignUpPage;
import com.qa.utils.TestUtils;
import org.json.JSONObject;
import org.json.JSONTokener;
import org.testng.Assert;
import org.testng.annotations.*;

import java.io.InputStream;
import java.lang.reflect.Method;

public class IntroLoginTests extends BaseTest {
    IntroLoginPage introLoginPage;
    JSONObject loginUsers;
    TestUtils utils = new TestUtils();

    @BeforeClass
    public void beforeClass() throws Exception {
        InputStream datais = null;
        try {
            String dataFileName = "data/loginUsers.json";
            datais = getClass().getClassLoader().getResourceAsStream(dataFileName);
            JSONTokener tokener = new JSONTokener(datais);
            loginUsers = new JSONObject(tokener);
        } catch (Exception e) {
            e.printStackTrace();
            throw e;
        } finally {
            if (datais != null) {
                datais.close();
            }
        }
        closeApp();
        launchApp();
    }

    @AfterClass
    public void afterClass() {
    }

    @BeforeMethod
    public void beforeMethod(Method m) {
        utils.log().info("\n" + "****** starting test:" + m.getName() + "******" + "\n");
        introLoginPage = new IntroLoginPage();
    }

    @AfterMethod
    public void afterMethod() {
        closeApp();
        launchApp();
    }

    @Test
    public void startInvalidDataLogIn() {
// making sign in with wrong email and password and catching the error message
        introLoginPage.pressLoginSignInBtn();
        SignInPage signInPage = new SignInPage();
        signInPage.enterEmailForSignIn(loginUsers.getJSONObject("invalidUser").getString("email"));
        signInPage.enterPasswordForSignIn(loginUsers.getJSONObject("invalidUser").getString("password"));
        signInPage.pressLoginBtnInSignInPage();

        String actualErrTxt = signInPage.getErrorSignInMessage();
        String expectedErrTxt = getStrings().get("err_invalid_email_or_password");

        Assert.assertEquals(actualErrTxt, expectedErrTxt);
    }

    @Test
    public void startSignUp() {
// making sign up with new user
        introLoginPage.pressStartBtn();
        SignUpPage signUpPage = new SignUpPage();
        signUpPage.pressAddImageButtonSignUpPage();
        signUpPage.pressAndroidPhotosFolderSignUpPage();
        signUpPage.chooseImageFromAndroidPhotosFolderSignUpPage();
        signUpPage.signUp(loginUsers.getJSONObject("signupUser").getString("email"),
                loginUsers.getJSONObject("signupUser").getString("name"),
                loginUsers.getJSONObject("signupUser").getString("password"),
                loginUsers.getJSONObject("signupUser").getString("password"));
        signUpPage.pressCreateAccountButtonSignUpPage();

        // verifying we are on the home page
        HomePge homePge = new HomePge();
        waitForVisibility(homePge.homePageIcon);

 // creating a new task from home page
        homePge.clickAddTaskBtn();
        homePge.makeTask(loginUsers.getJSONObject("signupUser").getString("title"),
                loginUsers.getJSONObject("signupUser").getString("subTitle"));
        homePge.clickAddImageBtn();
        homePge.addAndroidImage();
        scrollToElement(getStrings().get("create_task_button"));
        homePge.clickDateOnPicker();
        homePge.clickOnCreateBtn();

 // verifying created task by its title
        waitForVisibility(homePge.taskTitleText);
        String actualErrTxt = homePge.getTaskText();
        String expectedErrTxt = getStrings().get("title");

        Assert.assertEquals(actualErrTxt, expectedErrTxt);




    }

//    @Test
//    public void startValidDataLogIn() {
//        introLoginPage.pressLoginSignInBtn();
}
