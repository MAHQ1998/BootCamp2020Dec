package com.cigna;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import pnt.automation.base.TestBase;
import pnt.automation.extent.ExtentTestManager;

public class CignaHomePage extends TestBase {


    @FindBy(xpath="//a[@id='individuals-families-level-one-link']")
    public WebElement individualsAndFamilies;

    @FindBy(xpath="//button[@id='health-wellness-tab']")
    public WebElement healthWellnessTab;

    @FindBy(xpath="//a[@id='medicare-level-one-link']")
    public WebElement medicare;

    @FindBy(xpath="//a[@id='employers-brokers-level-one-link']")
    public WebElement employersAndBrokers;

    @FindBy(xpath="//button[@id='brokers-tab']")
    public WebElement becomeABroker;

    @FindBy(xpath="//a[@id='about-us-level-one-link']")
    public WebElement aboutUs;

    @FindBy(xpath="//button[@id='supplier-community-tab']")
    public WebElement supplierCommunity;

    @FindBy(xpath="(//a[text()='Log in to myCigna'])[1]")
    public WebElement logIntoMyCigna;

    @FindBy(xpath="(//input[@id='username']")
    public WebElement usernameField;

    @FindBy(xpath="(//input[@id='password']")
    public WebElement passwordField;

    public void mouseHoverIndividualsAndFamiliesAndHealthAndWellness(){
     mouseHover(individualsAndFamilies);
     healthWellnessTab.click();
     ExtentTestManager.log("clicked on health an wellness");
    }
    public void clickOnMedicare(){
        medicare.click();
        String currentUrl = TestBase.driver.getCurrentUrl();
        String expectedUrl = " https://www.cigna.com/medicare/";
        Assert.assertTrue(currentUrl.contains(expectedUrl));
        ExtentTestManager.log("Verified The Url is accurate");
    }
    public void mouseHoverEmployersAndBrokersAndClickOnBecomeABroker(){
        mouseHover(employersAndBrokers);
        becomeABroker.click();
        ExtentTestManager.log("clicked on become A broker");
    }

    public void mouseHoverAboutUsAndClickOnSupplierCommunity(){
        mouseHover(aboutUs);
        supplierCommunity.click();
        ExtentTestManager.log("clicked on supplier community");
    }

    public void clickOnLogInAndProvideDataOnCustomerLogIn(){
        logIntoMyCigna.click();
        usernameField.sendKeys("shadman");
        passwordField.sendKeys("abc123");
        String currentUrl = TestBase.driver.getCurrentUrl();
        String expectedUrl = "https://my.cigna.com/web/public/guest";
        Assert.assertTrue(currentUrl.contains(expectedUrl));
        ExtentTestManager.log("Verified The Url is accurate");

    }
}
