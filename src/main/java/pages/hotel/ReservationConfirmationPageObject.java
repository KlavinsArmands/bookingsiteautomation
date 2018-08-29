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

    private SelenideElement getHotelName() {
        return $(By.xpath("//*[@id='body-section']/div[1]/div/div[2]/div[1]/div[2]/div/h6/strong"));
    }

    public ReservationConfirmationPageObject selectConfirmBookingButton(){
        getConfirmBookingButton().click();
        return page(ReservationConfirmationPageObject.class);
    }

    public String getHotelNameText() {
        return getHotelName().getText();
    }

}
