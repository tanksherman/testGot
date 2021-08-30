package com.qa.pages;

import com.qa.BaseTest;
import com.qa.utils.TestUtils;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;

public class SignUpPage extends BaseTest {
	TestUtils utils = new TestUtils();
	
	@AndroidFindBy (accessibility = "email_input" )
	@iOSXCUITFindBy (xpath = "")
	private MobileElement emailSignUpEditField;

	@AndroidFindBy (accessibility = "user_name_input" )
	@iOSXCUITFindBy (xpath = "")
	private MobileElement usernameSignUpEditField;

	@AndroidFindBy (accessibility = "password_input" )
	@iOSXCUITFindBy (xpath = "")
	private MobileElement passwordSignUpEditField;

	@AndroidFindBy (accessibility = "repeat_password_input" )
	@iOSXCUITFindBy (xpath = "")
	private MobileElement repeatPasswordSignUpEditField;

	@AndroidFindBy (xpath = "//android.view.ViewGroup[@content-desc=\"image_picker\"]/android.widget.ImageView" )
	@iOSXCUITFindBy (xpath = "")
	private MobileElement imagePickerBtn;

	@AndroidFindBy (xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.support.v7.widget.RecyclerView/android.widget.RelativeLayout[1]/android.view.View")
	@iOSXCUITFindBy (xpath = "")
	private MobileElement androidPhotos;

	@AndroidFindBy (accessibility = "Photo taken on Jul 12, 2021 10:16:43 PM" )
	@iOSXCUITFindBy (xpath = "")
	private MobileElement chooseImage;

	@AndroidFindBy (accessibility = "create_account_button" )
	@iOSXCUITFindBy (xpath = "")
	private MobileElement createAccountBtn;

	public void enterEmailForSignUp(String email) {
		clear(emailSignUpEditField);
		sendKeys(emailSignUpEditField, email, "email is " + email);
	}

	public void enterNameForSignUp(String name) {
		clear(usernameSignUpEditField);
		sendKeys(usernameSignUpEditField, name, "name is " + name);
	}

	public void enterPasswordForSignUp(String password) {
		clear(passwordSignUpEditField);
		sendKeys(passwordSignUpEditField, password, "password is " + password);
	}

	public void enterConfirmPasswordForSignUp(String confirmPassword) {
		clear(repeatPasswordSignUpEditField);
		sendKeys(repeatPasswordSignUpEditField, confirmPassword, "confirmPassword is " + confirmPassword);
	}

	public void pressCreateAccountButtonSignUpPage() {
		click(createAccountBtn, "press create account button");
	}

	public void pressAddImageButtonSignUpPage() {
		click(imagePickerBtn, "press create image button");
	}

	public void pressAndroidPhotosFolderSignUpPage() {
		click(androidPhotos, "press android folder button");
	}

	public void chooseImageFromAndroidPhotosFolderSignUpPage() {
		click(chooseImage, "choose image from android photos folder");
	}

	public void signUp(String email, String name, String password, String confirmPassword) {
		enterEmailForSignUp(email);
		enterNameForSignUp(name);
		enterPasswordForSignUp(password);
		enterConfirmPasswordForSignUp(confirmPassword);

	}

}
