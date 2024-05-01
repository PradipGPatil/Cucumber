package step;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pagesAction.CarGuidHomePageAction;
import pagesAction.CarSearchPageActions;
import utils.SeleniumWebDriver;

public class SearchCarStep {
	CarGuidHomePageAction carGuidHoamePageAction;
	public CarSearchPageActions carSearchPageActions;

	@Given("i go to home page of {string} url")
	public void i_go_to_home_page_of_url(String webUrl) {
		SeleniumWebDriver.openPage(webUrl);
	}

	@When("i mouse over the buy+sell option")
	public void i_mouse_over_the_option() {
		carGuidHoamePageAction=new CarGuidHomePageAction();
		carGuidHoamePageAction.moveToSellAndBuyMenu();
	}

	@And("I click on {string} car menu")
	public void i_click_on_car_menu(String subMenu) {
		carGuidHoamePageAction.clickOnNewCarLink();
	}

	@And("select {string} as maker from makersdropdown")
	public void select_as_maker_from_makersdropdown(String carMakers) {
		carSearchPageActions.selectMaker(carMakers);
	}

	@And("select {string} model from modeldropdown")
	public void select_model_from_modeldropdown(String carModel) {
		carSearchPageActions.selectMaker(carModel);
	}

	@And("click on {string} button")
	public void click_on_button(String string) {
		carSearchPageActions.clickOnShowNewVehicalBtn();
	}

	@Then("I should see list of the cars")
	public void i_should_see_list_of_the_cars() {
		// Write code here that turns the phrase above into concrete actions
		throw new io.cucumber.java.PendingException();
	}

	@And("Page title should be {string}")
	public void page_title_should_be(String string) {
		// Write code here that turns the phrase above into concrete actions
		throw new io.cucumber.java.PendingException();
	}

}
