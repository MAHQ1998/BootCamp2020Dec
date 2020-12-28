package cnn.citiBankTest;

import cnn.citibank.HomePageCNN;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pnt.automation.base.TestBase;

public class HomePageValidation extends TestBase {
    HomePageCNN homePage;

    @BeforeMethod
    public void setUpObjects() {
        homePage = PageFactory.initElements(driver, HomePageCNN.class);
    }
    @Test(enabled = false)
    public void validateUserBeingAbleToClickOnCreditCards(){
        homePage.clickOnCreditCards();
    }
    @Test(enabled = false)
    public void validateUserBeingAbleToMouseHoverTravelCreditCardsAndClick(){
        homePage.mouseHoverTravelCreditCardsAndClick();
    }
    @Test(enabled = false)
    public void validateUserBeingAbleToClickOnSavingsUnderBanking(){
        homePage.clickOnSavingsUnderBanking();
    }
    @Test(enabled = false)
    public void validateUserBeingAbleToClickOnMortgageCalculatorUnderLending(){
        homePage.clickOnMortgageCalculatorUnderLending();
    }
    @Test(enabled = false)
    public void validateUserBeingAbleToDoMortgageCalculationUnderLending(){
        homePage.doMortgageCalculationUnderLending();

    }

}
