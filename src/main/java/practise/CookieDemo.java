package practise;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CookieDemo {
	
	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.opencart.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		Set<Cookie> cookies = driver.manage().getCookies();
		
		for(Cookie cookie : cookies)
		{
			System.out.println(cookie.getName()+" : "+cookie.getValue());
		}
		
		Cookie ck = new Cookie("MyCookie", "@123");
		
		System.out.println(ck.getName()+" : "+ck.getValue());
		
		driver.manage().deleteCookie(ck);
	}

}
