package com.Automation.Pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ShippingPage {
public WebDriver driver;
@FindBy(xpath = "//input[@type='checkbox']")
private WebElement terms_Of_Service;
@FindBy(xpath = "//p[@class='cart_navigation clearfix']/descendant::button/span")
private WebElement proceed_To_Checkout3;
public ShippingPage(WebDriver driver2) {
	this.driver = driver2;
	PageFactory.initElements(driver, this);
}
public WebElement getTerms_Of_Service() {
	return terms_Of_Service;
}
public WebElement getProceed_To_Checkout3() {
	return proceed_To_Checkout3;
}
}
