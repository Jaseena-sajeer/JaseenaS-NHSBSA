package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.support.ui.ExpectedConditions;

import utils.BaseTest;

public class NHSCostCheckerPage implements BaseTest {
	

	public void openUrl(String url) {
		driver.get(url);
	}
	public void clickNextButton() {
		wait.until(ExpectedConditions.presenceOfElementLocated(By.id("next-button"))).click();
	}
	
	public String getPageTitle()
	{
		return driver.getTitle().trim();
	}
	
   public void selectOption(String option)
   {
	   wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//label[contains(text(),'"+option+"')]//preceding::input[1]"))).click();
	
   }
   
   public void enterValue(String value, String locator)
   {
	   wait.until(ExpectedConditions.presenceOfElementLocated(By.id(locator))).sendKeys(value);
   }
   
   public String getText()
	{
		return wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//h1[@id='result-heading']//span[2]"))).getText();
	}
	
}
