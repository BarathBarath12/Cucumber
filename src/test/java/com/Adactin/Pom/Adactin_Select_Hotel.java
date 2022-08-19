package com.Adactin.Pom;

import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Adactin_Select_Hotel {
	public WebDriver driver;
	@FindBy(xpath = "//input[@name='radiobutton_0']")
	private WebElement radioButton;
	@FindBy(xpath = "//input[@name='continue']")
	private WebElement continues;

	public Adactin_Select_Hotel(WebDriver driver2) {
		this.driver = driver2;
		PageFactory.initElements(driver, this);
	}

	public WebElement getRadioButton() {
		return radioButton;
	}

	public WebElement getContinues() {
		return continues;
	}
}
