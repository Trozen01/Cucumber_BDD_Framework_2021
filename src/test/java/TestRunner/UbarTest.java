package TestRunner;

import org.junit.runner.RunWith; 
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features="C:/Jitu/Work/SoftwareTesting/Practical/Cucumber_BDD_Framework_2021/src/test/resources/AppFeatures/Uber.feature",
		glue="StepDefinition",
		tags= "@RegressionTest",
		monochrome=true,                                         // if this option is true then all console line is come in black format.
		plugin={"pretty","html:target/HtmlReport/report.html",
		                 "junit:target/JunitReport/report.xml",
		                 "json:target/JsonReport/report.json"
		}		
		)


public class UbarTest {

}
