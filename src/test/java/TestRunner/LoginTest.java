package TestRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features="C:/Jitu/Work/SoftwareTesting/Practical/Cucumber_BDD_Framework_2021/src/test/resources/AppFeatures/Login.feature",
				
		glue="StepDefinition",
		monochrome=true,
		plugin={"pretty","html:target/HtmlReport/report.html",
				"junit:target/JunitReport/report.xml",
                "json:target/JsonReport/report.json",
                "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"   // it generate extend html report.
                
}
		)
public class LoginTest {

}
