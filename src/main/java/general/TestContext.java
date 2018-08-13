package general;


import lombok.Data;
import pages.account.AccountPageObject;
import pages.header.NavigationPageObject;
import pages.landingpage.LandingPageObject;
import pages.login.LoginPageObject;
import pages.signup.SignUpPageObject;

@Data
public class TestContext {
    private User user;
    private AccountPageObject accountPage;
    private NavigationPageObject navigation;
    private LandingPageObject bookHotelsPage;
    private LoginPageObject loginPage;
    private SignUpPageObject signUpPage;

    public TestContext() {
        this.user = new User();
        this.accountPage = new AccountPageObject();
        this.navigation = new NavigationPageObject();
        this.bookHotelsPage = new LandingPageObject();
        this.loginPage = new LoginPageObject();
        this.signUpPage = new SignUpPageObject();

    }

}
