package com.facebookTest;

import com.facebook.LandingPage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pnt.automation.base.TestBase;
import pnt.automation.extent.ExtentTestManager;

public class LandingPageValidation extends TestBase {

    LandingPage landingPage;
    @BeforeMethod
    public void setUpPageObj() {
    landingPage = PageFactory.initElements(driver, LandingPage.class);
    }

    @Test(enabled = true)
    public void validateUserIsAbleToProvideUserNameOnUserNameField() {
        landingPage.provideUserName();
    }

    @Test(enabled = false)
    public void validateUserIsAbleToProvidePasswordOnPasswordField() {
        landingPage.providePassword();
    }
    @Test
    public void validateUserBeingAbleToClickOnLoginButton(){
        landingPage.clickOnLoginButton();
    }










}




