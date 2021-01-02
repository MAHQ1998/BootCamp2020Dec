package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pnt.automation.base.TestBase;

public class ContactUsPage extends TestBase {
    @FindBy(xpath = "(//p[text()='View Bank Account Rates'])[1]")
    private WebElement viewAccountBankAccountsRate;

    @FindBy(xpath = "//input[@id='zipcode']")
    private WebElement zipcodeLabel;

    @FindBy(xpath = "(//button[text()='Submit'])[1]")
    private WebElement submitButton;


    public void clickOnViewBankAccountRateAndProvideZipCode(){
        viewAccountBankAccountsRate.click();
        sleepFor(2);
        zipcodeLabel.sendKeys("11372");
        submitButton.click();

    }




























}



















