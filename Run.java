package TestBuilder;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(

		features={"/Project80/Features"},
		//features=".//Features/",
		glue={"/Project80/src/test/java/stepDefinition"},
		dryRun=false,
		monochrome=true,
		//tags="@Sanity",//scenarios under @regression will only execute
		plugin= {"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"}
		//plugin= {"pretty","html:target/cucumber-reports/reports1.html"}
		)

public class Run {

}
