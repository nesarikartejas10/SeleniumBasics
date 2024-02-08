package selenium_discussion;

import java.awt.AWTException;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckboxHandling {

	public static void main(String [] args) throws AWTException  {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.hyrtutorials.com/p/basic-controls.html");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.findElement(By.cssSelector("input#hindichbx")).click();
		List<WebElement> chBoxes = driver.findElements(By.xpath("//div[@class='basicControls']//input[@class='bcCheckBox']"));
		

		for(WebElement checkBox : chBoxes)
		{
			if(checkBox.isEnabled())
			{
				if(!(checkBox.isSelected()))
				{
					if(checkBox.getAttribute("id").contains("french"))	
					{
						checkBox.click();
						break;
					}
				}else
				{
					System.out.println("checkbox is already selected");
					continue;
				}
			}else 
			{
				System.out.println("checkbox is unable to perform an action");
			}
		}
	}

}
