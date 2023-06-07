package Pages;

import Utilities.GWD;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;
import java.util.List;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

import static Utilities.GWD.generateRandomNumber;
import static Utilities.GWD.getRandomNumberInBetween;
import static java.util.Collections.list;

public class Parent {
    public void sendKeysFunction(WebElement element, String value) {

        //waitUntilVisible(element);//gözükene kadar bekleme yapma
        //scrollToElement(element); //elemnte scroll yap
        //element.clear();//kutucuğu temizleme
        element.sendKeys(value);//değer gönderme

    }

    public void waitUntilVisible(WebElement element) {
        WebDriverWait wait = new WebDriverWait(GWD.getDriver(), Duration.ofSeconds(30));
        wait.until(ExpectedConditions.visibilityOf(element));
    }

    public void scrollToElement(WebElement element) {
        //JavascriptExecutor js = (JavascriptExecutor) GWD.getDriver();
        //js.executeScript("arguments[0].scrollIntView();", element);
        element.click();

    }

    public void clickFunction(WebElement element) {
        waitUntilClickable(element);//tıklanabliri olana kadar bekleme
        waitUntilVisible(element);//elementte scroll yap
        scrollToElement(element);//click yap
    }

    public void waitUntilClickable(WebElement element) {
        WebDriverWait wait = new WebDriverWait(GWD.getDriver(), Duration.ofSeconds(30));
        wait.until(ExpectedConditions.elementToBeClickable(element));
    }

    public void verifyContainsText(WebElement element, String text) {
        waitUntilVisible(element);
        Assert.assertTrue(element.getText().toLowerCase().contains(text.toLowerCase()));

    }

    public void randomSelectProduct() {

        List<WebElement> productElems = GWD.getDriver().findElements(By.xpath("//*[@id='searchDropdownBox']//option"));
        int maxProducts = productElems.size();
        Random random = new Random();
        int randomProduct1 = random.nextInt(maxProducts);
        productElems.get(randomProduct1).click();
        System.out.println("randomProduct1 = " + randomProduct1);



    }

    public void randomSelectProduct2() {

        List<WebElement> listP = GWD.getDriver().findElements(By.xpath("//div[@class='a-section a-spacing-base']"));
        int maxPrdts=listP.size();
        Random random = new Random();
        int randomProduct2 = random.nextInt(maxPrdts);
        listP.get(randomProduct2).click();
        System.out.println("randomProduct2 = " + randomProduct2);





    }

}


