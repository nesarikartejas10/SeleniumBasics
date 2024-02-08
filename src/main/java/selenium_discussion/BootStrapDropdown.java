package selenium_discussion;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class BootStrapDropdown {
	
	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		
		driver.findElement(By.cssSelector("input#ctl00_mainContent_ddl_originStation1_CTXT")).click();
		
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.cssSelector("#glsctl00_mainContent_ddl_originStation1_CTNR"))));
		
	    List<WebElement> elements = driver.findElements(By.xpath("//div[@class='dropdownDiv']/ul/li/a"));
	    for(WebElement element : elements)
	    {
	    	if(element.getText().contains("Kanpur"))
	    	{
	    		element.click();
	    		break;
	    	}
	    }
	}

}
