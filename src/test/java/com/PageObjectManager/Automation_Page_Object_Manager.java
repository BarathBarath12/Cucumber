package com.PageObjectManager;

import org.openqa.selenium.WebDriver;

import com.Automation.Pom.AddressPage;
import com.Automation.Pom.Blouse_Catalog_Page;
import com.Automation.Pom.Confrim_Order;
import com.Automation.Pom.Dresses_Casual_Catalog;
import com.Automation.Pom.FramePage;
import com.Automation.Pom.HomePage;
import com.Automation.Pom.MyAccount;
import com.Automation.Pom.PaymentPage;
import com.Automation.Pom.Proceed_To_Checkout;
import com.Automation.Pom.Return_HomePage;
import com.Automation.Pom.ShippingPage;
import com.Automation.Pom.SigninPage;
import com.Automation.Pom.Signout_Page;
import com.Automation.Pom.SummaryPage;
import com.Automation.Pom.Tshirt_Catalog;
import com.Automation.Pom.ViewMyAccount;

public class Automation_Page_Object_Manager {
	public WebDriver driver;
	private HomePage home;
	private Blouse_Catalog_Page blouseCatalog;
	private Dresses_Casual_Catalog casualCatalog;
	private FramePage frame;
	private Proceed_To_Checkout checkout;
	private SummaryPage summary;
	private SigninPage signin;
	private AddressPage address;
	private ShippingPage shipping;
	private PaymentPage payment;
	private Confrim_Order confirmOrder;
	private Return_HomePage returnHome;
	private ViewMyAccount accountView;
	private MyAccount order;
	private Signout_Page signout;
	private Tshirt_Catalog t_Catalog;
	public Automation_Page_Object_Manager(WebDriver driver) {
		this.driver = driver;

	}

	public HomePage getHome() {
		if (home == null) {

			home = new HomePage(driver);
		}
		return home;
	}

	public Blouse_Catalog_Page getBlouseCatalog() {
		if (blouseCatalog == null) {

			blouseCatalog = new Blouse_Catalog_Page(driver);
		}
		return blouseCatalog;
	}
	public Dresses_Casual_Catalog getCasualCatalog() {
		if (casualCatalog == null) {
			casualCatalog = new Dresses_Casual_Catalog(driver);
		}
		return casualCatalog;
	}
	public FramePage getFrame() {
		if (frame == null) {

			frame = new FramePage(driver);
		}
		return frame;
	}

	public Proceed_To_Checkout getCheckout() {
		if (checkout == null) {
			checkout = new Proceed_To_Checkout(driver);
		}
		return checkout;
	}

	public SummaryPage getSummary() {
		if (summary == null) {
			summary = new SummaryPage(driver);
		}
		return summary;
	}

	public SigninPage getSignin() {
		if (signin == null) {
			signin = new SigninPage(driver);
		}
		return signin;
	}

	public AddressPage getAddress() {
		if (address == null) {
			address = new AddressPage(driver);
		}
		return address;
	}

	public ShippingPage getShipping() {
		if (shipping == null) {
			shipping = new ShippingPage(driver);
		}
		return shipping;
	}

	public PaymentPage getPayment() {
		if (payment == null) {
			payment = new PaymentPage(driver);
		}
		return payment;
	}

	public Confrim_Order getConfirmOrder() {
		if (confirmOrder == null) {
			confirmOrder = new Confrim_Order(driver);
		}
		return confirmOrder;
	}

	public Return_HomePage getReturnHome() {
		if (returnHome == null) {
			returnHome = new Return_HomePage(driver);
		}
		return returnHome;
	}

	public ViewMyAccount getAccountView() {
		if (accountView == null) {
			accountView = new ViewMyAccount(driver);
		}
		return accountView;
	}

	public MyAccount getViewOrder() {
		if (order == null) {
			order = new MyAccount(driver);
		}
		return order;
	}

	public Signout_Page getSignout() {
		if (signout == null) {
			signout = new Signout_Page(driver);

		}
		return signout;
	}
	public Tshirt_Catalog getT_Catalog() {
		if (t_Catalog == null) {
			t_Catalog = new Tshirt_Catalog(driver);
		}
		return t_Catalog;
	}
}
