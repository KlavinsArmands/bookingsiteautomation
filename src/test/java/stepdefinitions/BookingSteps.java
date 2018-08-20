package stepdefinitions;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import general.TestContext;

public class BookingSteps {

    private TestContext test;

    public BookingSteps(TestContext testContext){
        this.test = testContext;
    }

    @And("^I select book Hotels button$")
    public void iSelectBookHotelsButton() {
        test.getLandingpage().selectHotelsButton();
    }

    @And("^I enter ([^\"]*) hotel")
    public void iEnterHotelName(String hotel) {
        test.getLandingpage().enterHotel();
        test.getLandingpage().enterHotelInputField(hotel);
    }

    @And("^I select hotel located in ([^\\\"]*)")
    public void iSelectHotelLocatedInSingapore(String location) {
        test.getLandingpage().selectHotelByLocation(location);
    }

    @And("^I select ([^\\\"]*) as Check in date$")
    public void iSelectAsCheckInDate(String checkin) {
        test.getLandingpage().enterCheckInDate(checkin);

    }

    @And("^I select ([^\\\"]*) as Check out date$")
    public void iSelectAsCheckOutDate(String checkout) {
        test.getLandingpage().enterCheckOutDate(checkout);
    }

    @And("^I select ([^\\\"]*) Adult and ([^\\\"]*) Children$")
    public void iSelectAdultAndChildren(String adultAmount, String childAmount) {
        test.getLandingpage().selectPeopleField();
        test.getLandingpage().enterAdultAmount(adultAmount);
        test.getLandingpage().enterChildAmount(childAmount);
    }

    @And("^I select Search button$")
    public void iSelectSearchButton() {
        test.getLandingpage().selectSearchButton();
    }

    @And("^I select ([^\\\"]*) room$")
    public void iSelectJuniorSuitesRoom(String roomType) throws InterruptedException {
        test.getHotelDetailsPage().scrollToRoomsSection();
        test.getHotelDetailsPage().selectBookNowButton(roomType);
    }

    @And("^I select “Confirm this booking” button$")
    public void iSelectConfirmThisBookingButton(){
        test.getReservationConfirmationPage().selectConfirmBookingButton();
    }

    @Then("^Unpaid invoice page is opened$")
    public void unpaidInvoicePageIsOpened(){
        System.out.println("INVOICE IS SENT TO YOUR MAIL. PLEASE FOLLOW THE INSTRUCTIONS.");
    }

}
