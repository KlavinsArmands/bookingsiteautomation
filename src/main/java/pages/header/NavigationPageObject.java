package pages.header;

import com.codeborne.selenide.SelenideElement;
import pages.landingpage.LandingPageObject;
import pages.login.LoginPageObject;
import pages.signup.SignUpPageObject;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.page;

public class NavigationPageObject {


    private SelenideElement getMyAccountButton() {
        return $("test");
    }

    private SelenideElement getSignUpButton() {
        return $("test");
    }

    private SelenideElement getLoginButton() {
        return $("test");
    }

    private SelenideElement getLogoutButton() {
        return $("test");
    }

    public void selectMyAccountButton(){
        getMyAccountButton().click();
    }

    public SignUpPageObject selectSignUpButton() {
        getSignUpButton().click();
        return page(SignUpPageObject.class);
    }

    public LoginPageObject selectLoginButton() {
        getLoginButton().click();
        return page(LoginPageObject.class);
    }

    public LandingPageObject selectLogoutButton() {
        getLogoutButton().click();
        return page(LandingPageObject.class);
    }

}
