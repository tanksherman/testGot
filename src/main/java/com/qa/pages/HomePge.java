package com.qa.pages;

import com.qa.BaseTest;
import com.qa.utils.TestUtils;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;

public class HomePge extends BaseTest {
    TestUtils utils = new TestUtils();

    @AndroidFindBy(xpath = "//android.widget.Button[@content-desc=\"Home, tab, 1 of 3\"]/android.view.ViewGroup/android.widget.TextView")
    @iOSXCUITFindBy(xpath = "")
    public MobileElement homePageIcon;

    @AndroidFindBy(accessibility = "bottom_bar_create_button")
    @iOSXCUITFindBy(xpath = "")
    private MobileElement addTaskBtn;

    @AndroidFindBy(xpath = "//android.widget.Button[@content-desc=\"Search, tab, 3 of 3\"]/android.view.ViewGroup/android.widget.TextView")
    @iOSXCUITFindBy(xpath = "")
    private MobileElement homePageSearchBtn;

    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup[1]/android.widget.EditText")
    @iOSXCUITFindBy(xpath = "")
    private MobileElement taskTitleEditText;

    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup[2]/android.widget.EditText")
    @iOSXCUITFindBy(xpath = "")
    private MobileElement taskSubTaskEditField;

    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[3]/android.view.ViewGroup/android.widget.TextView[2]")
    @iOSXCUITFindBy(xpath = "")
    private MobileElement taskUploadImageBtn;

    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[3]/android.view.ViewGroup/android.widget.TextView[1]")
    @iOSXCUITFindBy(xpath = "")
    private MobileElement uploadImageTextBar;

    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[4]/android.view.ViewGroup[2]")
    @iOSXCUITFindBy(xpath = "")
    private MobileElement taskCreateBtn;

    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[3]/android.widget.RelativeLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.NumberPicker[1]/android.widget.Button")
    @iOSXCUITFindBy(xpath = "")
    private MobileElement nextDayPicker;

    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.TextView")
    @iOSXCUITFindBy(xpath = "")
    private MobileElement taskDeleteBtn;

    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup[2]/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.widget.TextView[1]")
    @iOSXCUITFindBy(xpath = "")
    public MobileElement taskTitleText;

    public void clickAddTaskBtn() {
        click(addTaskBtn, "click on the add task button");
    }

    public void enterTitleForTask(String title) {
        clear(taskTitleEditText);
        sendKeys(taskTitleEditText, title, "title is " + title);
    }

    public void enterSubTaskForTask(String subTask) {
        clear(taskSubTaskEditField);
        sendKeys(taskSubTaskEditField, subTask, "subTask is " + subTask);

    }

    public void clickAddImageBtn() {
        click(taskUploadImageBtn, "click on the add image button");
    }

    public void addAndroidImage() {
        SignUpPage signUpPage = new SignUpPage();
        signUpPage.pressAndroidPhotosFolderSignUpPage();
        signUpPage.chooseImageFromAndroidPhotosFolderSignUpPage();
    }

    @Override
    public MobileElement scrollToElement(String visibleText) {
        return super.scrollToElement(visibleText);
    }

    public void makeTask(String title, String subTask) {
        enterTitleForTask(title);
        enterSubTaskForTask(subTask);
    }

    public void clickDateOnPicker() {
        click(nextDayPicker, "click on the next date picker button");
    }

    public void clickOnCreateBtn() {
        click(taskCreateBtn, "click on the create task button");
    }

    public String getTaskText() {
        String title = getText(taskTitleText, "title is - ");
        return title;
    }



}
