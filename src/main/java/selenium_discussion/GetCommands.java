package selenium_discussion;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetCommands {
	
	public static void main(String[] args) {
		
		//To launch Browsers in WebDriver :first we create browser driver instance
		WebDriver driver = new ChromeDriver();
		
		//maximize the browser
		driver.manage().window().maximize();
		
		//to Open URL
		driver.get("https://jqueryui.com/datepicker/");
		
		//to capture Title of the page
		String titleOfPage= driver.getTitle();
		System.out.println("title of page : "+titleOfPage);
		
		//to capture Title of the page
		String url = driver.getCurrentUrl();
		System.out.println("URL of current page : "+url);
		
		//to capture page source of the Page
		String pageSource = driver.getPageSource();
		System.out.println("HTML page source : "+pageSource);
		
	}

}
