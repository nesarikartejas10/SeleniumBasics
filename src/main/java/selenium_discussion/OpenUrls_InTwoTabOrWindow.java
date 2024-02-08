package selenium_discussion;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenUrls_InTwoTabOrWindow {
	
	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
//How to open URL’s in a multiple tabs?	
		driver.get("https://demo.nopcommerce.com/");
		driver.switchTo().newWindow(WindowType.TAB);
		driver.get("https://jqueryui.com/tooltip/");
		
//How to open URL’s in a multiple windows?
	/*	driver.get("https://demo.nopcommerce.com/");
		driver.switchTo().newWindow(WindowType.WINDOW);
		driver.get("https://jqueryui.com/tooltip/");*/
		
	
	}

}
