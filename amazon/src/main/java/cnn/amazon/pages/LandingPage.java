package cnn.amazon.pages;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import pnt.automation.base.TestBase;
import pnt.automation.extent.ExtentTestManager;


public class LandingPage extends TestBase {

    @FindBy(xpath = "(//span[@class='nav-line-1'])[3]")
    private WebElement actAndList;

    @FindBy(xpath = "(//span[@class='nav-action-inner'])[1]")
    private WebElement signIn;

    @FindBy(xpath = "//input[@id='twotabsearchtextbox']")
    private WebElement searchBar;

    @FindBy(xpath = "//span[@id='nav-search-submit-text']")
    private WebElement searchButton;

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

    @FindBy(xpath = "//a[text()='Registry']")
    private WebElement registryButton;

    @FindBy(xpath = "//input[@name='name']")
    private WebElement registrantNameBar;

    @FindBy(css = "[id='a-autoid-0-announce']")
    private WebElement selectRegistryTab;

    @FindBy(xpath = "//a[@id='dropdown1_1']")
    private WebElement babyRegistry;

    @FindBy(xpath = "//button[@aria-label='Search']")
    private WebElement searchBtn;

    @FindBy(xpath = "gr-find-stripe__alert--searchUrl")
    private WebElement redTextAlert;

    @FindBy(xpath = "//a[text()='Whole Foods']")
    private WebElement wholeFoodsBtn;

    @FindBy(xpath = "//img[@alt='Whole Foods']")
    private WebElement wholeFoodsMarket;

    @FindBy(xpath = "//img[@alt='Whole Foods Benefits']")
    private WebElement primeBlueLogo;

    @FindBy(xpath = "//a[@aria-label='Shop deals']")
    private WebElement seeInStoreDeals;

    @FindBy(xpath = "(//a[@class='a-button-text'])[2]")
    private WebElement signIntoPersonalizedRecommendations;
//
//    @FindBy(xpath = "")
//    private WebElement;


    public void mouseHoverActAndList() {
        mouseHover(actAndList);
        Assert.assertTrue(signIn.isDisplayed());
    }

    public void searchForItems() {
        searchBar.sendKeys("shark vacuum");
        searchButton.click();
        Assert.assertTrue(driver.getCurrentUrl().contains("https://www.amazon.com/s?k=dog+toys"));

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
    }

    public void clickOnGitCardButton() {
        giftCards.click();
        sleepFor(2);
        Assert.assertTrue(birthday.isDisplayed());
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
        Assert.assertTrue(redTextAlert.isDisplayed());
        ExtentTestManager.log("Verified That-Please select a registry or gift list type-alert is displayed");


    }

    public void clickOnwHoleFoodsMouseHoverWholeFoodsAndClickPrime(){
        wholeFoodsBtn.click();
        mouseHover(wholeFoodsMarket);
        sleepFor(2);
        primeBlueLogo.click();
        sleepFor(2);
        Assert.assertTrue(seeInStoreDeals.isDisplayed());
        ExtentTestManager.log("Verified That-See in-store deals is displayed");
    }

    public void scrollDownToEndOfThePage(){
        signIntoPersonalizedRecommendations.click();
    }


}
