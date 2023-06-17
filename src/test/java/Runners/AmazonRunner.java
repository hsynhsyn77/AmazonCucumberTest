package Runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        tags = "@SmokeTest",
        features = {"src/test/java/FeatureFiles",
                "src/test/java/FeatureFiles/Product.feature"},
        glue = {"StepDefinitions"},
        //dryRun = true
        //dryRun = false
        plugin = "html:target//cucumber-reports.html"

)
public class AmazonRunner extends AbstractTestNGCucumberTests {
}
