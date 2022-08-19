package com.Automation.Pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class  Blouse_Catalog_Page {
	public WebDriver driver;
	@FindBy(xpath = "//ul[@id='ul_layered_id_attribute_group_1']/descendant::li/div/span/input[@id='layered_id_attribute_group_1']")
	private WebElement size;
	@FindBy(xpath = "//input[@id='layered_id_feature_5']")
	private WebElement compositions;
	@FindBy(xpath = "//input[@id='layered_id_feature_11']")
	private WebElement style;
	@FindBy(xpath = "//input[@id='layered_id_feature_17']")
	private WebElement properties;
	@FindBy(xpath = "//input[@id='layered_quantity_1']")
	private WebElement availability;
	@FindBy(xpath = "//input[@id='layered_manufacturer_1']")
	private WebElement manufactor;
	@FindBy(xpath = "//input[@id='layered_condition_new']")
	private WebElement condition;
	@FindBy(xpath = "//img[@title='Blouse']")
	private WebElement blouseImg;
	@FindBy(xpath = "//span[text()='Quick view']")
	private WebElement quickView;

	public Blouse_Catalog_Page(WebDriver driver2) {
		this.driver = driver2;
		PageFactory.initElements(driver, this);
	}

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

	public WebElement getQuickView() {
		return quickView;
	}

	public WebElement getBlouseImg() {
		return blouseImg;
	}

	

}
