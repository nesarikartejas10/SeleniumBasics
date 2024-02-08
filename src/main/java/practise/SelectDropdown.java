package practise;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectDropdown {
	
	
	public void selectDropdown(WebElement drpElement, String actElement) {
		
		Select s = new Select(drpElement);
		List<WebElement> elements = s.getOptions();
		for(WebElement element : elements)
		{
			String text = element.getText();
			if(actElement.equals(text)) {
				
				element.click();
				break;
			}
		}
			
	}
	public static void main(String[] args) {
	
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/reg/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
	/*	WebElement dayDrp = driver.findElement(By.xpath("//*[@id='day']"));
		Select s1 = new Select(dayDrp);
		s1.selectByVisibleText("17");
		
		WebElement monthDrp = driver.findElement(By.xpath("//*[@id='month']"));
		Select s2 = new Select(monthDrp);
		s2.selectByVisibleText("Apr");
		
		WebElement yearDrp = driver.findElement(By.xpath("//*[@id='year']"));
		Select s3 = new Select(yearDrp);
		s3.selectByVisibleText(("1995"));  */
		SelectDropdown sd = new SelectDropdown();
		WebElement dayDrp = driver.findElement(By.xpath("//*[@id='day']"));
		WebElement monthDrp = driver.findElement(By.xpath("//*[@id='month']"));
		WebElement yearDrp = driver.findElement(By.xpath("//*[@id='year']"));
		
		sd.selectDropdown(dayDrp, "24");
		sd.selectDropdown(monthDrp, "Jul");
		sd.selectDropdown(yearDrp, "1997");
	}

}
