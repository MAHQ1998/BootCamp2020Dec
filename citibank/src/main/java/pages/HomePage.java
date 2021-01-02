package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import pnt.automation.base.TestBase;
import pnt.automation.extent.ExtentTestManager;

public class HomePage extends TestBase {
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

    @FindBy(xpath = "//input[@id='downPayment']")
    public WebElement downPayment;


    @FindBy(xpath = "//input[@id='grossAnnualIncome']")
    public WebElement grossAnnualIncome;

    @FindBy(xpath = "//input[@id='monthlyExpenses']")
    public WebElement monthlyExpenses;
    @FindBy(xpath = "//select[@id='years']")
    public WebElement selectYears;
    @FindBy(xpath = "//a[text()='Start Your Application']")
    public WebElement startYourApplication;
    @FindBy(xpath = "//select[@id='paymentFrequency']")
    public WebElement paymentFreq;
    @FindBy(xpath = "//h1[text()='Start Your Purchase Application']")
    public WebElement startYourPurchaseApplication;
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
    @FindBy(id = "citi-autocomplete-content-searchbox-livesearch")
    private WebElement helpSearchBarToText;
    @FindBy(xpath = "//button[@aria-label='submit search result']")
    private WebElement searchTabToGetHelp;
    @FindBy(id="cxcmarketing_zelle-label")
    private WebElement whatIsZelle;
    @FindBy(xpath = "//input[@id='interestRate']")
    private WebElement interestRate;


    @FindBy(xpath = "(//a[text()='Contact Us'])[2]")
    private WebElement contactUsOnFooter;
    @FindBy(xpath = "//h3[text()='Most Helpful FAQs']")
    private WebElement mostHelpfulFaqs;


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
        downPayment.click();
        downPayment.clear();
        downPayment.sendKeys("50000");
        sleepFor(2);
        ExtentTestManager.log("Clicked down payment, clear, and send new data");
        grossAnnualIncome.click();
        grossAnnualIncome.clear();
        grossAnnualIncome.sendKeys("100000");
        sleepFor(2);
        ExtentTestManager.log("Clicked gross annual income, clear, and send new data");
        monthlyExpenses.click();
        monthlyExpenses.clear();
        monthlyExpenses.sendKeys("1200");
        sleepFor(2);
        ExtentTestManager.log("Clicked monthly expenses, clear, and send new data");
        interestRate.click();
        interestRate.clear();
        interestRate.sendKeys("3.25");
        sleepFor(2);
        ExtentTestManager.log("Clicked interest Rate, clear, and send new data");
        selectInList(selectYears).selectByVisibleText("20");
        sleepFor(2);
        ExtentTestManager.log("Clicked select year, ans select year from dropdown");
        startYourApplication.click();
        ExtentTestManager.log("clicked on start your application");
        sleepFor(2);
        Assert.assertTrue(startYourPurchaseApplication.isDisplayed());
        ExtentTestManager.log("start your purchase application text displayed");
    }

    public void clickOnInvesting() {
        investing.click();
        ExtentTestManager.log("clicked on Investing");
    }

    public void clickedOnWealthManagement() {
        WealthManagement.click();
        ExtentTestManager.log("clicked on open an account");
    }

    public void clickedOnOpenAnAccount() {
        openAnAccount.click();
        ExtentTestManager.log("clicked on wealth Management");
    }

    public void clickOnHowCanWeHelpAndProvideData() {
        howCanWeHelp.click();
        ExtentTestManager.log("clicked on how can we help");
        helpSearchBarToText.sendKeys("how Zelle works?");
        sleepFor(2);
        searchTabToGetHelp.click();
        Assert.assertTrue(whatIsZelle.isDisplayed());
        ExtentTestManager.log("what is zelle text is displayed");

    }

    public void clickOnContactUsOnFooter() {
        contactUsOnFooter.click();
        Assert.assertTrue(mostHelpfulFaqs.isDisplayed());
        ExtentTestManager.log("Most Helpful Faqs is displayed");
    }


}
