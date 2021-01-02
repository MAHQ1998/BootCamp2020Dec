package com.amazon.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import pnt.automation.base.TestBase;
import pnt.automation.extent.ExtentTestManager;

import javax.naming.ldap.ExtendedRequest;
import java.io.IOException;


public class LandingPage extends TestBase {

    @FindBy(xpath = "//span[@class='nav-line-2 nav-long-width']")
    private WebElement actAndList;

    @FindBy(xpath = "//span[@class='nav-action-inner']")
    private WebElement signIn;

    @FindBy(xpath = "//input[@id='twotabsearchtextbox']")
    private WebElement searchBar;

    @FindBy(xpath = "//span[@class='a-color-state a-text-bold']")
    private WebElement sharkVacuum;

    @FindBy(xpath = "//input[@id='nav-search-submit-button']")
    private WebElement searchButton;

    @FindBy(xpath = "(//input[@type='submit'])[1]")
    private WebElement submitButton;

    @FindBy(xpath = "//Select[@id='searchDropdownBox']")
    private WebElement allButton;

    @FindBy(xpath = "//input[@id='ap_email']")
    private WebElement emailTab;

    @FindBy(xpath = "//a[text()='Gift Cards']")
    private WebElement giftCards;

    @FindBy(xpath = "//a[text()='Birthdays']")
    private WebElement birthday;


    @FindBy(xpath = "//span[text()='Watchlist']")
    private WebElement watchList;

    @FindBy(xpath = "//i[@aria-label='Amazon']")
    private WebElement amazonLogo;

    @FindBy(xpath = "//a[@id='swm-link']")
    private WebElement shopNewYearNewYou;


    @FindBy(xpath = "//a[text()='Registry']")
    private WebElement registryButton;

    @FindBy(xpath = "//input[@placeholder='Search by Registrant name']")
    private WebElement registrantNameBar;

    @FindBy(css = "[id='a-autoid-0-announce']")
    private WebElement selectRegistryTab;

    @FindBy(xpath = "//a[@id='dropdown1_1']")
    private WebElement babyRegistry;

    @FindBy(xpath = "//button[@aria-label='Search']")
    private WebElement searchBtn;

    @FindBy(xpath = "//a[@aria-label='Wedding Registry']")
    private WebElement weddingRegistry;

    @FindBy(xpath = "//a[text()='Whole Foods']")
    private WebElement wholeFoodsBtn;

    @FindBy(xpath = "//img[@alt='Whole Foods']")
    private WebElement wholeFoodsMarket;

    @FindBy(xpath = "//img[@alt='Whole Foods Benefits']")
    private WebElement primeBlueLogo;

    @FindBy(xpath = "//a[@aria-label='Shop deals']")
    private WebElement seeInStoreDeals;

    @FindBy(xpath = "(//a[text()='Learn more'])[1]")
    private WebElement learnMore;

    @FindBy(xpath = "//a[text()='Careers']")
    private WebElement careersOnFooter;


    public void mouseHoverActAndList() {
        mouseHover(actAndList);
        Assert.assertTrue(signIn.isDisplayed());
        ExtentTestManager.log("Mouse Hovered To accAndLis and signIn button displayed");
    }

    public void searchForItems() {
        searchBar.sendKeys("shark vacuum");
        searchButton.click();
        sleepFor(2);
        Assert.assertTrue(sharkVacuum.isDisplayed());
        ExtentTestManager.log("Verified That shark vacuum is displayed");
    }


    public void selectDepartmentUnderAllDepartmentsButton() {
        selectInList(allButton).selectByVisibleText("Baby");
        Assert.assertTrue(allButton.getText().contains("Baby"));

    }

    public void clickOnSignInButtonUnderAccountsAndLists() {
        mouseHover(actAndList);
        Assert.assertTrue(signIn.isDisplayed());
        signIn.click();
        Assert.assertTrue(emailTab.isDisplayed());
        ExtentTestManager.log("clicked On Sign In ");
    }

    public void clickOnGitCardButton() {
        giftCards.click();
        sleepFor(2);
        Assert.assertTrue(birthday.isDisplayed());
        ExtentTestManager.log("clicked on Gift Card Button");
    }

    public void mouseHoverAccountAndListAndClickOnWatchList() {
        mouseHover(actAndList);
        sleepFor(2);
        watchList.click();
        sleepFor(2);
        Assert.assertTrue(amazonLogo.isDisplayed());
        ExtentTestManager.log("Verified The Amazon Logo is displayed on the middle of the page");

    }

    public void clickOnRegistrySendDataAndClickSearchBtn() {
        registryButton.click();
        sleepFor(2);
        registrantNameBar.sendKeys("Shadman");
        sleepFor(2);
        searchBtn.click();
        sleepFor(2);
        Assert.assertTrue(weddingRegistry.isDisplayed());
        ExtentTestManager.log("Verified That-Please select a registry or gift list type-alert is displayed");
    }

    public void clickOnNewYearNewYou() {
        shopNewYearNewYou.click();
        ExtentTestManager.log("clicked on Shop New Year, new You");
    }

    public void clickOnwHoleFoodsMouseHoverWholeFoodsAndClickPrime() {
        wholeFoodsBtn.click();
        mouseHover(wholeFoodsMarket);
        sleepFor(2);
        primeBlueLogo.click();
        sleepFor(2);
        Assert.assertTrue(seeInStoreDeals.isDisplayed());
        ExtentTestManager.log("Verified That-See in-store deals is displayed");
    }

    public void scrollDownToEndOfThePage() {
        scroll(learnMore);
        ExtentTestManager.log("scrolled down to learn more");
        sleepFor(4);
        learnMore.click();
        ExtentTestManager.log("Clicked on learn more");

    }

    public void scrollDownToCareersOnFooter() {
        scroll(careersOnFooter);
        sleepFor(5);
        try {
            screenShot();
        } catch (IOException e) {
            e.printStackTrace();
        }
        ExtentTestManager.log("scroll down to careers on footer");

    }


}
