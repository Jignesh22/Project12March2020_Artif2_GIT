package packageCustomer;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Customer {
	
	public WebDriver driver;
	
	@Test(priority=1)
	public void launchBrowserAndOpenURL() throws InterruptedException {
		//launching chrome browser
		System.out.println("Run1: launching chrome browser"); 
	    System.setProperty("webdriver.chrome.driver", "./chromedriver");
	    driver = new ChromeDriver();	
	    Thread.sleep(2000);
	    //Opening URL
		System.out.println("Run1: Opening url"); 
	    driver.get("http://opsqa.radixdev68.com/admin");
	    Thread.sleep(2000);
	}
	
	@Test(priority=2)
	public void performLogin() throws InterruptedException {
		System.out.println("Run2: Logging to the OPS"); 
		driver.findElement(By.xpath(".//*[@id='username']")).sendKeys("admin");
		driver.findElement(By.xpath(".//*[@id='password']")).sendKeys("admin");
		driver.findElement(By.xpath(".//*[@type='submit']")).click();
		System.out.println("Run2: Logged in successful to the OPS"); 
	    Thread.sleep(2000);
	}
	
	@Test(priority=3)
	public void closingBrowser() {
		driver.close();
		System.out.println("Run3: Browser Closed"); 
	}
}
