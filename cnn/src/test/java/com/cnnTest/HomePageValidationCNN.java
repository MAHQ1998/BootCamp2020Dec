package com.cnnTest;

import com.cnn.HomePageCNN;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pnt.automation.base.TestBase;

public class HomePageValidationCNN extends TestBase {
   HomePageCNN homepageCNN;
    @BeforeMethod
    public void setUpObjects() {
        homepageCNN = PageFactory.initElements(driver, HomePageCNN.class);
    }

    @Test
    public void validateUserBeingAbleToClickOnUS(){
        homepageCNN.clickOnUsButton();
    }
    @Test
    public void validateUserBeingAbleToClickOnWorldButton(){
        homepageCNN.clickOnWorldButton();
    }
    @Test
    public void validateUserBeingAbleToClickOnPoliticsButton(){
        homepageCNN.clickOnPoliticsButton();

    }
    @Test
    public void validateUserBeingAbleToClickOnHealthButton(){
        homepageCNN.clickOnHealth();

    }
    @Test
    public void validateUserBeingAbleToClickOn(){

    }


}
