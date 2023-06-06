package Utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.slf4j.impl.SimpleLogger;

import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;

public class GWD {

    private static WebDriver driver;
    public static WebDriver getDriver()
    {
        if (driver==null) {

            Logger.getLogger("").setLevel(Level.SEVERE);
            System.setProperty(org.slf4j.impl.SimpleLogger.DEFAULT_LOG_LEVEL_KEY, "Error");
            System.setProperty(ChromeDriverService.CHROME_DRIVER_SILENT_OUTPUT_PROPERTY,"true");

            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();
        }

        return driver;
    }
    public static void quitDriver(){
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        if (driver != null) {//driver varsa
            driver.quit();
            driver=null;
        }
    }
    public static int getRandomNumberInBetween(int lowerBound, int upperBound) {
        Random r = new Random();
        return (r.nextInt(upperBound) + lowerBound);
    }
    public static int generateRandomNumber(int number){
        Random random=new Random();
        int rNum=random.nextInt(number);
        return rNum;
    }

}
