package skeleton;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
//or @CucumberOptions(plugin = {"pretty", "com.epam.reportportal.cucumber.ScenarioReporter"})
@CucumberOptions(plugin = {"com.epam.reportportal.cucumber.StepReporter"})
public class RunCukesTest {
}
