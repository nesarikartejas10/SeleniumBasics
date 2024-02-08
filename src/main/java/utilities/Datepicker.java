package utilities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Datepicker {
	
	public static void  datepickerPattern1(WebDriver driver, String monthYear, String selectday)
	{
		while(true) {

			String actMonthYear = driver.findElement(By.xpath("//*[@class='ui-datepicker-title']")).getText();

			if(!(actMonthYear.equalsIgnoreCase(monthYear))) {

				driver.findElement(By.cssSelector("a[title='Next']")).click();
			}
			else {

				break;
			}

		}

		driver.findElement(By.xpath("//td[@data-handler='selectDay']/a[text()='"+selectday+"']")).click();
	}

}
