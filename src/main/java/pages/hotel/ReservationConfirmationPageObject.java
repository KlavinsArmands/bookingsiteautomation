package pages.hotel;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;
import pages.landingpage.LandingPageObject;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.page;

public class ReservationConfirmationPageObject {

    private SelenideElement getConfirmBookingButton() {
        return $(By.xpath("//button[contains(text(), 'CONFIRM THIS BOOKING')]"));
    }

    public ReservationConfirmationPageObject selectConfirmBookingButton(){
        getConfirmBookingButton().click();
        return page(ReservationConfirmationPageObject.class);
    }

}
