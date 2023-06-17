package StepDefinitions;

import Utilities.GWD;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;


public class Hooks {
    @Before
    public void before()
    {
        System.out.println("Senaryo Başladı.");
    }
    @After
    public void after(Scenario scenario)
    {
        System.out.println("Senaryo bitti");
        System.out.println("scenario sonucu="+scenario.getStatus());
        System.out.println("scenario isFailed?="+scenario.isFailed());

        LocalDateTime date=LocalDateTime.now();
        DateTimeFormatter formatter=DateTimeFormatter.ofPattern("dd.MM.yy");
        if (scenario.isFailed()){
            TakesScreenshot screenshot = (TakesScreenshot) GWD.getDriver();
            File ekranDosyasi = screenshot.getScreenshotAs(OutputType.FILE);

            try {
                FileUtils.copyFile(ekranDosyasi,
                        new File("target/FailedScreenShots/"+ scenario.getId()+date.format(formatter)+".png"));

            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        GWD.quitDriver();
    }
}
