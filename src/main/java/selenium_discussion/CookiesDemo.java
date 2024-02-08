package selenium_discussion;

import java.util.Set;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CookiesDemo {
	
	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.nopcommerce.com/");
		
//How To capture all cookies from browser?
		
		Set<Cookie> cookies = driver.manage().getCookies();
		System.out.println("size of cookies : "+cookies.size());
		
//How To print cookies from browser?
		
		for(Cookie cookie:cookies) {
			
			System.out.println(cookie.getName()+" : "+cookie.getValue());
		}
		
//How To add Cookie to the browser?		
		
		Cookie ck = new Cookie("MyCookie", "1234"); 
		driver.manage().addCookie(ck);
		System.out.println(ck.getName()+" : "+ck.getValue());
		cookies = driver.manage().getCookies();
		System.out.println("size of cookies after add : "+cookies.size());
		
//how to get specific cookie according to name?
		
		System.out.println(driver.manage().getCookieNamed("_ga_SCT41TW89V"));
		
//How To delete specific Cookie from the browser?
		
		driver.manage().deleteCookie(ck);
		//OR
		driver.manage().deleteCookieNamed(".Nop.Customer");
		cookies = driver.manage().getCookies();
		System.out.println("size of cookies after deletion : "+cookies.size());
		
//How To delete all Cookies from the browser?
		
		driver.manage().deleteAllCookies();
		cookies = driver.manage().getCookies();
		System.out.println("size of cookies after deleting all cookies : "+cookies.size());
		
		driver.quit();	
	}

}
