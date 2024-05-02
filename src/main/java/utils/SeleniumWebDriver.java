package utils;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SeleniumWebDriver {

	public static SeleniumWebDriver seleniumWebdriver;

	public static WebDriver driver;

	public static int PAGELOADTIMEOUT = 50;
	public static int IMPLICITWAIT = 30;

	private SeleniumWebDriver() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(PAGELOADTIMEOUT));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(IMPLICITWAIT));

	}

	public static WebDriver getDriver() {
		return driver;
	}

	public static void setDriver() {
		if (driver != null) {
			seleniumWebdriver = new SeleniumWebDriver();
		}

	}

	public static void openPage(String url) {
		driver.get(url);
	}
	public static void tearDown() {
		if(driver!=null) {
			driver.quit();
			driver.close();
		}
	}

}
