package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CarGuideHomePageElement {

	@FindBy(linkText = "buy + sell")
	public WebElement buyAndSellLink;

	@FindBy(linkText = "New")
	public WebElement newCarLink;

	
}
