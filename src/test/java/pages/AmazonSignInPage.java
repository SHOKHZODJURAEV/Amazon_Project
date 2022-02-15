package pages;

import io.cucumber.java.bs.A;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class AmazonSignInPage {


    public AmazonSignInPage(){

PageFactory.initElements(Driver.getDriver(), this);
}


    @FindBy(xpath = "//span[@id='nav-link-accountList-nav-line-1']")
    public WebElement signIn;

    @FindBy(xpath = "//input [@type='email']")
    public WebElement userName_inputBox;

    @FindBy(xpath = "//input[@id='continue']")
    public WebElement continueBtn;

    @FindBy(xpath = "//input[@id='ap_password']")
    public WebElement password_inputBox;

    @FindBy(xpath = "//input[@id='signInSubmit']")
    public WebElement signInBtn;

    @FindBy(id = "nav-link-accountList-nav-line-1")
    public WebElement loginVerification;


    public void loginCred(String username, String password){

        userName_inputBox.sendKeys(username);
        continueBtn.click();
        password_inputBox.sendKeys(password);
        signInBtn.click();






    }





}
