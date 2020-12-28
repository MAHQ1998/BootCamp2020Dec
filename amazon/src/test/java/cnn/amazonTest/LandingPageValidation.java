package cnn.amazonTest;

import cnn.amazon.pages.LandingPage;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pnt.automation.base.TestBase;

public class LandingPageValidation extends TestBase{

    LandingPage landingPage;

    @BeforeMethod
    public void setUpObjects() {
        landingPage = PageFactory.initElements(driver, LandingPage.class);
    }

    @Test(enabled = true)
    public void validateUserCanMouseHoverSignIn(){
        landingPage.mouseHoverActAndList();
    }

    @Test(enabled = true)
    public void validateUserBeingAbleToSearchForItems(){
        landingPage.searchForItems();
    }

    @Test(enabled =true)
    public void validateUserBeingAbleToSelectDepartmentUnderAllDepartmentsButton(){
        landingPage.searchForItems();
    }

    @Test(enabled = true)
    public void validateUserBeingAbleToClickOnSignInButtonUnderAccountsAndLists(){
        landingPage.clickOnSignInButtonUnderAccountsAndLists();
    }
    @Test(enabled = true)
    public void validateUserBeingAbleToClickOnGiftCardsUnderAmazonLogo(){
        landingPage.clickOnGitCardButton();
    }

    @Test(enabled = true)
    public void validateUserBeingAbleMouseHoverAndClickOnWatchList(){
        landingPage.mouseHoverAccountAndListAndClickOnWatchList();
    }

    @Test(enabled = true)
    public void validateUserBeingAbleToClickBabyRegistryUnderRegistryButton(){
        landingPage.clickOnRegistrySendDataAndClickSearchBtn();

    }

    @Test(enabled = true)
    public void validateUserBeingAbleToPrimeLogoUnderWholeFoods(){
        landingPage.clickOnwHoleFoodsMouseHoverWholeFoodsAndClickPrime();
    }
    @Test(enabled = true)
    public void validateUserBeingAbleToClickOnSignInToSeePersonalizedBtnBottomOfThePage(){
        landingPage.scrollDownToEndOfThePage();

    }
}
