package stepdefinitions;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;

public class LoginSteps {
    @And("^I select Login button$")
    public void iSelectLoginButton() throws Throwable {
        selectLoginButton();
    }

    @And("^I enter login Email address$")
    public void iEnterLoginEmailAddress() throws Throwable {
        enterLoginEmailAddress();
    }

    @And("^I enter login Password$")
    public void iEnterLoginPassword() throws Throwable {
        enterLoginPassword();
    }

    @And("^I select final Login button$")
    public void iSelectFinalLoginButton() throws Throwable {
        selectFinalLoginButton();
    }
}
