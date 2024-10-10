package runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = "src/test/resources/Features",
        glue = {"stepdefinitions", "utilities"},
        tags = "@FirstHomeFeature",
        dryRun = false,
        plugin = {
                "pretty",
                "summary",
                "html:target/reports/semao/Android/cucumber-report.html"
        }
)
public class TestRunner extends AbstractTestNGCucumberTests {//testnglide ya @cucumberin üstüne@runwith deriz yada boyle ekstends ederiz
}
