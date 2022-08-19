package com.RunnerClass;

import org.openqa.selenium.WebDriver;
import com.BaseClass.UtilityFiles1;
import com.properties.Sigleton_Design_Pattern;

import java.io.IOException;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "C:\\Users\\barat\\eclipse-workspace-4\\Cucumber\\Feature\\Adactin.feature", 
glue = "com.Adactin.Setp.Def", monochrome = true,
dryRun = false, publish = true, tags = ("@Ad1 or @Ad2 or @Ad3"), plugin = {
		"html:Reports/report.html", "json:Reports/jreport.json", "pretty"

})

public class Adactin_Runner_Class {
	public static WebDriver driver;

	@BeforeClass
	public static void set_Up() throws InterruptedException, IOException {
		String browser = Sigleton_Design_Pattern.get_Sdp().get_Instance_Test_Data().getBrowser();
		driver = UtilityFiles1.getBrowser(browser);
	}

	@AfterClass
	public static void tear_Up() {
		driver = UtilityFiles1.close();
	}
}
