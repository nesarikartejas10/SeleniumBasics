package practise;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigationCommand {
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://omayo.blogspot.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.findElement(By.xpath("//div[@class='widget-content']/a[@id='link1']")).click();
		
		//backward
		Thread.sleep(3000);
		driver.navigate().back();
		
		//forward
		Thread.sleep(3000);
		driver.navigate().forward();
		
		//refresh
		Thread.sleep(3000);
		driver.navigate().refresh();
		
	}

}
