package testrunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
@CucumberOptions(features= "./src/test/resources/features/ActtitimeLogin.feature",
                           glue="stepdefination")
public class TestRunner extends AbstractTestNGCucumberTests {

}
