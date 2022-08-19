package com.Automation.Pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	public WebDriver driver;
	@FindBy(xpath = "//a[@title='Women']")
	private WebElement women;
	@FindBy(xpath = "//a[@title='Blouses']")
	private WebElement blouse;
	@FindBy(xpath = "//ul[@class='sf-menu clearfix menu-content sf-js-enabled sf-arrows']/descendant::li[10]/a")
	private WebElement dresses;
	@FindBy(xpath = "//ul[@class='sf-menu clearfix menu-content sf-js-enabled sf-arrows']/descendant::li[11]/a")
	private WebElement casualDresses;
	@FindBy(xpath = "//div[@id='block_top_menu']/ul/li[3]/a")
	private WebElement tshirt;

	public HomePage(WebDriver driver2) {
		this.driver = driver2;
		PageFactory.initElements(driver, this);
	}

	public WebElement getWomen() {
		return women;
	}

	public WebElement getBlouse() {
		return blouse;
	}

	public WebElement getTshirt() {
		return tshirt;
	}

	public WebElement getDresses() {
		return dresses;
	}

	public WebElement getCasualDresses() {
		return casualDresses;
	}

}
