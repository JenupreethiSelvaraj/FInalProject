package MyProjectEdubridge;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class CrossBrowserScript {

	WebDriver driver;

	ChromeOptions chromeoptions = new ChromeOptions();
	FirefoxOptions firefoxoptions = new FirefoxOptions();

	@Parameters("browser")
	@BeforeTest
	public void setBrowser(String browser) {
		//checks the parameter "firefox"
		if(browser.equalsIgnoreCase("firefox")){
			//firefox
			driver = new FirefoxDriver();
		}
		//checks the parameter "chrome"
		else if(browser.equalsIgnoreCase("chrome")){

			//chrome 
			driver = new ChromeDriver();
		}
		//checks the parameter "MicrosoftEdge"
		else if(browser.equalsIgnoreCase("iebrowser"))
		{
			//Parameter MicrosoftEdge 
			driver = new EdgeDriver();
			
		}
	
	}
	@Test
	public void launchBrowser()
	{
		driver.get("https://www.edubridgeindia.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	}
	
	@AfterTest
	public void closeBrowser()  
        {
		 driver.close();
		}
}

