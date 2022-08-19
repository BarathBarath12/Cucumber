package com.Automation.Pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SigninPage {
	public WebDriver driver;
	@FindBy(xpath = "//input[@id='email']")
	private WebElement email;
	@FindBy(xpath = "//input[@id='passwd']")
	private WebElement password;
	@FindBy(xpath = "//button[@id='SubmitLogin']/span")
	private WebElement signin;

	public SigninPage(WebDriver driver2) {
		this.driver = driver2;
		PageFactory.initElements(driver, this);
	}

	public WebElement getEmail() {
		return email;
	}

	public WebElement getPassword() {
		return password;
	}

	public WebElement getSignin() {
		return signin;
	}
}
