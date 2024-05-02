package step;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import cucumber.api.Scenario;
import utils.SeleniumWebDriver;

public class AfterAction {

	public static void tearDown(Scenario scenario) {

		WebDriver driver = SeleniumWebDriver.getDriver();
		System.out.println(scenario.isFailed());
		if (scenario.isFailed()) {
			byte[] screenshotBytes = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
			scenario.embed(screenshotBytes, "image/png");

		}
		SeleniumWebDriver.tearDown();
	}

}
