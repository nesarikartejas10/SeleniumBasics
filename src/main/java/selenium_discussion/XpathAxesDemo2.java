package selenium_discussion;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathAxesDemo2 {
	
	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/signup/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		//find the signup button from registration form in facebook application
		String text1 = driver.findElement(By.xpath("//*[@id='reg_form_box']/child::div[11]/button")).getText();
		System.out.println(text1);
		
		//locate the first name field from signup button
		String text2 = driver.findElement(By.xpath("//*[@name='websubmit']/parent::div/preceding-sibling::div[10]/descendant::div[4]")).getText();
		System.out.println(text2);
		
		//identify password field from the mobile no. field
		String text3 = driver.findElement(By.xpath("//*[@name='reg_email__']/parent::div/ancestor::div/following-sibling::div[2]/descendant::div[2]")).getText();
		System.out.println(text3);
	}

}
