package selenium_discussion;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetText_Vs_GetAttibute {
	
	public static void main(String[] args) {
		
		   WebDriver driver = new ChromeDriver();
		      driver.manage().window().maximize();
		      driver.get("https://rahulshettyacademy.com/client");
		      driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		      
//1. getText()
		      WebElement logInText = driver.findElement(By.xpath("//h1[@class='login-title']"));
		      System.out.println("text : "+logInText.getText());
		      
//2. getAttribute()
		      
		     WebElement userName = driver.findElement(By.cssSelector("#userEmail"));
		     
		     //return html attribute
		     System.out.println("placeholder : "+userName.getAttribute("placeholder"));
		     
		     //return text we typed inside text box
		     userName.sendKeys("nesarikartejas18@gmail.com");
		     System.out.println(userName.getAttribute("value"));	      
	}

}
