package uni.pu.fmi.register;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(monochrome = true,plugin = {"pretty","html:target/register-report.html"})
public class RegisterStarter {

}