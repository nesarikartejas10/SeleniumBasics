package selenium_discussion;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class InnerIframeDemo {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://chercher.tech/practice/frames-example-selenium-webdriver");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

		//switch into parent frame i.e first iframe
		driver.switchTo().frame("frame1");

		//switch to inner frame
		driver.switchTo().frame("frame3");
		driver.findElement(By.xpath("//input[@id='a']")).click();

		//switch into parent frame i.e first iframe
		driver.switchTo().parentFrame();
		driver.findElement(By.xpath("//b[@id='topic']/following-sibling::input")).sendKeys("Hello..");

		//switch to main page
		driver.switchTo().defaultContent();
		
		//switch to second iframe 
		driver.switchTo().frame("frame2");
		WebElement dropDown = driver.findElement(By.xpath("//*[@id='animals']"));
		Select s = new Select(dropDown);
		s.selectByVisibleText("Avatar");
	}

}
