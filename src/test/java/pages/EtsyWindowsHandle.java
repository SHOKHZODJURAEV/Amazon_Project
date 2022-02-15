package pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.util.List;

public class EtsyWindowsHandle {


  public  EtsyWindowsHandle(){

        PageFactory.initElements(Driver.getDriver(), this);

    }

    @FindBy(xpath = "fiveIcons = //a[@class='wt-btn wt-btn--transparent wt-btn--transparent-flush-left wt-btn--light wt-btn--icon wt-p-xs-1']")
    public List<WebElement> listOfIcons;

    @FindBy(xpath = "//span[.='Impact']")
    public WebElement impactElement;
    
    @FindBy(xpath = "(//span[@class='etsy-icon wt-icon--larger'])[1]")
    public WebElement instagram;


    public void scroll() {
        JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();
        js.executeScript("arguments[0].scrollIntoView();", impactElement);
    }









}
