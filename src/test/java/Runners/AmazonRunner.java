package Runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = {"src/test/java/FeatureFiles/Login.feature",
                     "src/test/java/FeatureFiles/Product.feature"},
        glue = {"StepDefinitions"}
        //dryRun = true
        //dryRun = false

)
public class AmazonRunner extends AbstractTestNGCucumberTests {
}
