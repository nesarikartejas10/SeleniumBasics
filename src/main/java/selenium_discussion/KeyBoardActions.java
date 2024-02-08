package selenium_discussion;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KeyBoardActions {
	
	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.diffchecker.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		WebElement inputBox1 = driver.findElement(By.xpath("(//*[contains(@class,'cm-content')])[1]"));
		WebElement inputBox2 = driver.findElement(By.xpath("(//*[contains(@class,'cm-content')])[2]"));
		
		Actions act = new Actions(driver);
		act.sendKeys(inputBox1, "Hello!...")
		   .sendKeys(" My name is ")
		   .keyDown(Keys.SHIFT).sendKeys("tejas").keyUp(Keys.SHIFT)
		   .build().perform();
		
		act.keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL)
		   .keyDown(Keys.CONTROL).sendKeys("c").keyUp(Keys.CONTROL)
		   .sendKeys(Keys.TAB)
		   .sendKeys(Keys.TAB)
		   .keyDown(Keys.CONTROL).sendKeys("v").keyUp(Keys.CONTROL)
		   .build().perform();
		
		if(inputBox1.getText().equals(inputBox2.getText())) 
		{
			System.out.println("perfectly match");
		}
		else 
		{
			System.out.println("Not match");
		}
		
	}

}
