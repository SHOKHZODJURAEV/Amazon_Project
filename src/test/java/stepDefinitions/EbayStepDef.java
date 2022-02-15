package stepDefinitions;

import io.cucumber.java.en.*;
import org.junit.Assert;
import org.openqa.selenium.support.ui.Select;
import pages.EtsyHomePage;
import pages.HomePage;
import utilities.Browser_Util;
import utilities.ConfigReader;
import utilities.Driver;

import static org.junit.Assert.assertTrue;

public class EbayStepDef {

   EtsyHomePage homePage = new EtsyHomePage();




    @Given("user on the cars and truck page")
    public void user_on_the_cars_and_truck_page() {
        Driver.getDriver().get(ConfigReader.read("ebayCarsAndTruck"));
        Browser_Util.waitFor(2);
    }
    @Given("on the filter section we need to fill the information")
    public void on_the_filter_section_we_need_to_fill_the_information() {

    homePage.chooseDropDown("BMW", "X6", "Used", "11229");

//    Browser_Util.waitFor(2);
  //  homePage.zipCode.sendKeys("11229");
    Browser_Util.waitFor(2);

    }
    @Given("click Find Vehicle button")
    public void click_find_vehicle_button() {

     homePage.FindVehicle.click();
     Browser_Util.waitFor(2);

    }
    @Then("verify page Title contains BMW")
    public void verify_page_title_contains_bmw() {



     assertTrue(Driver.getDriver().getTitle().toLowerCase().contains("bmw"));

    }






}
