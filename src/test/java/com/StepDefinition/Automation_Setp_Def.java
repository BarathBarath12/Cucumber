package com.StepDefinition;

import org.openqa.selenium.WebDriver;

import com.BaseClass.UtilityFiles1;
import com.PageObjectManager.Automation_Page_Object_Manager;
import com.RunnerClass.Automation_RunnerClass;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Automation_Setp_Def extends UtilityFiles1 {
	public static WebDriver driver = Automation_RunnerClass.driver;
	public static Automation_Page_Object_Manager obj_Manager = new Automation_Page_Object_Manager(driver);

	@Given("user Launch The Application")
	public void user_launch_the_application() {
		getUrl("http://automationpractice.com/index.php");
	}

	@When("user Click The Login Button and It Navigate To Login Page")
	public void user_click_the_signin_button_and_it_navigate_to_login_page() throws InterruptedException {
		Thread.sleep(1000);
		click(obj_Manager.getAccountView().getAccount());
	}

	@When("user Enter The Email Address In Email Address Filed {string}")
	public void user_enter_the_email_address_in_email_address_filed(String email) {
		sendKeys(obj_Manager.getSignin().getEmail(), email);
	}

	@When("User Enter The Password In Password Filed {string}")
	public void user_enter_the_password_in_password_filed(String password) {
		sendKeys(obj_Manager.getSignin().getPassword(), "Barath@998");
	}

	@When("user Click The Signin Button And Its Navigate The Dresses")
	public void user_click_the_signin_button_and_its_navigate_the_dresses() {
		click(obj_Manager.getSignin().getSignin());
	}

	@When("user Click The Dresses Along With Blouses And Its Navigate To Blouses Product")
	public void user_click_the_dresses_along_with_blouses_and_its_navigate_to_blouses_product() {
		actions(obj_Manager.getHome().getWomen());
		actions(obj_Manager.getHome().getBlouse());
		click(obj_Manager.getHome().getBlouse());
	}

	@When("user Select The Size And Color And Compositions And Stylez And Properties And Availability And Manufaturer And Condition")
	public void user_select_the_size_and_color_and_compositions_and_stylez_and_properties_and_availability_and_manufaturer_and_condition() {
		click(obj_Manager.getBlouseCatalog().getSize());
		click(obj_Manager.getBlouseCatalog().getCompositions());
		click(obj_Manager.getBlouseCatalog().getStyle());
		click(obj_Manager.getBlouseCatalog().getProperties());
		click(obj_Manager.getBlouseCatalog().getAvailability());
		click(obj_Manager.getBlouseCatalog().getManufactor());
		click(obj_Manager.getBlouseCatalog().getCondition());
	}

	@When("user Click The Quick View Images And Its Navigate To Add To Card")
	public void user_click_the_quick_view_images_and_its_navigate_to_add_to_card() {
		actions(obj_Manager.getBlouseCatalog().getBlouseImg());
		actions(obj_Manager.getBlouseCatalog().getQuickView());
		click(obj_Manager.getBlouseCatalog().getQuickView());
	}

	@When("user Enter The Quantity And Color And Then Click The Add To Card Button And Its Navigate To Proceed To CheckOut Product Page {string}")
	public void user_enter_the_quantity_and_color_and_theen_click_the_add_to_card_button_and_its_navigate_to_proceed_to_check_out_product_page(
			String quantity) throws InterruptedException {
		frame(0);
		clear(obj_Manager.getFrame().getQuantity());
		sendKeys(obj_Manager.getFrame().getQuantity(), quantity);
		click(obj_Manager.getFrame().getColor());
		click(obj_Manager.getFrame().getAddToCard());

	}

	@When("user Click The Proceed To Checkout Button and Its Navigate To Summary Page")
	public void user_click_the_proceed_to_checkout_button_and_its_navigate_to_summary_page() {
		frame1();
		click(obj_Manager.getCheckout().getCheckout());
	}

	@When("user Confirm The Summary Page Click Then Click Proceed To Checkout Button And Its Navigate To Address Details")
	public void user_confirm_the_summary_page_click_then_click_proceed_to_checkout_button_and_its_navigate_to_address_details() {
		click(obj_Manager.getSummary().getProceed_Checkout1());
	}

	@When("user Confirm The Address And Then Click The Proceed To Checkout Button And Its Navigate Shipping Details")
	public void user_confirm_the_address_and_then_click_the_proceed_to_checkout_button_and_its_navigate_shipping_details() {
		click(obj_Manager.getAddress().getAddress());
	}

	@When("user Click The Proceed To Checkout In Shipping Details And Its Navigate To Payment details")
	public void user_click_the_proceed_to_checkout_in_shipping_details_and_its_navigate_to_payment_details() {
		click(obj_Manager.getShipping().getTerms_Of_Service());
		click(obj_Manager.getShipping().getProceed_To_Checkout3());
	}

	@When("user Click The Payment Option In Payment Details And Its Navigate To Payment Details")
	public void user_click_the_payment_option_in_payment_details_and_its_navigate_to_payment_details() {
		click(obj_Manager.getPayment().getPayment());
	}

	@Then("user Click Confirm My Order And Then Click The Signout Button")
	public void user_click_confirm_my_order_and_then_click_the_signout_button() {
		click(obj_Manager.getConfirmOrder().getConfirm());
		click(obj_Manager.getSignout().getSignout());
	}

	@When("user Click The Dresses Along With Casual Dresses And Its Navigate To Casual Dresses Product")
	public void user_click_the_dresses_along_with_casual_dresses_and_its_navigate_to_casual_dresses_product() {
		actions(obj_Manager.getHome().getDresses());
		actions(obj_Manager.getHome().getCasualDresses());
		click(obj_Manager.getHome().getCasualDresses());
	}

	@When("user Select The Size And Color And The Compositions And The Stylez And The Properties And The Availability And The Manufaturer And The Condition")
	public void user_select_the_size_and_color_and_the_compositions_and_the_stylez_and_the_properties_and_the_availability_and_the_manufaturer_and_the_condition() {
		click(obj_Manager.getCasualCatalog().getSize());
		click(obj_Manager.getCasualCatalog().getCompositions());
		click(obj_Manager.getCasualCatalog().getStyle());
		click(obj_Manager.getCasualCatalog().getProperties());
		click(obj_Manager.getCasualCatalog().getAvailability());
		click(obj_Manager.getCasualCatalog().getManufactor());
		click(obj_Manager.getCasualCatalog().getCondition());
	}

	@When("user Click The Quick View Images And Its Navigate To The Add To Card")
	public void user_click_the_quick_view_images_and_its_navigate_to_the_add_to_card() {
		actions(obj_Manager.getCasualCatalog().getCasualImg());
		actions(obj_Manager.getCasualCatalog().getQuickView());
		click(obj_Manager.getCasualCatalog().getQuickView());
	}

	@When("user Enter The Quantity And The Color And Then Click The Add To Card Button And Its Navigate To Proceed To CheckOut Product Page {string}")
	public void user_enter_the_quantity_and_the_color_and_then_click_the_add_to_card_button_and_its_navigate_to_proceed_to_check_out_product_page(
			String quantity) throws InterruptedException {
		frame(0);
		clear(obj_Manager.getFrame().getQuantity());
		sendKeys(obj_Manager.getFrame().getQuantity(), quantity);
		click(obj_Manager.getFrame().getAddToCard());

	}

	@When("user Click The Proceed To Checkout Button and Its Navigate To The Summary Page")
	public void user_click_the_proceed_to_checkout_button_and_its_navigate_to_the_summary_page() {
		frame1();
		click(obj_Manager.getCheckout().getCheckout());
	}

	@When("user Confirm The Summary Page And Then Click Proceed To Checkout Button And Its Navigate To Address Details")
	public void user_confirm_the_summary_page_and_then_click_proceed_to_checkout_button_and_its_navigate_to_address_details() {
		click(obj_Manager.getSummary().getProceed_Checkout1());
	}

	@When("user Confirm The Address Then Click The Proceed To Checkout Button And Its Navigate To Shipping Details")
	public void user_confirm_the_address_then_click_the_proceed_to_checkout_button_and_its_navigate_to_shipping_details() {
		click(obj_Manager.getAddress().getAddress());
	}

	@When("user Click The Proceed To Checkout In Shipping Details And Its Navigate To The Payment details")
	public void user_click_the_proceed_to_checkout_in_shipping_details_and_its_navigate_to_the_payment_details() {
		click(obj_Manager.getShipping().getTerms_Of_Service());
		click(obj_Manager.getShipping().getProceed_To_Checkout3());
	}

	@When("user Click The Payment Options In Payment Details And Its Navigate To The Paymenet Details")
	public void user_click_the_payment_options_in_payment_details_and_its_navigate_to_the_paymenet_details() {
		click(obj_Manager.getPayment().getPayment());
	}

	@Then("user Click Confirm My Order And Then Click Signout Button")
	public void user_click_confirm_my_order_and_then_click_signout_button() {
		click(obj_Manager.getConfirmOrder().getConfirm());
		click(obj_Manager.getSignout().getSignout());
	}

	@When("user Click The T-Shirts Along And Its Navigate To The T-Shirts Products")
	public void user_click_the_t_shirts_along_and_its_navigate_to_the_t_shirts_products() {
		click(obj_Manager.getHome().getTshirt());
	}

	@When("user Select The Size And The Color And The Compositions And The Stylez And The Properties And The Availability And The Manufaturer And The Condition")
	public void user_select_the_size_and_the_color_and_the_compositions_and_the_stylez_and_the_properties_and_the_availability_and_the_manufaturer_and_the_condition() {
		click(obj_Manager.getT_Catalog().getSize());
		click(obj_Manager.getT_Catalog().getCompositions());
		click(obj_Manager.getT_Catalog().getStyle());
		click(obj_Manager.getT_Catalog().getProperties());
		click(obj_Manager.getT_Catalog().getAvailability());
		click(obj_Manager.getT_Catalog().getManufactor());
		click(obj_Manager.getT_Catalog().getCondition());
	}

	@When("user Click The Quick View Images")
	public void user_click_the_quick_view_images() {
		actions(obj_Manager.getT_Catalog().getTshirtImg());
		actions(obj_Manager.getT_Catalog().getQuickView());
		click(obj_Manager.getT_Catalog().getQuickView());
	}

	@When("user Enter The Quantity And The Color And Theen Click The Add To Card Button {string}")
	public void user_enter_the_quantity_and_the_color_and_theen_click_the_add_to_card_button(String quantity)
			throws InterruptedException {
		frame(0);
		clear(obj_Manager.getFrame().getQuantity());
		sendKeys(obj_Manager.getFrame().getQuantity(), quantity);
		click(obj_Manager.getFrame().getBluecolor());
		click(obj_Manager.getFrame().getAddToCard());
	}

	@When("user Click The Proceed To Checkout Button")
	public void user_click_the_proceed_to_checkout_button() {
		frame1();
		click(obj_Manager.getCheckout().getCheckout());
	}

	@When("user Confirm The Summary Page And Then Click Proceed To Checkout Button")
	public void user_confirm_the_summary_page_and_then_click_proceed_to_checkout_button() {
		click(obj_Manager.getSummary().getProceed_Checkout1());
	}

	@When("user Confirm The Address Then Click The Proceed To Checkout Button")
	public void user_confirm_the_address_then_click_the_proceed_to_checkout_button() {
		click(obj_Manager.getAddress().getAddress());
	}

	@When("user Click The Proceed To Checkout In Shipping Details")
	public void user_click_the_proceed_to_checkout_in_shipping_details() {
		click(obj_Manager.getShipping().getTerms_Of_Service());
		click(obj_Manager.getShipping().getProceed_To_Checkout3());
	}

	@When("user Click The Payment Options In Payment Details")
	public void user_click_the_payment_options_in_payment_details() {
		click(obj_Manager.getPayment().getPayment());
	}

	@Then("user Click The Confirm My Order And Then Click The Signout Button")
	public void user_click_the_confirm_my_order_and_then_click_the_signout_button() {
		click(obj_Manager.getConfirmOrder().getConfirm());
	}

}
