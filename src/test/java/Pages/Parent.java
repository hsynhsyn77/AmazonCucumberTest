package Pages;

import Utilities.GWD;
import io.cucumber.datatable.DataTable;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;
import java.util.*;
import java.util.concurrent.ThreadLocalRandom;
import java.util.concurrent.locks.Condition;

import static Utilities.GWD.*;
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



    public void waitUntilClickable(WebElement element) {
        WebDriverWait wait = new WebDriverWait(GWD.getDriver(), Duration.ofSeconds(2));
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
        String value = productElems.get(randomProduct1).getText();
        System.out.println(value);
        productElems.get(randomProduct1).click();
        System.out.println(randomProduct1);


    }

    public void randomSelectProduct2() {

        List<WebElement> listP = GWD.getDriver().findElements(By.xpath("//*[@class='a-section a-spacing-base'] "));
        int maxPrdts = listP.size();
        Random random = new Random();
        int randomProduct2 = random.nextInt(maxPrdts);
        System.out.println(randomProduct2);
        String value = listP.get(randomProduct2).getText();
        System.out.println(value);
        listP.get(randomProduct2).click();

    }

    public void deleteProduct() {
        List<WebElement> deleteProducts = GWD.getDriver().findElements(By.xpath("//input[@value='Sil']"));

        for (WebElement e : deleteProducts) {
            boolean isClicked = false;
            int retryCount = 0;
            while (!isClicked && retryCount < 3) {
                try {
                    e.click();
                    isClicked = true;
                } catch (StaleElementReferenceException exception) {
                    retryCount++;
                    GWD.getDriver().navigate().refresh();
                    e = GWD.getDriver().findElement(By.xpath("//input[@value='Sil']"));
                }
            }
        }
    }
}















