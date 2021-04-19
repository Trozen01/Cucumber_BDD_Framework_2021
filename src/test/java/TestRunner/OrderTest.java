package TestRunner;


import org.junit.runner.RunWith; 
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features="C:/Jitu/Work/SoftwareTesting/Practical/Cucumber_BDD_Framework_2021/src/test/resources/AppFeatures/Order.feature",
		glue="StepDefinition",
		monochrome=true,
		plugin={"pretty","html:target/HtmlReport/report.html",
                "junit:target/JunitReport/report.xml",
                "json:target/JsonReport/report.json"
}		
		)
public class OrderTest {

}
