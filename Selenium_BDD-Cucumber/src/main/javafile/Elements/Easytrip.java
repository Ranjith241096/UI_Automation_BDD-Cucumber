package Elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import GenericFn.DriverFactory;

public class Easytrip extends DriverFactory{
	
	public static final By homepage=By.xpath("//div[@class='flex flex-middle']");
	public static final By From=By.xpath("//h4[text()='From']//parent::div//following-sibling::div/div/div/input");
	public static final By to=By.xpath("//h4[text()='To']//parent::div//following-sibling::div/div/div/input");
	public static final By Adult=By.xpath("//div[@class='mb-4']/select");
	public static final By Search_btn=By.xpath("//button[text()='Search flights']");
	public static final By flightdetails=By.xpath("//div[@class='container']");

}
