package stepdefs;

import org.junit.Assert;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageobjects.NHSCostCheckerPage;
import utils.EnvConfig;

public class NHSCostCheckerStepDef {
	
	NHSCostCheckerPage nhsCostCheckerPage;
	public NHSCostCheckerStepDef(){
		 nhsCostCheckerPage = new NHSCostCheckerPage();
	}
	
	 @Given("I want to open NHS cost checker site")
	    public void openHomepage() {
	     nhsCostCheckerPage.openUrl("https://services.nhsbsa.nhs.uk/check-for-help-paying-nhs-costs/start");

	    }
	 

	 @Then("^I am on the '(.*)' page")
	    public void iamOnthePage(String expectedPageName) {
	    String actualPageName= nhsCostCheckerPage.getPageTitle();
        Assert.assertEquals(expectedPageName, actualPageName);
	    }


	 @When("I am starting cost checker")
	    public void startChecking() {
	     nhsCostCheckerPage.clickNextButton();

	    }
	 
	 @And("^I select option '(.*)' and click next")
	    public void selectOption(String option) {
	     nhsCostCheckerPage.selectOption(option);
	     nhsCostCheckerPage.clickNextButton();

	    }
	 
	 @And("^I enter my date of birth '(.*)' '(.*)' '(.*)' and click next")
	    public void enterDateOfBirth(String day, String month , String year) {
	     nhsCostCheckerPage.enterValue(day, "dob-day");
	     nhsCostCheckerPage.enterValue(month, "dob-month");
	     nhsCostCheckerPage.enterValue(year, "dob-year");
	     nhsCostCheckerPage.clickNextButton();
	    }
	 

	 @Then("^I confirm '(.*)'")
	    public void iConfirmText(String expectedText) {
	    String actualText= nhsCostCheckerPage.getText();
        Assert.assertEquals(expectedText, actualText);
	    }
	 
	 
	 
}
