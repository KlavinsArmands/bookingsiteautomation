package stepdefinitions;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import general.TestContext;

import static org.assertj.core.api.Assertions.assertThat;

public class LoginSteps {

    private TestContext test;

    public LoginSteps(TestContext testContext){
        this.test = testContext;
    }

    @And("^I enter login Email address$")
    public void iEnterLoginEmailAddress() {
        test.getLoginPage().enterEmailAddress(test.getUser().getEmailAddress());
    }

    @And("^I enter login Password$")
    public void iEnterLoginPassword() {
        test.getLoginPage().enterLoginPassword(test.getUser().getPassword());
    }

    @And("^I select final Login button$")
    public void iSelectFinalLoginButton() {
        test.getLoginPage().selectFinalLoginButton();
    }

    @And("^Login page is opened$")
    public void loginPageIsOpened() {
        test.getNavigation().waitUntilPageLoadingIsFinished();

        assertThat(test.getLoginPage().getLoginFormTitleText()).isEqualTo("LOGIN");
    }
}
