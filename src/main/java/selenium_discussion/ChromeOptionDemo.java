package selenium_discussion;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class ChromeOptionDemo {

	public static void main(String[] args) {

		ChromeOptions option = new ChromeOptions();

		//maximize browser
		option.addArguments("--start-maximized");
		
		//disable browser notifictions
//		option.addArguments("--disable-notifications");
//
//		//launch browser in incognito mode
//		option.addArguments("--incognito");
//
//		//Headless Browser
		option.addArguments("window-size=1350,3007");
		option.addArguments("--headless");
//		
		
		WebDriver driver = new ChromeDriver(option);
		driver.get("https://demo.nopcommerce.com/");

		System.out.println(driver.getTitle());
	}

}
