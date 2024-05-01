package pagesAction;

import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import pages.NewCarForSellPage;
import utils.SeleniumWebDriver;

public class CarSearchPageActions {

	public NewCarForSellPage newCarForSellElement;

	public CarSearchPageActions() {
		newCarForSellElement = new NewCarForSellPage();
		PageFactory.initElements(SeleniumWebDriver.getDriver(), newCarForSellElement);
	}

	public void selectMaker(String carMaker) {
		Select select = new Select(newCarForSellElement.makeDropDown);
		select.selectByVisibleText("BMW");
	}
	
	public void selectModelFromDropdonw(String carModel) {
		Select select = new Select(newCarForSellElement.modelDropDown);
		select.selectByVisibleText("3 Series");

	}

	public void selectLocationFromDropdonw(String carlocation) {
		Select select = new Select(newCarForSellElement.stateDropDown);
		select.selectByVisibleText("South Australia");

	}

	public void clickOnShowNewVehicalBtn() {
		newCarForSellElement.showNewVehicalBtn.click();
	}
}
