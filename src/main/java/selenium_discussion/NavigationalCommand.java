package selenium_discussion;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigationalCommand {
	
	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		//1.navigate.to()
		driver.navigate().to("https://www.facebook.com/signup");
		driver.findElement(By.linkText("Already have an account?")).click();
		
		//2. back
		driver.navigate().back();
		
		//3.forward
		driver.navigate().forward();
		
		//4.refresh
		driver.navigate().refresh();
	}

}
