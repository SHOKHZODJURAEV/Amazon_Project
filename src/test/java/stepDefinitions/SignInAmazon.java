package stepDefinitions;

import io.cucumber.java.en.*;
import org.openqa.selenium.interactions.Actions;
import pages.HomePage;
import pages.SignInPage;
import utilities.ConfigReader;
import utilities.Driver;

import javax.swing.*;

import static org.junit.Assert.assertEquals;

public class SignInAmazon {



    HomePage loginSign = new HomePage();


   @Given("user go to the login page")
    public void user_go_to_the_login_page() {

       Driver.getDriver().get(ConfigReader.read("amazonUrl"));
    }

    @Given("user click the sign in button")
    public void user_click_the_sign_in_button() {


        Actions actions = new Actions(Driver.getDriver());
        actions.moveToElement(loginSign.HowerOverSignIn)
                .perform();

        loginSign.SignIn.click();

    }

    @When("user provide invalid {string} click continue")
    public void userProvideInvalidClickContinue(String email) {

        SignInPage provideEmail = new SignInPage();
        provideEmail.login(email);

        provideEmail.submitButton.click();

    }

    @Then("confirm box with a problem")
    public void confirm_box_with_a_problem() {

       SignInPage errorConfirm = new SignInPage();

        assertEquals("There was a problem", errorConfirm.ErrorMessage.getText());



    }



}
