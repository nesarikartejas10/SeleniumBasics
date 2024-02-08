package selenium_discussion;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseSlider {
	
	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.jqueryscript.net/demo/Price-Range-Slider-jQuery-UI/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		WebElement min_range = driver.findElement(By.xpath("//span[1]"));
		System.out.println("min_range location = "+min_range.getLocation());
		
		WebElement max_range = driver.findElement(By.xpath("//span[2]"));
		System.out.println("max_range location = "+max_range.getLocation());
		
		Actions act = new Actions(driver);
		
		act.dragAndDropBy(min_range, 100, 0).perform();
		act.dragAndDropBy(max_range, -100, 0).perform();
		
		//or
		act.clickAndHold(min_range).moveByOffset(100, 0).release().build().perform();
		act.clickAndHold(max_range).moveByOffset(-100, 0).release().build().perform();		
	}

}
