package com.RunnerClass;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import com.BaseClass.UtilityFiles1;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "C:\\Users\\barat\\eclipse-workspace-4\\Cucumber\\Automatin Feature\\Automation.feature",
glue = "com.StepDefinition", monochrome = true, dryRun = false, publish = true, 
tags = ("@Dresses or @CasualDresses or @Tshirts"), 
plugin = {"html:Reports/automation.html", "json:Reports/automation.json","pretty"})
public class Automation_RunnerClass {
	public static WebDriver driver;

	@BeforeClass
	public static void set_Up() {
		// TODO Auto-generated method stub
		driver = UtilityFiles1.getBrowser("chrome");
	}

	@AfterClass
	public static void tear_Down() {
		// TODO Auto-generated method stub
		driver = UtilityFiles1.close();
	}
}
