package selenium_discussion;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class MouseHoverAction {
	
	public static void main(String[]args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.opencart.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		WebElement desktop = driver.findElement(By.xpath("//*[@class='nav-item dropdown']/a[text()='Desktops']"));
		WebElement mac = driver.findElement(By.xpath("(//*[@class='list-unstyled']/li)[2]"));
		
		Actions act = new Actions(driver);
		act.moveToElement(desktop).moveToElement(mac).click().build().perform();	
	}

}
