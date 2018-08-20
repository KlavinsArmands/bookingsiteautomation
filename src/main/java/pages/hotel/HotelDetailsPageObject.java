package pages.hotel;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.page;

public class HotelDetailsPageObject {

    private SelenideElement getRoomsSection() {
        return $(By.id("ROOMS"));
    }

    private SelenideElement getBookNowButton(String roomType) {
        return $(By.xpath("//b[contains(text(), '" + roomType + "')]/ancestor::" +
                "td/descendant::button[contains(text(), 'Book Now')]"));
    }

    public void scrollToRoomsSection() {
        getRoomsSection().scrollTo();
    }

    public ReservationConfirmationPageObject selectBookNowButton(String roomType) {
        getBookNowButton(roomType).click();
        return page(ReservationConfirmationPageObject.class);
    }

}
