package com.Automation.Pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SummaryPage {
	public WebDriver driver;
	@FindBy(xpath = "//p[@class='cart_navigation clearfix']/descendant::a/span")
	private WebElement proceed_Checkout1;
	public SummaryPage(WebDriver driver2) {
		this.driver = driver2;
		PageFactory.initElements(driver, this);
	}
	public WebElement getProceed_Checkout1() {
		return proceed_Checkout1;
	}
}
