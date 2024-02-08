package selenium_discussion;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseRightandDoubleClick {
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/buttons");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		WebElement rightClickBtn = driver.findElement(By.cssSelector("#rightClickBtn"));
		WebElement doubleClickBtn = driver.findElement(By.cssSelector("#doubleClickBtn"));
		
		Actions act = new Actions(driver);
		
		//right click operation
		act.contextClick(rightClickBtn).perform();
		
		Thread.sleep(2000);
		
		//double click operation
		act.doubleClick(doubleClickBtn).perform();
	}

}
