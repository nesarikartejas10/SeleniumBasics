package practise;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SizeAndLocattion {
	
public static void main(String[] args) {
	
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.facebook.com/signup");
	
	WebElement logo = driver.findElement(By.cssSelector("img.fb_logo "));
	
	//Location- method1
	System.out.println("location(x,y) : "+logo.getLocation());
	System.out.println("location(x) : "+logo.getLocation().getX());
	System.out.println("location(y) : "+logo.getLocation().getY());
	
	//Location- method2
	System.out.println("location(x) : "+logo.getRect().getX());
	System.out.println("location(y) : "+logo.getRect().getY());
	
	//size- method1
	System.out.println("size(x,y) : "+logo.getSize());
	System.out.println("size(x) : "+logo.getSize().getWidth());
	System.out.println("size(y) : "+logo.getSize().getHeight());
	
	//size- method2
System.out.println("size(x) : "+logo.getRect().getDimension().getWidth());
System.out.println("size(y) : "+logo.getRect().getDimension().getHeight());
	
}

}
