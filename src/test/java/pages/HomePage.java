package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class HomePage {


    public HomePage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//span[@class='nav-action-inner' and text()='Sign in']")
    public WebElement SignIn;

    @FindBy(xpath = "//span[@id='nav-link-accountList-nav-line-1']")
    public WebElement HowerOverSignIn;


}
