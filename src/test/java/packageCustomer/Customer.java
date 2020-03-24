package packageCustomer;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Customer {
	
	public WebDriver driver;
	
	@Test(priority=1)
	public void launchBrowserAndOpenURL() throws InterruptedException, MalformedURLException {
		//launching chrome browser
		System.out.println("RUN-1: launching chrome browser"); 
	    System.setProperty("webdriver.chrome.driver", "./chromedriver");
		System.out.println("RUN-2"); 
	//	URL remoteURL = new URL("http://127.0.0.1:4444/wd/hub");
		ChromeOptions options = new ChromeOptions();
		System.out.println("RUN-3"); 
	//	options.setBinary("/usr/bin/google-chrome");
		options.addArguments("headless");
		driver = new ChromeDriver(options);
	    Thread.sleep(2000);
	     
	    
	    //Opening URL
		System.out.println("RUN-4: Chrome Launched"); 
	    driver.get("http://opsqa.radixdev68.com/admin");
		System.out.println("Run-5: URL opened"); 
		driver.close();
		System.out.println("Run-6: browser closed");
	}


}
