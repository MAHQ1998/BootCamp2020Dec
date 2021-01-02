package pages;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pnt.automation.base.TestBase;

public class HomePageValidation extends TestBase {
    HomePage homePage;

    @BeforeMethod
    public void setUpObjects() {
        homePage = PageFactory.initElements(driver, HomePage.class);
    }

    @Test(enabled = true)
    public void validateUserBeingAbleToClickOnCreditCards() {
        homePage.clickOnCreditCards();
    }

    @Test(enabled = true)
    public void validateUserBeingAbleToMouseHoverTravelCreditCardsAndClick() {
        homePage.mouseHoverTravelCreditCardsAndClick();
    }

    @Test(enabled = true)
    public void validateUserBeingAbleToClickOnSavingsUnderBanking() {
        homePage.clickOnSavingsUnderBanking();
    }

    @Test(enabled = true)
    public void validateUserBeingAbleToClickOnMortgageCalculatorUnderLending() {
        homePage.clickOnMortgageCalculatorUnderLending();
    }

    @Test(enabled = true)
    public void validateUserBeingAbleToDoMortgageCalculationUnderLending() {
        homePage.doMortgageCalculationUnderLending();
    }

    @Test(enabled = true)
    public void ValidateUserBeingAbleToClickOnInvesting() {
        homePage.clickOnInvesting();
    }

    @Test(enabled = true)
    public void ValidateUserBeingAbleToClickedOnWealthManagement() {
        homePage.clickedOnWealthManagement();

    }

    @Test(enabled = true)
    public void ValidateUserBeingAbleToClickedOnOpenAnAccount() {
        homePage.clickedOnOpenAnAccount();

    }

    @Test(enabled = true)
    public void ValidateUserBeingAbleToClickOnHowCanWeHelpAndProvideDataAndClickOnSearch() {
        homePage.clickOnHowCanWeHelpAndProvideData();
    }


}
