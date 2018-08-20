package stepdefinitions;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import general.TestContext;

public class AccountSteps {

    private TestContext test;

    public AccountSteps(TestContext testContext){
        this.test = testContext;
    }

    @Then("^user account page is opened$")
    public void userAccountPageIsOpened() {
        System.out.println("ACCOUNT CREATED!");
    }

    @And("^I select logout$")
    public void iSelectLogout() {
        test.getNavigation().selectLogoutButton();
    }


    @And("^I select User Account button$")
    public void iSelectUserAccountButton() {
        test.getNavigation().selectUserAccountButton(test.getUser().getFirstName());
    }

    @When("^I select Home button in Navigation bar$")
    public void iSelectHomeButtonInNavigationBar() throws Throwable {
        test.getNavigation().selectHomeButton();
    }
}
