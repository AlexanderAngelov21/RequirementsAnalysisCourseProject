package uni.pu.fmi.task;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(monochrome = true,plugin = {"pretty","html:target/task-report.html"})
public class TaskStarter {

}
