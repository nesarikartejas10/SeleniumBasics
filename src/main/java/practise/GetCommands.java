package practise;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class GetCommands {
	
	public static void main(String[] args) {
		ChromeOptions option = new ChromeOptions();
		option.addArguments("--start-maximized");
		
		WebDriver driver = new ChromeDriver(option);
		driver.get("https://omayo.blogspot.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		String url = driver.getCurrentUrl();
		System.out.println("URL of page : "+url);
		
		String title = driver.getTitle();
		System.out.println("Title of page : "+title);
		
		String pageSrc = driver.getPageSource();
		System.out.println("Page source : "+pageSrc);
	}

}
