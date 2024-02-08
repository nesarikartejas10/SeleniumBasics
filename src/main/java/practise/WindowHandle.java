package practise;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandle {
	
	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://omayo.blogspot.com/search?q=");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		String winId1 = driver.getWindowHandle();
		System.out.println("WinId : "+winId1);
		
		driver.findElement(By.xpath("//div[@class='feed-links']/a")).click();
		driver.findElement(By.xpath("//div[@class='widget-content']/a[text()='SeleniumTutorial']")).click();
		
		Set<String> winIds = driver.getWindowHandles();
		
		ArrayList<String> windowIds = new ArrayList<String>(winIds);
		
		String windowId1 = windowIds.get(0);
		String windowId2 = windowIds.get(1);
		String windowId3 = windowIds.get(2);
		
		driver.switchTo().window(windowId1);
		System.out.println(driver.getTitle());
	}

}
