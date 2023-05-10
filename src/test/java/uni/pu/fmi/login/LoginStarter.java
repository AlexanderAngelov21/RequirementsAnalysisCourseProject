package uni.pu.fmi.login;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(monochrome = true,plugin = {"pretty","html:target/login-report.html"})
public class LoginStarter {

}
