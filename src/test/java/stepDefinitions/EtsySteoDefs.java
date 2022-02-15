package stepDefinitions;

import io.cucumber.java.en.*;
import org.openqa.selenium.WebElement;
import pages.EtsyWindowsHandle;
import utilities.Browser_Util;
import utilities.ConfigReader;
import utilities.Driver;

import java.util.Set;

public class EtsySteoDefs {

    EtsyWindowsHandle ElementHandle = new EtsyWindowsHandle();

    @Given("user navigates to Etsy.com webpage")
    public void user_navigates_to_etsy_com_webpage() {

        Driver.getDriver().get(ConfigReader.read("etsyUrl"));
        Browser_Util.waitFor(2);

    }
    @When("user scrolls down element on the down of the webpage")
    public void user_scrolls_down_element_on_the_down_of_the_webpage() {

        ElementHandle.scroll();

    }
    @When("user clicks each elements to open new window")
    public void user_clicks_each_elements_to_open_new_window() {


       for (WebElement each: ElementHandle.listOfIcons){
           each.click();
       }

     //   String currentWindow = Driver.getDriver().getWindowHandle(); // etsy
        Set<String> windows = Driver.getDriver().getWindowHandles();
        for (String handle : windows){
                Driver.getDriver().switchTo().window(handle);
            }
        }

    @Then("user should able to switch windows and get title of each elements")
    public void user_should_able_to_switch_windows_and_get_title_of_each_elements() {



    }









}
