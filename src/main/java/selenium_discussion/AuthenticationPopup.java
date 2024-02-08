package selenium_discussion;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AuthenticationPopup {
	
	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		//syntax 
		// driver.get("http://username:password@url");
		driver.get("http://admin:admin@the-internet.herokuapp.com/basic_auth");
	}
}
