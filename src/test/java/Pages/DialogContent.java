package Pages;

import Utilities.GWD;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

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

        }
        clickFunction(myElement);

    }

    public void findAndContainText(String strElement, String text) {

        switch (strElement) {
            case "assertText": myElement = assertText;break;

        }
        verifyContainsText(myElement, text);


    }

}

