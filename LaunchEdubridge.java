package MyProjectEdubridge;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class LaunchEdubridge {
	WebDriver driver = new ChromeDriver();

	
	@Test
	public void launch()
	{
		
	
        driver.get("https://www.edubridgeindia.com/");

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		WebElement resume=driver.findElement(By.xpath("//*[@id=\"navbarsExample07\"]/div/a[2]/span"));
		String str=resume.getText();
		System.out.println("The Linktext is "+str);
		System.out.println("Webpage launched");
		driver.close();
	}
	
}
	
	
	


