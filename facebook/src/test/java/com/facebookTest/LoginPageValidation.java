package com.facebookTest;

import com.facebook.FBHomePage;
import com.facebook.LandingPage;
import com.facebook.LoginPage;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pnt.automation.base.TestBase;

public class LoginPageValidation extends TestBase {
     LoginPage loginPage;
     LandingPage landingPage;
     FBHomePage fbHomePage;

    @BeforeMethod
    public void setUpObjects() {
        loginPage = PageFactory.initElements(driver, LoginPage.class);
        landingPage = PageFactory.initElements(driver, LandingPage.class);
        fbHomePage = PageFactory.initElements(driver, FBHomePage.class);
    }
    @Test(enabled = true)
    public void validateUserAbleToLogIn() {
        loginPage.ableToSignIn();
    }
}
