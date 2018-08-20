package general;


import lombok.Data;
import pages.account.AccountPageObject;
import pages.header.NavigationPageObject;
import pages.hotel.HotelDetailsPageObject;
import pages.hotel.ReservationConfirmationPageObject;
import pages.landingpage.LandingPageObject;
import pages.login.LoginPageObject;
import pages.signup.SignUpPageObject;

@Data
public class TestContext {
    private User user;
    private AccountPageObject accountPage;
    private NavigationPageObject navigation;
    private LandingPageObject landingpage;
    private LoginPageObject loginPage;
    private SignUpPageObject signUpPage;
    private HotelDetailsPageObject hotelDetailsPage;
    private ReservationConfirmationPageObject reservationConfirmationPage;

    public TestContext() {
        this.user = new User();
        this.accountPage = new AccountPageObject();
        this.navigation = new NavigationPageObject();
        this.landingpage = new LandingPageObject();
        this.loginPage = new LoginPageObject();
        this.signUpPage = new SignUpPageObject();
        this.hotelDetailsPage = new HotelDetailsPageObject();
        this.reservationConfirmationPage = new ReservationConfirmationPageObject();

    }

}
