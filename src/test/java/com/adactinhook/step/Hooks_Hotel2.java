package com.adactinhook.step;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import com.BaseClass.UtilityFiles1;
import com.PageObjectManager.Adactin_Page_Object_Manager;
import com.RunnerClass.Runner_Class_With_Hooks;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks_Hotel2 extends UtilityFiles1 {
	public static WebDriver driver = Runner_Class_With_Hooks.driver;
	public static Adactin_Page_Object_Manager objManager = new Adactin_Page_Object_Manager(driver);

	@Before(order = 1, value = "@Ad2")
	public static void login() throws InterruptedException {
		click1(objManager.getPage().getLogin1());
		
		
	}

	@Before(order = 2, value = "@Ad2")
	public static void credentials() {
		sendKeys(objManager.getPage().getUsername(), "BarathBarath");
		sendKeys(objManager.getPage().getPassword(), "Barath@12");
		click(objManager.getPage().getLogin());
		String expected = "https://adactinhotelapp.com/SearchHotel.php";
		String actual = driver.getCurrentUrl();
		Assert.assertEquals(expected, actual);

	}

	@Before(order = 3, value = "@Ad2")
	public static void Search_Hotel() {
		// TODO Auto-generated method stub
		select_By_Index(objManager.getSearch().getLocation(), 2);
		select_By_Index(objManager.getSearch().getHotels(), 1);
		select_By_Text(objManager.getSearch().getRoomType(), "Standard");
		select_By_Index(objManager.getSearch().getNumber_Of_Rooms(), 3);
		clear(objManager.getSearch().getCheck_In_Date());
		sendKeys(objManager.getSearch().getCheck_In_Date(), "09/09/2022");
		clear(objManager.getSearch().getCheck_Out_Date());
		sendKeys(objManager.getSearch().getCheck_Out_Date(), "19/09/2022");
		select_By_Value(objManager.getSearch().getAdult_Room(), "2");
		select_By_Index(objManager.getSearch().getChild_Room(), 2);
		click(objManager.getSearch().getSearch());
		String expected = "https://adactinhotelapp.com/SelectHotel.php";
		String actual = driver.getCurrentUrl();
		Assert.assertEquals(expected, actual);
	}

	@Before(order = 4, value = "@Ad2")
	public static void select_Hote() throws InterruptedException {
		click1(objManager.getSelect().getRadioButton());
		click(objManager.getSelect().getContinues());
		String expected = "https://adactinhotelapp.com/BookHotel.php";
		String actual = driver.getCurrentUrl();
		Assert.assertEquals(expected, actual);
	}

	@After(order = 7, value = "@Ad2")
	public static void booking_Confrimation() throws InterruptedException {
		// TODO Auto-generated method stub
		click1(objManager.getConfirm().getMyItinerary());
	}

	@After(order = 6, value = "@Ad2")
	public static void myItinerary() throws InterruptedException {
		// TODO Auto-generated method stub
		click1(objManager.getLogout().getLogout());
	}

}
