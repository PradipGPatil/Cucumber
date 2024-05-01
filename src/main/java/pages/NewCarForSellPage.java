package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class NewCarForSellPage {
	@FindBy(id = "make")
	public WebElement makeDropDown;

	@FindBy(id = "model")
	public WebElement modelDropDown;

	@FindBy(id = "state")
	public WebElement stateDropDown;

	@FindBy(xpath = "button[ class *=\"searchForm--showBtn\"]")
	public WebElement showNewVehicalBtn;
}
