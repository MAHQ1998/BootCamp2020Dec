package cnn.citibank;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import pnt.automation.base.TestBase;
import pnt.automation.extent.ExtentTestManager;

public class HomePageCNN extends TestBase {
    @FindBy(xpath = "//a[@id='creditcards']")
    public WebElement creditCards;

    @FindBy(xpath = "(//a[text()='Travel Credit Cards'])[1]")
    public WebElement travelCreditCards;

    @FindBy(xpath = "//a[@aria-label='Travel Credit Cards']")
    public WebElement travel;

    @FindBy(xpath = "//a[@id='banking']")
    public WebElement banking;

    @FindBy(xpath = "//a[text()='Savings']")
    public WebElement savingsOnBanking;

    @FindBy(xpath = "(//button[@type='submit'])[2]")
    public WebElement submitButton;

    @FindBy(xpath = "(//a[text()='Buying a Home'])[5]")
    public WebElement buyingHome;

    @FindBy(xpath = "//a[@id='lending']")
    public WebElement lending;

    @FindBy(xpath = "//a[text()='Go to home affordability calculator ']")
    public WebElement homeAffCalculator;

    @FindBy(xpath = "//input[@id='loanAmount']")
    public WebElement loanAmountTab;

    @FindBy(xpath = "//input[@id='interestRate']")
    public WebElement interestRate;

    @FindBy(xpath = "//select[@id='years']")
    public WebElement selectYears;

    @FindBy(xpath = "//select[@id='paymentFrequency']")
    public WebElement paymentFreq;

    @FindBy(xpath = "(//a[text()='Start Your Application'])[3]")
    public WebElement refinancingApplication;


    @FindBy(xpath = "//a[@id='investing']")
    public WebElement investing;

    @FindBy(xpath = "//a[@id='citigoldli']")
    public WebElement WealthManagement;

    @FindBy(xpath = "//li[@id='openAnAccount']")
    public WebElement openAnAccount;

    @FindBy(xpath = "(//span[text()='How can we help?'])[1]")
    public WebElement howCanWeHelp;

    @FindBy(xpath = "(//img[@alt='Search'])[1]")
    public WebElement searchIcon;


    @FindBy(xpath = "//a[@id='lending_mortcalc']")
    public WebElement mortgageCalculator;


    public void clickOnCreditCards() {
        creditCards.click();
        sleepFor(2);
        String currentUrl = TestBase.driver.getCurrentUrl();
        String expectedUrl = "https://online.citi.com/US/login.do";
        Assert.assertTrue(currentUrl.contains(expectedUrl));
        ExtentTestManager.log("Verified The Url is accurate");


    }

    public void mouseHoverTravelCreditCardsAndClick() {
        creditCards.click();
        sleepFor(2);
        mouseHover(travelCreditCards);
        sleepFor(2);
        travelCreditCards.click();
        sleepFor(5);
        Assert.assertTrue(travel.isDisplayed());
        ExtentTestManager.log("Verified Travel button is displayed");


    }

    public void clickOnSavingsUnderBanking() {
        banking.click();
        sleepFor(2);
        mouseHover(savingsOnBanking);
        sleepFor(2);
        savingsOnBanking.click();
        sleepFor(2);
        Assert.assertTrue(submitButton.isDisplayed());
        ExtentTestManager.log("submit button displayed");

    }

    public void clickOnMortgageCalculatorUnderLending() {
        lending.click();
        sleepFor(2);
        mortgageCalculator.click();
        sleepFor(2);
        Assert.assertTrue(buyingHome.isDisplayed());
        ExtentTestManager.log("buying home button is displayed");


    }

    public void doMortgageCalculationUnderLending() {
        lending.click();
        sleepFor(2);
        mortgageCalculator.click();
        sleepFor(2);
        homeAffCalculator.click();
        loanAmountTab.click();
        loanAmountTab.clear();
        loanAmountTab.sendKeys("300,000");
        interestRate.click();
        interestRate.clear();
        interestRate.sendKeys("3");
        selectInList(selectYears).selectByIndex(20);
        selectInList(paymentFreq).selectByVisibleText("Monthly");
        refinancingApplication.click();

        String currentUrl = TestBase.driver.getCurrentUrl();
        String expectedUrl = " https://online.citi.com/US/JRS/portal/template.do?ID=mortgage_refinance_omr&JFP_TOKEN=PEUT65FQ";
        Assert.assertTrue(currentUrl.contains(expectedUrl));
        ExtentTestManager.log("Verified The Url is accurate");


    }
}
