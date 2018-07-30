package stepdefinitions;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import general.User;
import pages.signup.SignUpPageObject;

import static utils.RandomGenerator.*;

public class SignupSteps {

    private SignUpPageObject signUp = new SignUpPageObject();
    private User user = new User();


    @And("^I enter First name$")
    public void iEnterFirstName() throws Throwable {
        signUp.enterFirstName(user.getFirstName());
    }

    @And("^I enter Last name$")
    public void iEnterLastName() throws Throwable {
        signUp.enterLastName(user.getLastName());
    }

    @And("^I enter Mobile number$")
    public void iEnterMobileNumber() throws Throwable {
        signUp.enterMobileNumber(user.getMobileNumber());
    }

    @And("^I enter Email address$")
    public void iEnterEmailAddress() throws Throwable {
        signUp.enterEmail(user.getEmailAddress());
    }

    @And("^I enter Password$")
    public void iEnterPassword() throws Throwable {
        signUp.enterPassword(user.getPassword());
    }

    @And("^I confirm Password$")
    public void iConfirmPassword() throws Throwable {
        signUp.enterConfirmPassword(user.getPassword());
    }

    @And("^I select Sign up button in Sign up page$")
    public void iSelectSignUpButtonInSignUpPage() throws Throwable {
        signUp.selectSignUpButton();
    }

    @And("^I create new account$")
    public void iCreateNewAccount() throws Throwable {
        iEnterFirstName();
        iEnterLastName();
        iEnterMobileNumber();
        iEnterEmailAddress();
        iEnterPassword();
        iConfirmPassword();
        iSelectSignUpButtonInSignUpPage();
    }

}