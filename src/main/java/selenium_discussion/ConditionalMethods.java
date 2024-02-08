package selenium_discussion;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ConditionalMethods {
	
	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/signup");
		
//1. isDisplayed() Method
		
		//check logo is displayed or not.
		WebElement facebookLogo = driver.findElement(By.cssSelector(".fb_logo"));
		System.out.println(facebookLogo.isDisplayed());
		
		//check for hidden element
		WebElement hiddenElement = driver.findElement(By.cssSelector("#reg_error"));
		System.out.println(hiddenElement.isDisplayed());
			
//2. isEnabled() Method
		
		//check text box is getting enable to perform action or not
		WebElement firstName = driver.findElement(By.name("firstname"));
		System.out.println(firstName.isEnabled());
		
//3. isSelected() Method
		
		//check radio button is selected or not
		WebElement maleRadioButton = driver.findElement(By.xpath("//*[text()='Male']/following-sibling::input[@class='_8esa']"));
		System.out.println("Before clicking : "+maleRadioButton.isSelected());
		
		maleRadioButton.click();
		
		System.out.println("After clicking : "+maleRadioButton.isSelected());
	}

}
