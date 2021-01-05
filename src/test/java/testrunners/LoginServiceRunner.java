package testrunners;


import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = {"src/test/java/resources"},
        glue = {"com.cucumber.practice"},
        format = {"json:target/cucumber.json"}
)
public class LoginServiceRunner {
}
