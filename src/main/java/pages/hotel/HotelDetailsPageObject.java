package pages.hotel;

import com.codeborne.selenide.SelenideElement;
import general.TestContext;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.page;

public class HotelDetailsPageObject {

    private SelenideElement getCheckinDate() {
        return $(By.xpath("//label[contains(text(), 'Check in')]//following-sibling::input"));
    }

    private SelenideElement getCheckoutDate() {
        return $(By.xpath("//label[contains(text(), 'Check out')]//following-sibling::input"));
    }
    private SelenideElement getAmountOfAdults(){
        return $("[id=adults]");
    }
    private SelenideElement getAmountOfChildren(){
        return $("[id=child]");
    }

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

    public String getCheckinDateText() {
        return getCheckinDate().getValue();
    }

    public String getCheckoutDateText() {
        return getCheckoutDate().getValue();
    }

    public String getAmountOfAdultsText() {
        return getAmountOfAdults().getValue();
    }

    public String getAmountOfChildrenText() {
        return getAmountOfChildren().getValue();
    }


}
