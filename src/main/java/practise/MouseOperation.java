package practise;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseOperation {
	
	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://omayo.blogspot.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		Actions act = new Actions(driver);
		//act.contextClick(driver.findElement(By.xpath("//*[@class='gsc-input']/*[@name='q']"))).perform();
		//act.doubleClick(driver.findElement(By.xpath("//*[@ondblclick='dblclickAlert()']"))).perform();
		//act.moveToElement(driver.findElement(By.xpath("//*[@id='blogsmenu']"))).perform();
		//act.dragAndDrop(driver.findElement(By.xpath("//img[contains(@src,'softwaretestingcollege')]")), driver.findElement(By.xpath("//*[@id='ta1']"))).build().perform();
		//act.clickAndHold(driver.findElement(By.xpath("//img[contains(@src,'softwaretestingcollege')]"))).moveToElement(driver.findElement(By.xpath("//*[@id='ta1']"))).release().build().perform();
		act.scrollToElement(driver.findElement(By.xpath("//*[@class='dropdown']"))).perform();
	}

}
