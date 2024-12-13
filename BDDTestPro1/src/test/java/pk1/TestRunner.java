package pk1;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "src/test/resources/features/demo.feature",glue= {"pk1"},
				plugin = { "pretty",
						"html:target/report/cucumber.html"},monochrome = true)
public class TestRunner {

	

}
