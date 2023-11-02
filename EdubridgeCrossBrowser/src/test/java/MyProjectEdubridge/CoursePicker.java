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

public class CoursePicker {
	
	
	WebDriver driver = new ChromeDriver();

	
	
	
	@Test
	public void coursepick() throws InterruptedException
	{
		driver.get("https://www.edubridgeindia.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
		WebElement explorecourse=driver.findElement(By.id("explDesk"));
		explorecourse.click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(100));
		WebElement course=driver.findElement(By.xpath("//*[@id='navbarsExample07']/ul/div/nav/ul/li[2]/ul/div/div/div[1]/div[2]/a"));
		course.click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1000));
		//driver.close();
	}
	
}
