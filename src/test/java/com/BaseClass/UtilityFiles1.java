package com.BaseClass;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.List;
import java.util.Set;
import org.apache.commons.io.FileUtils;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class UtilityFiles1 {
	public static WebDriver driver;

	public static WebDriver getBrowser(String name) {
		if (name.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") +"\\Drive\\chromedriver104.exe");
			driver = new ChromeDriver();

		} else if (name.equalsIgnoreCase("edge")) {
			System.setProperty("webdriver.edge.driver", System.getProperty("user.dir") + "\\Drive\\msedgedriver.exe");
			driver = new EdgeDriver();
		}
		driver.manage().window().maximize();
		return driver;
	}

	public static void getUrl(String url) {
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.manage().window().maximize();
		
	}

	public static void actions(WebElement name) {
		Actions a = new Actions(driver);
		a.moveToElement(name).perform();
	}

	public static void actions1(WebElement name, String value) {
		Actions a = new Actions(driver);
		if (value.equalsIgnoreCase("click")) {
			a.click(name).perform();
		} else if (value.equalsIgnoreCase("doubleClick")) {
			a.doubleClick(name).perform();
		} else if (value.equalsIgnoreCase("contextClick")) {
			a.contextClick(name).perform();
		} else if (value.equalsIgnoreCase("clickAndHold")) {
			a.clickAndHold(name).perform();
		} else if (value.equalsIgnoreCase("release")) {
			a.release(name).perform();
		}
	}

//	public static void dropDown(WebElement a, String type, String value) {
//		Select s = new Select(a);
//		if (type.equalsIgnoreCase("bytext")) {
//			s.selectByVisibleText(value);
//		} else if (type.equalsIgnoreCase("byvalue")) {
//			s.deselectByValue(value);
//		} else if (type.equalsIgnoreCase("byindex")) {
//
//			int parseInt = Integer.parseInt(value);
//			System.out.println(parseInt);
//
//		}
//	}
	public static void select_By_Value(WebElement a, String value) {
		Select s = new Select(a);
		s.selectByValue(value);
	}

	public static void select_By_Text(WebElement a, String value) {
		Select s = new Select(a);
		s.selectByVisibleText(value);
	}

	public static void select_By_Index(WebElement a, int value) {
		Select s = new Select(a);
		s.selectByIndex(value);
	}

	public static void click(WebElement a) {
		a.click();
	}

	public static void frame(int a) throws InterruptedException {
		driver.switchTo().frame(a);
	}

	public static void clear(WebElement a) {
		a.clear();
	}

	public static String sendKeys(WebElement a, String name) {
		a.sendKeys(name);
		return name;
	}

	public static void frame1() {
		driver.switchTo().defaultContent();
	}

	public static void javaSript(WebElement a) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView()", a);
	}

	public static void checkBox(WebElement a) {
		a.click();
	}

	public static void isSelect(WebElement a) {
		a.isSelected();
	}

	public static void isDisplay(WebElement a) {
		a.isDisplayed();
	}

	public static void isEnable(WebElement a) {
		a.isEnabled();
	}

	public static void radioButton(WebElement a) {
		a.click();
	}

	public static void click1(WebElement a) throws InterruptedException {
		Thread.sleep(2000);
		a.click();
	}

	public static void quit() {
		driver.quit();
	}

	public static WebDriver close() {
		driver.close();
		return driver;
		
	}

	public static void navigate_To(String url) {
		driver.navigate().to(url);
	}

	public static void navigate_Back() {
		driver.navigate().back();
	}

	public static void navigate_Forward() {
		driver.navigate().forward();
	}

	public static void navigate_Refersh() {
		driver.navigate().refresh();
	}

	public static void window_Handle() {
		String handle = driver.getWindowHandle();
		Set<String> set = driver.getWindowHandles();
		for (String a : set) {
			if (a.equals(handle)) {
				continue;
			} else {
				driver.switchTo().window(a);

			}
		}

	}

	public static void robot() throws AWTException {
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
	}

	public static WebElement getTitile(WebElement a) {
		a.getText();
		return a;
	}

	public static void explicitWaitAlert() {
		// TODO Auto-generated method stub
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.alertIsPresent());
	}

	public static void explicit_Wait_Visibility(WebElement a) {
		// TODO Auto-generated method stub
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOf(a));
	}

	public static void explicit_Wait_Invisibility(WebElement a) {
		// TODO Auto-generated method stub
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.invisibilityOf(a));
	}

	public static String getCurrentUrl() {
		// TODO Auto-generated method stub
		String currentUrl = driver.getCurrentUrl();
		return currentUrl;
	}

	public static WebElement get_Tag_Name(WebElement a) {
		// TODO Auto-generated method stub
		a.getTagName();
		return a;
	}

	public static WebElement getText(WebElement a) {
		// TODO Auto-generated method stub
		a.getText();
		return a;
	}

	public static WebElement getAttribute(WebElement a, String name) {
		// TODO Auto-generated method stub
		a.getAttribute(name);
		return a;
	}

	public static void ismultiple(WebElement a) {
		// TODO Auto-generated method stub
		Select s1 = new Select(a);
		s1.isMultiple();
	}

	public static void get_First_Select_Option(WebElement a) {
		// TODO Auto-generated method stub
		Select s2 = new Select(a);
		s2.getFirstSelectedOption();
	}

	public static void m1(String els) throws IOException {
		TakesScreenshot ts = (TakesScreenshot) driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		File destination = new File(els);
		FileUtils.copyFile(source, destination);
	}

	public static WebElement getAllOptions(WebElement a) {

		Select s2 = new Select(a);
		List<WebElement> allOptions = s2.getOptions();
		for (int i = 0; i <= allOptions.size() - 1; i++) {

		}

//		for (WebElement webElement : allOptions) {

//		}
		return a;
	}

	public static WebElement get_All_Selected_Options(WebElement a) {
		// TODO Auto-generated method stub
		Select s1 = new Select(a);

		List<WebElement> d1 = s1.getOptions();
		for (int i = 0; i < d1.size(); i++) {

			if (d1.get(i).getText().equals("The Avengers") || d1.get(i).getText().equals("Batwoman")) {
				s1.getAllSelectedOptions();

			}
		}
		return a;
	}

	public static String particular_Cell(String location, int a, int rows, int cells) throws IOException {
		File f = new File(location);
		FileInputStream fs = new FileInputStream(f);
		Workbook book = new XSSFWorkbook(fs);
		Sheet s = book.getSheetAt(a);
		Row row = s.getRow(rows);
		Cell cell = row.getCell(cells);
		CellType type = cell.getCellType();

		String value = null;
		if (type.equals(CellType.STRING)) {
			value = cell.getStringCellValue();
		} else if (type.equals(CellType.NUMERIC)) {
			double value1 = cell.getNumericCellValue();
			value = String.valueOf(value1);
		}
		book.close();
		return value;

	}
}
