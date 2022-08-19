package com.Automation.Pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddressPage {
	public WebDriver driver;
	@FindBy(xpath = "//span[text()='Proceed to checkout']")
	private WebElement address;

	public AddressPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public WebElement getAddress() {
		return address;
	}
}
