package com.RunnerClass;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import com.BaseClass.UtilityFiles1;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "Hook_Feature", 
glue = "com.adactinhook.step", monochrome = true, tags =("@Ad1 or @Ad2"))

public class Runner_Class_With_Hooks {

	public static WebDriver driver;

	@BeforeClass
	public static void set_Up() throws InterruptedException {
		driver = UtilityFiles1.getBrowser("chrome");
	}

	@AfterClass
	public static void tear_Up() {
		driver = UtilityFiles1.close();
	}
}
