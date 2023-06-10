package StepDefinitions;

import Pages.DialogContent;
import Pages.LeftListNav;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebElement;

public class ProductAddSteps {
    LeftListNav at = new LeftListNav();

    @And("Navigate Departments")
    public void navigateDepartments() {
        at.findAndClick("navleft");

    }

    @When("Select Department Find Product Add")
    public void selectDepartmentFindProductAdd() {
        at.rndmSelectProduct("randomAllCategories");
        at.findAndClick("searchButton");
        at.productListSelectRandom("productListSelect");
    }

    @Then("Success message should be displayed")
    public void successMessageShouldBeDisplayed() {
        at.findAndContainText2("assertText2", "Sepete Eklendi");

    }

    @Then("Add product to cart")
    public void addProductToCart() {
        at.findAndClick("sepeteEkle");
    }
}
