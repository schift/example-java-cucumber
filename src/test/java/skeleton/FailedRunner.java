package skeleton;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

//@RunWith(Cucumber.class)

@CucumberOptions(features = "@target/rerun.log", plugin = {"rerun:target/rerun.log"})

public class FailedRunner {}
