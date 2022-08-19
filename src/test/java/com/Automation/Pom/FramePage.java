package com.Automation.Pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FramePage {

	public WebDriver driver;
	@FindBy(xpath = "//p[@id='quantity_wanted_p']/input")
	private WebElement quantity;
	@FindBy(xpath = "//a[@name='White']")
	private WebElement color;
	@FindBy(xpath = "//a[@name='Blue']")
	private WebElement bluecolor;

	@FindBy(xpath = "//p[@id='add_to_cart']/button/span")
	private WebElement addToCard;

	public FramePage(WebDriver driver2) {
		this.driver = driver2;
		PageFactory.initElements(driver, this);
	}

	public WebElement getQuantity() {
		return quantity;
	}

	public WebElement getColor() {
		return color;
	}

	public WebElement getAddToCard() {
		return addToCard;
	}

	public WebElement getBluecolor() {
		return bluecolor;
	}
}
