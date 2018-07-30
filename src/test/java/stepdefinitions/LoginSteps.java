package stepdefinitions;

import cucumber.api.java.en.And;
import general.User;
import pages.login.LoginPageObject;

public class LoginSteps {

    private User user = new User();
    private LoginPageObject login = new LoginPageObject();

    @And("^I enter login Email address$")
    public void iEnterLoginEmailAddress() throws Throwable {
        login.enterEmailAddress(user.getEmailAddress());
    }

    @And("^I enter login Password$")
    public void iEnterLoginPassword() throws Throwable {
        login.enterLoginPassword(user.getPassword());
    }

    @And("^I select final Login button$")
    public void iSelectFinalLoginButton() throws Throwable {
        login.selectFinalLoginButton();
    }
}
