
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class apps {

	public static void main(String[] args) throws InterruptedException{
		
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://selenium-apps.doselect.in/mibe/");
		
	
        driver.findElement(By.xpath("/html/body/div/div[1]/ul/li[1]")).click();
        Thread.sleep(1000);
        driver.findElement(By.className("adding")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("/html/body/div/div[3]/ul/li[1]")).click();
        Thread.sleep(1000);
        driver.findElement(By.className("removing")).click();
        Thread.sleep(1000);
        
        driver.close();
        
        
		// TODO Auto-generated method stub

	}

}
