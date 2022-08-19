package com.Automation.Pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Proceed_To_Checkout {
	public WebDriver driver;
	@FindBy(xpath = "//a[@title='Proceed to checkout']/child::span")
	private WebElement checkout;
	public Proceed_To_Checkout(WebDriver driver2) {
		this.driver = driver2;
		PageFactory.initElements(driver, this);
	
	}
	public WebElement getCheckout() {
		return checkout;
	}

}
