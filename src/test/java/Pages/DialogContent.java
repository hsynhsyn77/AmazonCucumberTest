package Pages;

import Utilities.GWD;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class DialogContent extends Parent {
    public DialogContent() {
        PageFactory.initElements(GWD.getDriver(), this);
    }

    @FindBy(xpath = "//*[@class='nav-line-2 ']")
    public WebElement signbutton;

    @FindBy(id = "ap_email")
    private WebElement usermailInput;

    @FindBy(id = "continue")
    public WebElement continuebutton;

    @FindBy(id = "ap_password")
    private WebElement passwordInput;

    @FindBy(id = "signInSubmit")
    public WebElement signInbutton;

    @FindBy(xpath = "//span[contains(text(),'Alıcı: HÜSEYİN')]")
    public WebElement assertText;

    @FindBy(xpath = "(//span[@class='nav-line-2'])[2]")
    public WebElement goToCart;

    @FindBy(xpath = "//input[@value='Sil']")
    public WebElement productDelete;

    @FindBy(xpath = "//h1[@class='a-spacing-mini a-spacing-top-base']")
    public WebElement assertText3;



    WebElement myElement;

    public void findAndSend(String strElement, String value) {

        switch (strElement) {
            case "usermailInput": myElement = usermailInput;break;
            case "passwordInput": myElement = passwordInput;break;
        }
        sendKeysFunction(myElement, value);

    }

    public void findAndClick(String strElement) {

        switch (strElement) {
            case "signbutton": myElement = signbutton;break;
            case "continuebutton": myElement = continuebutton;break;
            case "signInbutton": myElement = signInbutton;break;
            case "goToCart": myElement = goToCart;break;



        }
        scrollToElement(myElement);



    }

    public void findAndContainText(String strElement, String text) {

        switch (strElement) {
            case "assertText": myElement = assertText;break;
            case"assertext3":myElement=assertText3;break;

        }
        verifyContainsText(myElement, text);


    }
    public void delectProductList(String strElement){
        switch (strElement) {
            case "productDelete": myElement = productDelete;break;

        }
        deleteProduct();




    }




}


