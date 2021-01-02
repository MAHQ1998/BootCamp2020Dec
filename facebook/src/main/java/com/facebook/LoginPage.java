package com.facebook;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pnt.automation.base.TestBase;
import pnt.automation.extent.ExtentTestManager;

public class LoginPage extends TestBase {
    @FindBy(id = "email")
    private WebElement clickEmail;

    @FindBy(id = "pass")
    private WebElement clickPassword;

    public void ableToSignIn() {
        clickEmail.sendKeys("mohhamed_hoque1998@yahoo.com");
        ExtentTestManager.log(" Email entered in the email field");
        sleepFor(3);
        clickPassword.sendKeys("abc123", Keys.RETURN);
        ExtentTestManager.log("Password entered in the pw field");
        sleepFor(10);

    }
}
