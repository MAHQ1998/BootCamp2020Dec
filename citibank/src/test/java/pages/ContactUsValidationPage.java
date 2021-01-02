package pages;

import org.junit.Before;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pnt.automation.base.TestBase;

public class ContactUsValidationPage extends TestBase {
    HomePage homePage;
    ContactUsPage contactUsPage;

    @BeforeMethod
    public void setUpPages(){
        homePage= PageFactory.initElements(driver,HomePage.class);
        contactUsPage=PageFactory.initElements(driver,ContactUsPage.class);
    }
    @Test(enabled = false)
    public void validateUserBeingAbleToClickOnContactUsOnFooter(){
        homePage.clickOnContactUsOnFooter();
    }

    @Test
    public void validateUserBeingAbleToClickOnViewBankAccountRateAndProvideZipCode(){
        homePage.clickOnContactUsOnFooter();
        contactUsPage.clickOnViewBankAccountRateAndProvideZipCode();
    }




}
