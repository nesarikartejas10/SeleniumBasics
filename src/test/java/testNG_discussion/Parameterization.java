package testNG_discussion;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Parameterization {
	
	WebDriver driver;
	@Parameters("browser")
	@Test(priority = 1)
	public void intitializeBrowser(String browsername)
	{
		
		if(browsername.equals("chrome"))
		{
			driver = new ChromeDriver();
			driver.manage().window().maximize();
		}
		else if(browsername.equals("firefox"))
		{
			driver = new FirefoxDriver();
			driver.manage().window().maximize();
		}
		
		else if(browsername.equals("edge"))
		{
			driver = new EdgeDriver();
			driver.manage().window().maximize();
		}
		
		driver.get("https://www.facebook.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	}
	
	@Test(priority = 2)
	public void logInPage()
	{
		String title = driver.getTitle();
		System.out.println("title of facebook login page : "+title);
		
		WebElement header = driver.findElement(By.xpath("//*[@class='_8esl']/h2"));
		
		System.out.println("header of facebook login page : "+header.getText());
	}


}
