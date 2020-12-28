package com.cnn;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import pnt.automation.base.TestBase;
import pnt.automation.extent.ExtentTestManager;

public class HomePageCNN extends TestBase {

    @FindBy(xpath = "(//a[@name='us'])[1]")
    public WebElement US;

    @FindBy(xpath = "//h1[@itemprop='title']")
    public WebElement USTitle;

    @FindBy(xpath = "(//a[@name='world'])[1]")
    public WebElement world;

    @FindBy(xpath = "(//a[@name='politics'])[1]")
    public WebElement politics;

    @FindBy(xpath = "(//a[@name='opinions'])[1]")
    public WebElement opinions;

    @FindBy(xpath = "(//a[@name='health'])[1]")
    public WebElement health;

    @FindBy(xpath = "(//a[@name='tech'])[4]")
    public WebElement footerTech;

    @FindBy(xpath = "(//a[@name='2020 Election']")
    public WebElement election;

    @FindBy(xpath = "(//a[@aria-label='Health'])[1]")
    public WebElement healthLogo;


    public  void clickOnUsButton(){
        US.click();
        Assert.assertTrue(USTitle.isDisplayed());
        ExtentTestManager.log("clicked on us button");
    }
    public void clickOnWorldButton(){
        world.click();
        Assert.assertTrue(USTitle.isDisplayed());
        ExtentTestManager.log("Clicked On us button");
    }
    public void clickOnPoliticsButton(){
        politics.click();
        Assert.assertTrue(election.isDisplayed());
        ExtentTestManager.log("2020 Election is displayed");
    }
    public void clickOnHealth(){
        health.click();
        Assert.assertTrue(healthLogo.isDisplayed());
        ExtentTestManager.log("Health logo is displayed");
    }
}
