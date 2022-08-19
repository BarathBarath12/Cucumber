package com.Automation.Pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MyAccount {
public WebDriver driver;
@FindBy(xpath = "//span[text()='Order history and details']")
private WebElement orderHistory;
public MyAccount(WebDriver driver2) {
	this.driver = driver2;
	PageFactory.initElements(driver, this);
}
public WebElement getOrderHistory() {
	return orderHistory;
}
}
