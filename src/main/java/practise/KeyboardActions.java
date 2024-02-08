package practise;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KeyboardActions {
	
	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://omayo.blogspot.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		WebElement inputText = driver.findElement(By.xpath("//*[@id='ta1']"));
		Actions act = new Actions(driver);
		act.sendKeys(inputText, "Hello I am Tejas")
		   .keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL)
		   .keyDown(Keys.CONTROL).sendKeys("c").keyUp(Keys.CONTROL)
		   .build().perform();
		WebElement inputText2 = driver.findElement(By.xpath("(//*[@class='widget-content']/textarea)[2]"));
		inputText2.clear();
		act.click(inputText2).keyDown(Keys.CONTROL).sendKeys("v").keyUp(Keys.CONTROL).build().perform();
	}

}
