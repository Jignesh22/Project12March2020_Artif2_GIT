package packageCustomer;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Customer {
	
	public WebDriver driver;
	
	@Test(priority=1)
	public void launchBrowserAndOpenURL() {
		//launching chrome browser
		System.out.println("Run1: launching firefox browser"); 
	    System.setProperty("webdriver.gecko.driver", "./chromedriver");
	    driver = new ChromeDriver();	  
	    //Opening URL
		System.out.println("Run1: Opening url"); 
	    driver.get("http://opsqa.radixdev68.com/admin");
	}
	
	@Test(priority=2)
	public void performLogin() {
		System.out.println("Run2: Logging to the OPS"); 
		driver.findElement(By.xpath(".//*[@id='username']")).sendKeys("admin");
		driver.findElement(By.xpath(".//*[@id='password']")).sendKeys("admin");
		driver.findElement(By.xpath(".//*[@type='submit']")).click();
		System.out.println("Run2: Logged in successful to the OPS"); 
	}
	
	@Test(priority=3)
	public void closingBrowser() {
		driver.close();
		System.out.println("Run3: Browser Closed"); 
	}
}
