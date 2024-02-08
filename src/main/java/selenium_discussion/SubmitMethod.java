package selenium_discussion;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SubmitMethod {
	
	 public static void main(String[] args) {
	      
	      WebDriver driver = new ChromeDriver();
	      driver.manage().window().maximize();
	      driver.get("https://rahulshettyacademy.com/client");
	      driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	      
	      // identify elements
	      driver.findElement(By.cssSelector("#userEmail")).sendKeys("nesarikartejas18@gmail.com");
	      
	      driver.findElement(By.cssSelector("#userPassword")).sendKeys("Tejas@1795");
	      
	      // submitting form with submit()
	      driver.findElement(By.cssSelector("#login")).submit();
	   
	   }

}
