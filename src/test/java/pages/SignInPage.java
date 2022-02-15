package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class SignInPage {


    public SignInPage(){

        PageFactory.initElements(Driver.getDriver(),this);


    }

    @FindBy(xpath = "//input [@type='email']")
    public WebElement EmailUsername;

    @FindBy(xpath = "//input [@type='submit']")
    public WebElement submitButton;

    @FindBy(xpath = "//h4[@class='a-alert-heading']")
    public WebElement ErrorMessage;



    public void login(String email){

        EmailUsername.sendKeys(email);

    }



}
