package com.facebook;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import pnt.automation.base.TestBase;
import pnt.automation.extent.ExtentTestManager;

public class LandingPage extends TestBase {
    @FindBy(id = "email")
    private WebElement emailField;

    @FindBy(id = "pass")
    private WebElement passwordField;

    @FindBy(id = "u_0_b")
    private WebElement loginButton;

    @FindBy(xpath = "//div[@class='_9ay7']")
    private WebElement redErrorMessage;

    public void provideUserName() {
        emailField.sendKeys("hoque-mohammed1998@yahoo.com");
        ExtentTestManager.log("provided email address in the email/phone number field");
    }

    public void providePassword() {
        passwordField.sendKeys("abcd1234");
        ExtentTestManager.log("provided password in the password field");
    }


    public void clickOnLoginButton() {
        loginButton.click();
        ExtentTestManager.log("Clicked on login button after providing username and password");
        Assert.assertTrue(redErrorMessage.isDisplayed());
    }


}
