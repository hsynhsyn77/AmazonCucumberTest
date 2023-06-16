package StepDefinitions;

import Pages.DialogContent;
import Pages.LeftListNav;
import Utilities.GWD;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class ProductAddSteps {
    LeftListNav at = new LeftListNav();
    DialogContent dc = new DialogContent();

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
        //at.findAndContainText2("assertText2", "Sepete Eklendi");
        dc.findAndContainText("assertText3", "  Amazon sepetiniz boş.");

    }

    @And("Add product to cart")
    public void addProductToCart() {
        at.findAndClick("sepeteEkle");
        dc.findAndClick("goToCart");
    }

    @When("Go to cart and delete product")
    public void goToCartAndDeleteProduct() {
        dc.delectProductList("productDelete");

        }





    }





