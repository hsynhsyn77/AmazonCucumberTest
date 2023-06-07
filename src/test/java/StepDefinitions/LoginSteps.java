package StepDefinitions;

import Pages.DialogContent;
import Utilities.GWD;
import io.cucumber.java.en.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;


public class LoginSteps {
    DialogContent dc = new DialogContent();

    @Given("Navigate to Amazon")
    public void navigateToAmazon() {
        GWD.getDriver().get("https://www.amazon.com.tr/");
        GWD.getDriver().manage().window().maximize();
    }

    @When("Enter username and Password and click login button")
    public void enterUsernameAndPasswordAndClickLoginButton() {

        dc.findAndClick("signbutton");
        dc.findAndSend("usermailInput", "hsyn_hsyn77@hotmail.com");
        dc.findAndClick("continuebutton");
        dc.findAndSend("passwordInput", "Se23852385");
        dc.findAndClick("signInbutton");

    }

    @Then("User should login successfuly")
    public void userShouldLoginSuccessfuly() {
        dc.findAndContainText("assertText", "Alıcı: HÜSEYİN");


    }
}
