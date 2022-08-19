package com.Adactin.Pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Adactin_Serach_Hotel {
	public WebDriver driver;
	@FindBy(xpath = "//select[@name='location']")
	private WebElement location;
	@FindBy(xpath = "//select[@name='hotels']")
	private WebElement hotels;
	@FindBy(xpath = "//select[@id='room_type']")
	private WebElement roomType;
	@FindBy(xpath = "//select[@name='room_nos']")
	private WebElement number_Of_Rooms;
	@FindBy(xpath = "//input[@name='datepick_in']")
	private WebElement check_In_Date;
	@FindBy(xpath = "//input[@name='datepick_out']")
	private WebElement check_Out_Date;
	@FindBy(xpath = "//select[@name='adult_room']")
	private WebElement adult_Room;
	@FindBy(xpath = "//select[@name='child_room']")
	private WebElement child_Room;
	@FindBy(xpath = "//input[@name='Submit']")
	private WebElement search;

	public Adactin_Serach_Hotel(WebDriver driver2) {
		this.driver = driver2;
		PageFactory.initElements(driver, this);
	}

	public WebElement getLocation() {
		return location;
	}

	public WebElement getHotels() {
		return hotels;
	}

	public WebElement getRoomType() {
		return roomType;
	}

	public WebElement getNumber_Of_Rooms() {
		return number_Of_Rooms;
	}

	public WebElement getCheck_In_Date() {
		return check_In_Date;
	}

	public WebElement getCheck_Out_Date() {
		return check_Out_Date;
	}

	public WebElement getAdult_Room() {
		return adult_Room;
	}

	public WebElement getChild_Room() {
		return child_Room;
	}

	public WebElement getSearch() {
		return search;
	}

}
