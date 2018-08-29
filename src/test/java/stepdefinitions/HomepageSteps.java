package stepdefinitions;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import general.TestContext;

import static org.assertj.core.api.Assertions.assertThat;

public class HomepageSteps {

    private TestContext test;

    public HomepageSteps(TestContext testContext) {
        this.test = testContext;
    }

    @Given("^I have opened homepage$")
    public void iHaveOpenedHomepage() {
        System.out.println("Navigation is visible");
        test.getNavigation().waitUntilPageLoadingIsFinished();
        assertThat(test.getNavigation().isLogoVisible()).isTrue();
        assertThat(test.getNavigation().isMyAccountButtonVisible()).isTrue();
    }

    @And("^I have opened homepage while logged in$")
    public void iHaveOpenedHomepageWhileLoggedIn() {
        System.out.println("Navigation is visible");
        test.getNavigation().waitUntilPageLoadingIsFinished();
        assertThat(test.getNavigation().isLogoVisible()).isTrue();
        assertThat(test.getNavigation().isUserAccountButtonVisible(test.getUser().getFirstName())).isTrue();
    }

    @When("^I select My account menu$")
    public void iSelectMyAccountMenu() {
        test.getNavigation().selectMyAccountButton();
    }


    @And("^I select Sign up button$")
    public void iSelectSignUpButton() {
        test.getNavigation().selectSignUpButton();
    }

    @And("^I select Login button$")
    public void iSelectLoginButton() {
        test.getNavigation().selectLoginButton();
    }


    @And("^I navigate to Signup page$")
    public void iNavigateToSignUpPage() {
        iHaveOpenedHomepage();
        iSelectMyAccountMenu();
        iSelectSignUpButton();
    }

    @And("^correct amount of hotels is found$")
    public void correctAmountOfHotelsIsFound() {
        test.getLandingpage().waitUntilSearchResultsAreDisplayed();

        assertThat(test.getLandingpage().getSearchResultCount()).isEqualTo(1);
    }
}
