package com.Automation.Pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ViewMyAccount {
	public ViewMyAccount(WebDriver driver2) {
		this.driver = driver2;
		PageFactory.initElements(driver, this);
	}
	public WebDriver driver;
	@FindBy(xpath = "//a[@title='Log in to your customer account']")
	private WebElement account;
	public WebElement getAccount() {
		return account;
	}
}
