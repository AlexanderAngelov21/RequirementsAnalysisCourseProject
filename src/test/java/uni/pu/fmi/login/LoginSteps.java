package uni.pu.fmi.login;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import uni.pu.fmi.login.model.LoginScreenModel;

import static org.junit.Assert.assertEquals;

public class LoginSteps {
    private LoginScreenModel loginModel;

    @Given("^Потребителя отваря екрана за вход в системата$")
    public void openLoginScreen() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        loginModel = new LoginScreenModel();
    }

    @When("^Въведе валидно потребителско име$")
    public void enteredValidUsername() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        loginModel.setUsername("Александър");
    }

    @When("^въведе валидна потребителска парола$")
    public void enteredValidPassword() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        loginModel.setPassword("1234pass");
    }

    @When("^натисне бутона за вход в системата$")
    public void loginButtonPressed() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        loginModel.loginButtonPressed();
    }

    @Then("^Вижда съобщение за успех\\.$")
    public void successMessage() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        assertEquals("Успешно влязохте в систематa!",loginModel.getMessage());
    }

    @Then("^Вижда съобщение за липсващи данни\\.$")
    public void missingDataMessage() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        assertEquals("Въведете име и парола!", loginModel.getMessage());
    }

    @When("^Въведе невалидно потребителско име$")
    public void enteredInvalidUsername() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        loginModel.setUsername("Wrong user name");
    }

    @Then("^Вижда съобщение грешни данни\\.$")
    public void enteredInvalidPasswords() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        assertEquals("Грешни данни!", loginModel.getMessage());
    }
}
