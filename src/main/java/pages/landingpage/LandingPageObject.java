package pages.landingpage;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;
import static com.codeborne.selenide.Selenide.page;

public class LandingPageObject {

    private SelenideElement getHotelsButton() {
        return $("a[href='#HOTELS']");
    }

    private SelenideElement getHotelField() {
        return $(By.xpath("//span[contains(text(), 'Search by Hotel or City Name')]"));
    }

    private SelenideElement getHotelInputField() {
        return $(By.xpath("//div[@id = 'select2-drop']/descendant::input"));
    }

    private SelenideElement getHotelResultMenu(String location) {
        return $(By.xpath("//div[contains(text(), '" + location + "')]"));
    }

    private SelenideElement getSearchResult() {
        return $(".select2-result-selectable");
    }

    private ElementsCollection getSearchResultList() {
        return $$(".select2-result-selectable");
    }

    private SelenideElement getCheckInDate() {
        return $("input[name='checkin']");
    }

    private SelenideElement getCheckOutDate() {
        return $("input[name='checkout']");
    }

    private SelenideElement getPeopleField() {
        return $("#travellersInput");
    }

    private SelenideElement getAdultField() {
        return $("#adultInput");
    }

    private SelenideElement getChildField() {
        return $("#childInput");
    }

    private SelenideElement getSearchButton() {
        return $("#HOTELS > form > div.col-md-2.form-group.go-right.col-xs-12.search-button > button");
    }


    public LandingPageObject selectHotelsButton(){
        getHotelsButton().click();
        return page(LandingPageObject.class);
    }

    public void enterHotel(){
        getHotelField().click();
    }

    public void enterHotelInputField(String hotel){
        getHotelInputField().sendKeys(hotel);
    }

    public void selectHotelByLocation(String location) {
        getHotelResultMenu(location).click();
    }

    public int getSearchResultCount() {
        return getSearchResultList().size();
    }

    public void enterCheckInDate(String checkin){
        getCheckInDate().sendKeys(checkin);
    }

    public void enterCheckOutDate(String checkout){
        getCheckOutDate().sendKeys(checkout);
    }

    public void selectPeopleField(){
        getPeopleField().click();
    }

    public void enterAdultAmount(String amount) {
        getAdultField().clear();
        getAdultField().sendKeys(amount);
    }

    public void enterChildAmount(String amount) {
        getChildField().clear();
        getChildField().sendKeys(amount);
    }


    public LandingPageObject selectSearchButton(){
        getSearchButton().click();
        return page(LandingPageObject.class);
    }

    public void waitUntilSearchResultsAreDisplayed() {
        getSearchResult().waitUntil(Condition.visible, 5000);
    }

}
