package Amazon;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class testAmazon {

	//@Test
	public void test01() throws InterruptedException{
		System.setProperty("webdriver.gecko.driver", "C:\\Libs\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("http://www.toolsqa.com");
 
		Thread.sleep(5000);
		driver.quit();
	}
	
	
	@Test
	public void test02() throws InterruptedException{
	String exePath = "C:\\Libs\\Chromedriver\\2.30\\chromedriver.exe";
	System.setProperty("webdriver.chrome.driver", exePath);
	WebDriver driver = new ChromeDriver();
	driver.get("http://www.toolsqa.com");
	 
	Thread.sleep(5000);
	driver.quit();
	}
}
