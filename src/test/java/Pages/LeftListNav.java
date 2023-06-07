package Pages;

import Utilities.GWD;
import io.cucumber.java.zh_cn.假如;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class LeftListNav extends Parent {

    public LeftListNav() {
        PageFactory.initElements(GWD.getDriver(), this);
    }

    @FindBy(id = "nav-search-dropdown-card")
    public WebElement navleft;

    @FindBy(xpath = "//*[@id='searchDropdownBox']//option")
    public WebElement randomAllCategories;

    @FindBy(id = "nav-search-submit-button")
    public WebElement searchButton;

    @FindBy(xpath = "//span[contains(text(),'Alıcı: HÜSEYİN')]")
    public WebElement assertText;

    @FindBy(xpath = "//span[text()=' Güvenli işlem ']")
    public WebElement assertTextProduct;

    @FindBy(xpath = "//div[@class='a-section a-spacing-none a-spacing-top-small s-title-instructions-style']")
    public WebElement productListSelect;


    WebElement myElement;

    public void findAndClick(String strElement) {

        switch (strElement) {

            case "navleft": myElement = navleft;break;
            case "searchButton": myElement = searchButton;break;

        }

        scrollToElement(myElement);

    }

    public void rndmSelectProduct(String strElement) {

        switch (strElement) {

            case "randomAllCategories": myElement = randomAllCategories;break;

        }

        randomSelectProduct();

    }

    public void findAndContainText(String strElement, String text) {

        switch (strElement) {
            case "assertText": myElement = assertText;break;
        }
        verifyContainsText(myElement, text);


    }
    public void findAndContainText2(String strElement, String text) {

        switch (strElement) {
            case "assertTextProduct": myElement = assertTextProduct;break;
        }
        verifyContainsText(myElement, text);


    }

    public void productListSelectRandom(String strElement) {
        switch (strElement) {

            case "productListSelect": myElement = productListSelect;break;

        }

        randomSelectProduct2();

    }

}






