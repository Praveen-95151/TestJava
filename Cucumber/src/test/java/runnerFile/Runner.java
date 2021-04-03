package runnerFile;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		glue= {"stepDefinition"},
		features="src/main/features",
		tags= {"@login"}
		
		
		)

public class Runner {

}
