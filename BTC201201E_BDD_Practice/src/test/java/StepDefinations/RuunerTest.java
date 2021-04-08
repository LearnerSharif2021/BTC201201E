package StepDefinations;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;


@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources/Drivers/chromedriver.exe",
glue= {"StepDefinations"},
monochrome=true,
plugin= {"pretty","junit:target/JUnitReports/report.xml"
		,"json:target/JSONReports/report.json",
		"html:target/HtmlRepots"},tags="@smoketest")


public class RuunerTest {
	
	

}
