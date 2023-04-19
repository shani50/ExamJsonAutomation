package Runner;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(plugin = {"pretty"},features = {"C:\\Users\\Shani.Kumar\\Videos\\ExamJsonAutomation\\ExamJsonAutomation\\src\\test\\resources\\features\\masterpage.feature"},
        glue = "StepDef")
public class MasterRunner {
}
