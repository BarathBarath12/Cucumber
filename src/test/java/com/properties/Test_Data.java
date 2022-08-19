package com.properties;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Test_Data {
	public static Properties p;

	public Test_Data() throws IOException {

		File f = new File("C:\\Users\\barat\\eclipse-workspace-4\\Cucumber\\src\\test\\java\\com\\properties\\TestData.properties");
		FileInputStream fs = new FileInputStream(f);
		p = new Properties();
		p.load(fs);
	}

	public String getBrowser() {
		// TODO Auto-generated method stub
		String property = p.getProperty("browser");
		return property;
	}

	public String getUrl() {
		// TODO Auto-generated method stub
		String url = p.getProperty("url"); 
		return url;
	}

}
