package practise;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class TooltipCapture {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://jqueryui.com/tooltip/");
		driver.switchTo().frame(driver.findElement(By.xpath("//*[@class='demo-frame']")));

		WebElement tooltipElement = driver.findElement(By.xpath("//*[@id='age']"));
//		Actions act = new Actions(driver);
//		act.moveToElement(tooltipElement).perform();
		System.out.println(tooltipElement.getAttribute("title"));
	}
}
