package pages.login;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import pages.account.AccountPageObject;
import sun.security.x509.SubjectAlternativeNameExtension;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.page;

public class LoginPageObject {
    private SelenideElement getEmailAddress() {
        return $("input[name = 'username']");
    }

    private SelenideElement getLoginPassword() {
        return $("input[name = 'password']");
    }

    private SelenideElement getFinalLoginButton() {
        return $(".btn-lg");
    }

    private SelenideElement getLoginFormTitle() {
        return $(".panel-heading");
    }

    public void enterEmailAddress(String emailAddress){
        getEmailAddress().sendKeys(emailAddress);
    }

    public void enterLoginPassword(String loginPassword){
        getLoginPassword().sendKeys(loginPassword);
    }

    public AccountPageObject selectFinalLoginButton(){
        getFinalLoginButton().click();
        return page(AccountPageObject.class);
    }

    public String getLoginFormTitleText() {
        return getLoginFormTitle().getText();
    }

    public boolean isLoginButtonVisible() {
       return getFinalLoginButton().isDisplayed();
    }

    public void waitUntilLoginFormIsLoaded() {
        getFinalLoginButton().waitUntil(Condition.visible, 5000);
    }

}
