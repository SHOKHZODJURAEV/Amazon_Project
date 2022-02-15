package stepDefinitions;
import io.cucumber.java.en.*;
import pages.EtsyWindowsHandle;
import utilities.Browser_Util;
import utilities.ConfigReader;
import utilities.Driver;

import java.util.Set;

public class PracticeEtsySteps {

    EtsyWindowsHandle elementHandle = new EtsyWindowsHandle();

    @Given("Login Etsy page")
    public void login_etsy_page() {

        Driver.getDriver().get(ConfigReader.read("etsyUrl"));
        Browser_Util.waitFor(2);
    }
    @When("Scroll down at the end")
    public void scroll_down_at_the_end() {
        elementHandle.scroll();

        Browser_Util.waitFor(5);

    }
    @Then("Verify current page")
    public void verify_current_page() {

        elementHandle.instagram.click();
        Browser_Util.waitFor(2);

//        String currentWindow = Driver.getDriver().getWindowHandle();
//
//        Driver.getDriver().switchTo().window(currentWindow);

        Set<String> windows = Driver.getDriver().getWindowHandles();

        for (String handle : windows){
            Driver.getDriver().switchTo().window(handle);
        }

        Browser_Util.waitFor(5);

        System.out.println(Driver.getDriver().getTitle());
        Browser_Util.waitFor(4);


    }






}
