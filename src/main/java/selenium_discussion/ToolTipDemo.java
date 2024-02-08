package selenium_discussion;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToolTipDemo {
	
	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://jqueryui.com/tooltip/");
		
//How to capture tooltip of the Web Element?
		
		WebElement iframe = driver.findElement(By.cssSelector(".demo-frame"));
		driver.switchTo().frame(iframe);
		
		WebElement inputbox = driver.findElement(By.cssSelector("#age"));
		
		String tooltiptext = inputbox.getAttribute("title");
		System.out.println(tooltiptext);
			
	}

}
