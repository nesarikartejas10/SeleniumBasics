package selenium_discussion;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseDragandDrop {
	
	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.globalsqa.com/demo-site/draganddrop/#Photo%20Manager");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		//switch to iframe
		WebElement iframe = driver.findElement(By.xpath("//div[@class='single_tab_div resp-tab-content resp-tab-content-active']//iframe[@class='demo-frame lazyloaded']"));
		driver.switchTo().frame(iframe);
		
		String img1 = "High Tatras";
		String img2 = "High Tatras 2";
		String img3 = "High Tatras 3";
		String img4 = "High Tatras 4";
		
		//locate drag and drop element
		WebElement imageCard = driver.findElement(By.xpath("//h5[text()='"+img2+"']/parent::li"));
		WebElement trash = driver.findElement(By.xpath("(//*[@id='trash'])[1]"));
		
		//perform drag and drop actions
		Actions act = new Actions(driver);
	  //  act.dragAndDrop(imageCard, trash).build().perform();
		
		//or
		act.clickAndHold(imageCard).moveToElement(trash).release().build().perform();
	}

}
