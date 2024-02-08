package practise;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SliderHandling {
	
	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://jqueryui.com/slider/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@class='demo-frame']")));
		Actions act = new Actions(driver);
		WebElement sliderElement = driver.findElement(By.cssSelector(".ui-slider-handle"));
		//act.dragAndDropBy(sliderElement, 300, 0).perform();
		act.clickAndHold(sliderElement).moveByOffset(200, 0).release().build().perform();
	}

}
