package GenericFn;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DriverFactory {
	public WebDriver driver;
	public void openBrowser() {
		
		System.setProperty("webdriver.chrome.driver", "C://Users//91866//Documents//chromedriver_win32//chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		System.out.println("Driver Initialized Succesfully!!!");
	}
}
