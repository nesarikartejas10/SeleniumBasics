package practise;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class ChromeOptionDemo {
	
	public static void main(String[] args) {
		
		ChromeOptions option = new ChromeOptions();
		option.addArguments("window-size= 1360, 2470");
		option.addArguments("--headless");
		WebDriver driver = new ChromeDriver(option);
		
		driver.get("http://omayo.blogspot.com/");
		System.out.println(driver.getTitle());
	}

}
