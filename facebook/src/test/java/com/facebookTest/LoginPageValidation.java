package com.facebookTest;

import com.facebook.LoginPage;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pnt.automation.base.TestBase;

public class LoginPageValidation extends TestBase {
     LoginPage loginPage;

    @BeforeMethod
    public void setUpObjects() {

        loginPage = PageFactory.initElements(driver, LoginPage.class);
    }


    @Test(enabled = true)
    public void validateUserAbleToLogIn() {
        loginPage.ableToSignIn();
    }

}
