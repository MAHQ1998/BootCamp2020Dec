package com.cignaTest;

import com.cigna.CignaHomePage;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pnt.automation.base.TestBase;

public class CignaHomPageValidation extends TestBase {
    CignaHomePage cignaHomePage;
    @BeforeMethod
    public void setUpObjects() {
        cignaHomePage = PageFactory.initElements(driver, CignaHomePage.class);
    }

    @Test
    public void validateUserBeingAbleToMouseHoverIndividualsAndFamiliesAndHealthAndWellness(){
        cignaHomePage.mouseHoverIndividualsAndFamiliesAndHealthAndWellness();

    }
    @Test
    public void validateUserBeingAbleToClickOnMedicare(){
        cignaHomePage.clickOnMedicare();
    }
    @Test
    public void validateUserBeingAbleToMouseHoverEmployersAndBrokersAndClickOnBecomeABroker(){
        cignaHomePage.mouseHoverEmployersAndBrokersAndClickOnBecomeABroker();

    }
    @Test
    public void validateUserBeingAbleToMouseHoverAboutUsAndClickOnSupplierCommunity(){
        cignaHomePage.mouseHoverAboutUsAndClickOnSupplierCommunity();

    }
    @Test
    public void validateUserBeingAbleToClickOnLogInAndProvideDataOnCustomerLogIn(){
        cignaHomePage.clickOnLogInAndProvideDataOnCustomerLogIn();

    }

}
