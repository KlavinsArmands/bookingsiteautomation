package pages.header;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;
import pages.account.AccountPageObject;
import pages.landingpage.LandingPageObject;
import pages.login.LoginPageObject;
import pages.signup.SignUpPageObject;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.page;

public class NavigationPageObject {


    private SelenideElement getMyAccountButton() {
        return $(By.xpath("//nav/descendant::li[@id='li_myaccount']/a"));
    }

    private SelenideElement getSignUpButton() {
        return $(By.xpath("//nav/descendant::a[contains(text(), 'Sign Up')]"));
    }

    private SelenideElement getLoginButton() {
        return $(By.xpath("//nav/descendant::a[contains(text(), 'Login')]"));
    }

    private SelenideElement getLogoutButton() {
        return $(By.xpath("//nav/descendant::a[contains(text(), 'Logout')]"));
    }

    private SelenideElement getUserAccountButton (String username) {
        return $(By.xpath("//nav/descendant::a[contains(text(), '" + username +  "')]"));
    }

    private SelenideElement getHomeButton() {
        return $(By.xpath("//*[@id='collapse']/ul[1]/li[1]/a"));
    }

    private SelenideElement getLogoImageLocation() {
        return $(".navbar-brand img");
    }

    private SelenideElement getLoadingIndicator() {
        return $(By.id("preloader"));
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

    public AccountPageObject selectUserAccountButton(String username) {
        getUserAccountButton(username).click();
        return page(AccountPageObject.class);
    }

    public boolean isUserAccountButtonVisible(String username) {
        return getUserAccountButton(username).isDisplayed();
    }

    public AccountPageObject selectHomeButton() throws InterruptedException {
        Thread.sleep(1000);
        getHomeButton().click();
        return page(AccountPageObject.class);
    }

    public boolean isLogoVisible() {
        return getLogoImageLocation().isDisplayed();
    }

    public boolean isMyAccountButtonVisible () {
        return getMyAccountButton().isDisplayed();
    }

    public void waitUntilPageLoadingIsFinished() {
        getLoadingIndicator().waitUntil(Condition.attribute("style", "display: none;"),5000);
    }

}
