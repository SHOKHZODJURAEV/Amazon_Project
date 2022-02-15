package stepDefinitions;

import io.cucumber.java.en.*;
import pages.AmazonSignInPage;
import utilities.Browser_Util;
import utilities.ConfigReader;
import utilities.Driver;

import static org.junit.Assert.assertEquals;

public class StepDefAmazon {


    AmazonSignInPage amazonObj = new AmazonSignInPage();


    @Given("user navigates to the Amazon webpage")
    public void user_navigates_to_the_amazon_webpage() {
        Driver.getDriver().get(ConfigReader.read("amazonUrl"));

    }
    @When("user click on the sign in button")
    public void user_click_on_the_sign_in_button() {

        amazonObj.signIn.click();

    }
    @When("user provide correct username {string} and password {string}")
    public void user_provide_correct_username_and_password(String username, String password) {


        amazonObj.loginCred(username, password);


    }
    @Then("verify user logged in successfully {string}")
    public void verify_user_logged_in_successfully(String expactedResult) {

        assertEquals(expactedResult, amazonObj.loginVerification.getText());


    }






}
