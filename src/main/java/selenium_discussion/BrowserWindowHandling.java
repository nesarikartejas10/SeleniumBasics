package selenium_discussion;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserWindowHandling {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.automationtesting.in/Windows.html");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

//getWindowHandle()
		String windowId = driver.getWindowHandle();
		System.out.println("windowId : "+windowId);

        //click on'click' button
		driver.findElement(By.cssSelector("a[target='_blank'] button")).click();
		
		
//getWindowHandles()
		Set<String> windowIds = driver.getWindowHandles();
		
//capturing multiple window Ids
		//first method
	/*	Iterator<String> it = windowIds.iterator();
		String windowId1 = it.next();
		System.out.println("windowId1 : "+windowId1);
		
		String windowId2 = it.next();
		System.out.println("windowId2 : "+windowId2);*/
		
		//second method
		ArrayList<String> al = new ArrayList<String>(windowIds);
		String windowId1 = al.get(0);
		String windowId2 = al.get(1);
	
		System.out.println("windowId1 : "+windowId1);
		System.out.println("windowId2 : "+windowId2);
		
//switching in browser
		driver.switchTo().window(windowId2);//switching child window
		System.out.println("Title of child window : "+driver.getTitle());
		
		driver.switchTo().window(windowId1);//switching in parent window
		System.out.println("Title of parent window : "+driver.getTitle());
	
//close specific browser window
		driver.close();//close parent window
			
//close all browser window
		driver.quit();
	}

}
