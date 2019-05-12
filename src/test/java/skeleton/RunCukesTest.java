package skeleton;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
//@CucumberOptions(plugin = {"pretty", "com.epam.reportportal.cucumber.ScenarioReporter"})
//@CucumberOptions(tags = "@ok", plugin = { "skeleton.RpListener" })
@CucumberOptions(plugin = {"rerun:target/rerun.log" })
public class RunCukesTest {

    public RunCukesTest() {
        System.out.println("770919 RunCukesTest");
    }

}
