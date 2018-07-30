package pages.login;

import com.codeborne.selenide.SelenideElement;
import pages.account.AccountPageObject;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.page;

public class LoginPageObject {
    private SelenideElement getEmailAddress() {
        return $("test");
    }

    private SelenideElement getLoginPassword() {
        return $("test");
    }

    private SelenideElement getFinalLoginButton() {
        return $("test");
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

}
