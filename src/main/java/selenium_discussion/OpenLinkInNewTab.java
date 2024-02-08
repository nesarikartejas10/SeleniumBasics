package selenium_discussion;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenLinkInNewTab {
	
	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.nopcommerce.com/");
		
//How to open a link in new tab?
		
		String tab = Keys.chord(Keys.CONTROL,Keys.RETURN);
		
		driver.findElement(By.cssSelector(".ico-register")).sendKeys(tab);
	}

}
