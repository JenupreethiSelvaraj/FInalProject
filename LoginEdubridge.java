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
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class LoginEdubridge {
	
	WebDriver driver= new ChromeDriver();

	
    @Test
	
	public void testParameterWithXML() throws InterruptedException
	{
    	
        
		
		//Get the URL
	
	    driver.get("https://www.edubridgeindia.com/login");
		//Finding the username element using id
		WebElement username = driver.findElement(By.id("login_mobile"));
		username.click();
		//passing the username into the field
		username.sendKeys("9715499578");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		//Finding the password element using id
		WebElement password = driver.findElement(By.id("login_password"));
		//passing the value to password field
		password.sendKeys("Jenupreethi@55 ");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		//clicking the Login button by finding the element using id
	    driver.findElement(By.id("btnLoginSubmit")).click();
	    Thread.sleep(1000);
	    //driver.close();
    }
    

    
}
