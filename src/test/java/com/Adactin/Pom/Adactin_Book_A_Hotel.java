package com.Adactin.Pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Adactin_Book_A_Hotel {
	public WebDriver driver;
	@FindBy(xpath = "//input[@name='first_name']")
	private WebElement name;
	@FindBy(xpath = "//input[@name='last_name']")
	private WebElement lastName;
	@FindBy(xpath = "//textarea[@name='address']")
	private WebElement address;
	@FindBy(xpath = "//input[@name='cc_num']")
	private WebElement cardNumber;
	@FindBy(xpath = "//select[@name='cc_type']")
	private WebElement cardType;
	@FindBy(xpath = "//select[@name='cc_exp_month']")
	private WebElement expDate;
	@FindBy(xpath = "//select[@name='cc_exp_year']")
	private WebElement expYear;
	@FindBy(xpath = "//input[@name='cc_cvv']")
	private WebElement cvv;
	@FindBy(xpath = "//input[@name='book_now']")
	private WebElement bookNow;

	public Adactin_Book_A_Hotel(WebDriver driver2) {
		this.driver = driver2;
		PageFactory.initElements(driver, this);
	}

	public WebElement getName() {
		return name;
	}

	public WebElement getLastName() {
		return lastName;
	}

	public WebElement getAddress() {
		return address;
	}

	public WebElement getCardNumber() {
		return cardNumber;
	}

	public WebElement getCardType() {
		return cardType;
	}

	public WebElement getExpDate() {
		return expDate;
	}

	public WebElement getExpYear() {
		return expYear;
	}

	public WebElement getCvv() {
		return cvv;
	}

	public WebElement getBookNow() {
		return bookNow;
	}
}
