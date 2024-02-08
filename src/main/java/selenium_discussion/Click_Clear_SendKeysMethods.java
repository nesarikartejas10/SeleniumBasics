package selenium_discussion;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Click_Clear_SendKeysMethods {
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.twoplugs.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
//1. click() method
		//click on to the 'LivePosting'
		driver.findElement(By.linkText("LIVE POSTING")).click();
		
//2. sendKeys() method		
		driver.findElement(By.cssSelector("#autocomplete")).sendKeys("India");

//3. clear() method
		Thread.sleep(5000);
		driver.findElement(By.cssSelector("#autocomplete")).clear();

	}

}
