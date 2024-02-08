package selenium_discussion;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class DatepickerDemo {
	
	public static void main(String [] args) throws InterruptedException {
		WebDriver driver =  new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.automationtesting.in/Datepicker.html");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.findElement(By.xpath("//input[@id='datepicker1']")).click();	
		
		//select month and year
		String monthYear = driver.findElement(By.xpath("//*[@class='ui-datepicker-title']")).getText();
		while(!monthYear.equals("December 2025")) {
			driver.findElement(By.xpath("//a[@data-handler='next']")).click();
			monthYear = driver.findElement(By.xpath("//*[@class='ui-datepicker-title']")).getText();
		}
		
		//select day
		List<WebElement> days = driver.findElements(By.xpath("//*[@data-handler='selectDay']"));
		for(WebElement day:days) {
			String text = day.getText();
			if(text.equals("25")) {
				day.click();
				break;
			}
		}
		
		
	
	}
}


