package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
 
@CucumberOptions(features = "src/test/java/feature/salesforceAccountCreation.feature", glue = "stepdefinition", publish = false)
public class RunnerForSF extends AbstractTestNGCucumberTests {

}
