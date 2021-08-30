package com.qa.pages;

import com.qa.BaseTest;
import com.qa.utils.TestUtils;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;

public class IntroLoginPage extends BaseTest {
    TestUtils utils = new TestUtils();

    @AndroidFindBy(accessibility = "start_button")
    @iOSXCUITFindBy(id = "")
    private MobileElement startButton;

    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.TextView")
    @iOSXCUITFindBy(id = "")
    private MobileElement loginButton;


    public SignUpPage pressStartBtn() {
        click(startButton, "press start button");
        return new SignUpPage();
    }

    public SignInPage pressLoginSignInBtn() {
        click(loginButton, "press login button");
        return new SignInPage();
    }

}
