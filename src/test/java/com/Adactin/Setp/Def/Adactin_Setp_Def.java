package com.Adactin.Setp.Def;

import java.io.IOException;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import com.BaseClass.UtilityFiles1;
import com.PageObjectManager.Adactin_Page_Object_Manager;
import com.RunnerClass.Adactin_Runner_Class;
import com.properties.Sigleton_Design_Pattern;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Adactin_Setp_Def extends UtilityFiles1 {
	public static WebDriver driver = Adactin_Runner_Class.driver;
	public static Adactin_Page_Object_Manager objManager = new Adactin_Page_Object_Manager(driver);

	@Given("user Launch The Application")
	public void user_launch_the_application() throws IOException {
		String url = Sigleton_Design_Pattern.get_Sdp().get_Instance_Test_Data().getUrl();
		getUrl(url);
	}

	@When("user Enter The {string} In Username Filed")
	public void user_enter_the_in_username_filed(String string) {
		sendKeys(objManager.getPage().getUsername(), string);
	}
	@When("user Enter The {string} In Password Filed")
	public void user_enter_the_in_password_filed(String string) {
		sendKeys(objManager.getPage().getPassword(), string);
	}
	
	@Then("user Click The Login Button And Its Navigate To {string}")
	public void user_click_the_login_button_and_its_navigate_to(String expected) throws InterruptedException {
		click(objManager.getPage().getLogin());
		Thread.sleep(3000);
		Assert.assertEquals(expected, driver.getCurrentUrl());
	}

	@When("user Select The Location In Location Filed")
	public void user_select_the_location_in_location_filed() {
		select_By_Index(objManager.getSearch().getLocation(), 1);
	}

	@When("user Select The Hotels In Hotels Filed")
	public void user_select_the_hotels_in_hotels_filed() {
		select_By_Index(objManager.getSearch().getHotels(), 3);
	}

	@When("user Select The Room Type In Room Type Filed")
	public void user_select_the_room_type_in_room_type_filed() {
		select_By_Text(objManager.getSearch().getRoomType(), "Standard");
	}

	@When("user Select The Number Of Rooms In Number Of Rooms Filed")
	public void user_select_the_number_of_rooms_in_number_of_rooms_filed() {
		select_By_Index(objManager.getSearch().getNumber_Of_Rooms(), 2);
	}

	@When("user Enter The Check In Date In Check In Date Filed {string}")
	public void user_enter_the_check_in_date_in_check_in_date_filed(String indate) {
		clear(objManager.getSearch().getCheck_In_Date());
		sendKeys(objManager.getSearch().getCheck_In_Date(), indate);
	}

	@When("user Enter The Check Out Date In Check Out Date Filed {string}")
	public void user_enter_the_check_out_date_in_check_out_date_filed(String outdate) {
		clear(objManager.getSearch().getCheck_Out_Date());
		sendKeys(objManager.getSearch().getCheck_Out_Date(), outdate);
	}

	@When("user Select The Adults Per Room In Adult Per Room Filed")
	public void user_select_the_adults_per_room_in_adult_per_room_filed() {
		select_By_Value(objManager.getSearch().getAdult_Room(), "2");
	}

	@When("user Select The Child Per Room In Child Per Room Filed")
	public void user_select_the_child_per_room_in_child_per_room_filed() {
		select_By_Index(objManager.getSearch().getChild_Room(), 2);
	}

	@Then("user Click The Search Button And Its Navigate To {string}")
	public void user_click_the_search_button_and_its_navigate_to(String expected) throws InterruptedException {
		click(objManager.getSearch().getSearch());
		Assert.assertEquals(expected, driver.getCurrentUrl());

	}

	@When("user Select The Hotel In Select Hotel Filed")
	public void user_select_the_hotel_in_select_hotel_filed() throws InterruptedException {
		click1(objManager.getSelect().getRadioButton());
	}

	@Then("user Click The Continue Button And Its Navigate To {string}")
	public void user_click_the_continue_button_and_its_navigate_to(String expected) {
		click(objManager.getSelect().getContinues());
		Assert.assertEquals(expected, driver.getCurrentUrl());
	}

	@When("user Enter The First Name In First Name Filed {string}")
	public void user_enter_the_first_name_in_first_name_filed(String name) {
		sendKeys(objManager.getBook().getName(), name);
	}

	@When("user Enter The Last Name In Last Name Filed {string}")
	public void user_enter_the_last_name_in_last_name_filed(String name) {
		sendKeys(objManager.getBook().getLastName(), name);
	}

	@When("user Enter The Billng Address In Billing Address Filed {string}")
	public void user_enter_the_billng_address_in_billing_address_filed(String address) {
		sendKeys(objManager.getBook().getAddress(), address);
	}

	@When("user Enter The Credit Card Number In Credit Card Number Filed {string}")
	public void user_enter_the_credit_card_number_in_credit_card_number_filed(String number) {
		sendKeys(objManager.getBook().getCardNumber(), number);
	}

	@When("user Select The Credit Card Type In Credit Card Type Filed")
	public void user_select_the_credit_card_type_in_credit_card_type_filed() {
		select_By_Index(objManager.getBook().getCardType(), 2);
	}

	@When("user Select The Expiry Month In Expiry Month Filed")
	public void user_select_the_expiry_month_in_expiry_month_filed() {
		select_By_Index(objManager.getBook().getExpDate(), 2);
	}

	@When("user Select The Expiry Year In Expiry Year Filed")
	public void user_select_the_expiry_year_in_expiry_year_filed() {
		select_By_Value(objManager.getBook().getExpYear(), "2022");
	}

	@When("user Select The Cvv Number In Cvv Number Filed")
	public void user_select_the_cvv_number_in_cvv_number_filed() {
		sendKeys(objManager.getBook().getCvv(), "122");
	}

	@Then("user Click The Book Button And Its Navigate To {string}")
	public void user_click_the_book_button_and_its_navigate_to(String expected) throws InterruptedException {
		click(objManager.getBook().getBookNow());
		Thread.sleep(10000);
		Assert.assertEquals(expected, driver.getCurrentUrl());
	}

	@When("user Click The My Itinerary Button")
	public void user_click_the_my_itinerary_button() throws InterruptedException {
		click1(objManager.getConfirm().getMyItinerary());
	}

	@When("User Click The Logout Button In Logout Filed")
	public void user_click_the_logout_button_in_logout_filed() throws InterruptedException {
		click1(objManager.getLogout().getLogout());
	}

}
