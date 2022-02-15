package pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import utilities.Browser_Util;
import utilities.Driver;
import java.util.List;

public class EtsyHomePage {


  public EtsyHomePage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//span[@class='select motors-finder-menu']/select")
    public List<WebElement> dropDownLst;

    @FindBy(xpath = "//input[@class='textbox__control']")
    public WebElement zipCode;

    @FindBy(xpath = "//*[@id=\"s0-27_1-9-0-1[0]-0-1-2-14[0[0]]\"]")
    public WebElement FindVehicle;




        public void chooseDropDown(String makes, String modules, String NewAndUsed, String zipNumber){
            Select allMakes = new Select(dropDownLst.get(0));
            Select allModules = new Select(dropDownLst.get(1));
            Select newAndUsed = new Select(dropDownLst.get(2));


            allMakes.selectByValue(makes);
            Browser_Util.waitFor(3);
            allModules.selectByValue(modules);
            Browser_Util.waitFor(2);
            newAndUsed.selectByVisibleText(NewAndUsed);
            Browser_Util.waitFor(2);


            Actions deleteZip = new Actions(Driver.getDriver());

            deleteZip.click(zipCode).pause(2000).keyDown(Keys.COMMAND).
                    sendKeys("A").keyUp(Keys.COMMAND)
                    .sendKeys(Keys.BACK_SPACE).sendKeys(Keys.UP).sendKeys(zipNumber).perform();


        }
}
