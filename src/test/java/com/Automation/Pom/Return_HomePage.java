package com.Automation.Pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Return_HomePage {
public WebDriver driver;
@FindBy(xpath = "//i[@class='icon-home']")
private WebElement returnHome;
public Return_HomePage(WebDriver driver2) {
	this.driver = driver2;
	PageFactory.initElements(driver, this);
}
public WebElement getReturnHome() {
	return returnHome;
}

}
