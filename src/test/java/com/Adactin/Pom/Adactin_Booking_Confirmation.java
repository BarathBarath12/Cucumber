package com.Adactin.Pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Adactin_Booking_Confirmation {
	public WebDriver driver;
	@FindBy(xpath = "//input[@name='my_itinerary']")
	private WebElement myItinerary;

	public Adactin_Booking_Confirmation(WebDriver driver2) {
		this.driver = driver2;
		PageFactory.initElements(driver, this);
	}

	public WebElement getMyItinerary() {
		return myItinerary;
	}
}
