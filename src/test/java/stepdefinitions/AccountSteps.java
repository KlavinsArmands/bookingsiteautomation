package stepdefinitions;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import pages.header.NavigationPageObject;

public class AccountSteps {

    private NavigationPageObject navigate = new NavigationPageObject();

    @Then("^user account page is opened$")
    public void userAccountPageIsOpened() throws Throwable {
        System.out.println("ACCOUNT CREATED!");
    }

    @And("^I select logout$")
    public void iSelectLogout() {
        navigate.selectLogoutButton();
    }


}
