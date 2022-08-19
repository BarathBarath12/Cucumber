package com.Automation.Pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Dresses_Casual_Catalog {
	public Dresses_Casual_Catalog(WebDriver driver2) {
		this.driver = driver2;
		PageFactory.initElements(driver, this);
	}

	public WebDriver driver;
	@FindBy(xpath = "//ul[@id='ul_layered_id_attribute_group_1']/descendant::li/div/span/input[@id='layered_id_attribute_group_1']")
	private WebElement size;
	@FindBy(xpath = "//input[@id='layered_id_feature_5']")
	private WebElement compositions;
	@FindBy(xpath = "//ul[@id='ul_layered_id_feature_6']/li/div/span/input")
	private WebElement style;
	@FindBy(xpath = "//input[@id='layered_id_feature_18']")
	private WebElement properties;
	@FindBy(xpath = "//input[@id='layered_quantity_1']")
	private WebElement availability;
	@FindBy(xpath = "//input[@id='layered_manufacturer_1']")
	private WebElement manufactor;
	@FindBy(xpath = "//input[@id='layered_condition_new']")
	private WebElement condition;
	@FindBy(xpath = "//img[@title='Printed Dress']")
	private WebElement casualImg;
	@FindBy(xpath = "//span[text()='Quick view']")
	private WebElement quickView;

	public WebElement getSize() {
		return size;
	}

	public WebElement getCompositions() {
		return compositions;
	}

	public WebElement getStyle() {
		return style;
	}

	public WebElement getProperties() {
		return properties;
	}

	public WebElement getAvailability() {
		return availability;
	}

	public WebElement getManufactor() {
		return manufactor;
	}

	public WebElement getCondition() {
		return condition;
	}

	public WebElement getCasualImg() {
		return casualImg;
	}

	public WebElement getQuickView() {
		return quickView;
	}

}
