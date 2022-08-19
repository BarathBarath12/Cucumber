package com.adactinhook.step;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import com.BaseClass.UtilityFiles1;
import com.PageObjectManager.Adactin_Page_Object_Manager;
import com.RunnerClass.Runner_Class_With_Hooks;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Adactin_Step_Definition extends UtilityFiles1 {
	public static WebDriver driver = Runner_Class_With_Hooks.driver;
	public static Adactin_Page_Object_Manager objManager = new Adactin_Page_Object_Manager(driver);

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
		sendKeys(objManager.getBook().getCvv(), "132");
	}

	@Then("user Click The Book Button And Its Navigate To {string}")
	public void user_click_the_book_button_and_its_navigate_to(String expected) throws InterruptedException {
		click(objManager.getBook().getBookNow());
		Thread.sleep(10000);
		Assert.assertEquals(expected, driver.getCurrentUrl());
	}

	@When("user Enter The First Name {string}")
	public void user_enter_the_first_name(String name1) {
		sendKeys(objManager.getBook().getName(), name1);
	}

	@When("user Enter The Last Name {string}")
	public void user_enter_the_last_name(String lastname1) {
		sendKeys(objManager.getBook().getLastName(), lastname1);
	}

	@When("user Enter The Billng Address {string}")
	public void user_enter_the_billng_address(String address1) {
		sendKeys(objManager.getBook().getAddress(), address1);
	}

	@When("user Enter The Credit Card Number {string}")
	public void user_enter_the_credit_card_number(String number1) {
		sendKeys(objManager.getBook().getCardNumber(), number1);
	}

	@When("user Select The Credit Card Type")
	public void user_select_the_credit_card_type() {
		select_By_Index(objManager.getBook().getCardType(), 1);
	}

	@When("user Select The Expiry Month")
	public void user_select_the_expiry_month() {
		select_By_Index(objManager.getBook().getExpDate(), 1);
	}

	@When("user Select The Expiry Year")
	public void user_select_the_expiry_year() {
		select_By_Value(objManager.getBook().getExpYear(), "2022");
	}

	@When("user Select The Cvv Number")
	public void user_select_the_cvv_number() {
		sendKeys(objManager.getBook().getCvv(), "112");
	}

	@Then("user Click Book Button And Its Navigate To {string}")
	public void user_click_book_button_and_its_navigate_to(String expected1) throws InterruptedException {
		click(objManager.getBook().getBookNow());
		Thread.sleep(10000);
		Assert.assertEquals(expected1, driver.getCurrentUrl());
	}

}
