package cucumberoptions;


import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions (
        features ="src/test/java/feature",
        glue = "stepDefination",tags="@smoketest,@regtest",
        plugin= {"pretty","html:target/result"}
)
public class testRunner {
}
