package Stepdefinition;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import Elements.Easytrip;
import GenericFn.DriverFactory;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;



public class bookflight extends DriverFactory{
		Easytrip Easytrip=new Easytrip();
		
	@Given("the user navigates to cleartrip homepage")
	public void the_user_navigates_to_cleartrip_homepage() {
		
	    openBrowser();
	    String URL="https://www.cleartrip.com";
	    System.out.println("Enter URL :"+URL);
		driver.get(URL);
	    }

	@When("user selects a flight from {string} to {string}")
	public void user_selects_a_flight_from_to_days_from_today(String string1, String string2) throws InterruptedException {
		WebElement From=driver.findElement(Elements.Easytrip.From);
		From.sendKeys(string1);
		Thread.sleep(5000);
		List<WebElement> dropdownOptions = driver.findElements(By.xpath("//div[text()='Suggestions']//parent::ul//li"));

		for(WebElement element : dropdownOptions) {
		    System.out.println("Suggestion :"+element.getText());
		}
		dropdownOptions.get(0).click();
	    System.out.println("Selected  city-From:"+ string1);
	    WebElement To=driver.findElement(Elements.Easytrip.to);
		To.sendKeys(string2);
		Thread.sleep(5000);
		List<WebElement> dropdownOptions2 = driver.findElements(By.xpath("//div[text()='Suggestions']//parent::ul//li"));
		for(WebElement element : dropdownOptions2) {
		    System.out.println("Suggestion :"+element.getText());
		}
		dropdownOptions2.get(0).click();
	    System.out.println("Selected  city-To:"+ string2);
	}

	@When("user selects no of adults as {string}")
	public void user_selects_no_of_adults_as(String string) {
		WebElement Adult=driver.findElement(Elements.Easytrip.Adult);
		Select drpdwn=new Select(Adult);
		drpdwn.selectByValue("2");
		String Seloption=drpdwn.getFirstSelectedOption().getText();
	    System.out.println("Flight Booking Details - Adult selected as :"+ Seloption);
	}

	@When("user searches for flight")
	public void user_searches_for_flight() {
		WebElement Search=driver.findElement(Elements.Easytrip.Search_btn);;
		Search.click();
	    System.out.println("Flight Booking Details - Search btn is clicked");		
	}

	@Then("flight details should be displayed")
	public void user_books_a_flight() {
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		//WebElement result=driver.findElement(Elements.Easytrip.flightdetails);
		WebDriverWait wait = new WebDriverWait(driver,30);
		wait.until(ExpectedConditions.visibilityOfElementLocated(Elements.Easytrip.flightdetails));
		driver.close();
	}

}
