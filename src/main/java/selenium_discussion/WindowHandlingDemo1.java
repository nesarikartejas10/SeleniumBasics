package selenium_discussion;

import java.awt.AWTException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandlingDemo1 {
	
	public static void main(String [] args) throws AWTException, InterruptedException  {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.hyrtutorials.com/p/window-handles-practice.html");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		String parentWinId = driver.getWindowHandle();
		
		driver.findElement(By.cssSelector("#newWindowBtn")).click();
		
		Set<String> allWinIds = driver.getWindowHandles();
		Iterator<String> it = allWinIds.iterator();
		while(it.hasNext())
		{
			String childWinId = it.next();
			if(!parentWinId.equals(childWinId))
			{
				driver.switchTo().window(childWinId);
				System.out.println(driver.getTitle());
				System.out.println(driver.getCurrentUrl());
				Thread.sleep(2000);
				driver.close();
			}
		
		}
		
		driver.switchTo().window(parentWinId);
		
		Thread.sleep(2000);
		driver.quit();
		
	}


}
