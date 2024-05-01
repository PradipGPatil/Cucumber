package pagesAction;

import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import pages.CarGuideHomePageElement;
import utils.SeleniumWebDriver;

public class CarGuidHomePageAction {

	public CarGuideHomePageElement carGuideHomeElement=null;
	
	public CarGuidHomePageAction() {
		carGuideHomeElement=new CarGuideHomePageElement();
		PageFactory.initElements(SeleniumWebDriver.getDriver(), carGuideHomeElement);
	}
	
	public void moveToSellAndBuyMenu() {
		Actions action=new Actions(SeleniumWebDriver.getDriver());
		action.moveToElement(carGuideHomeElement.buyAndSellLink).build().perform();;
	}
	
	public void clickOnNewCarLink() {
		carGuideHomeElement.newCarLink.click();
	}

}
