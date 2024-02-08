package selenium_discussion;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class SelectDropdownWithoutMethod {
	
	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		WebElement selectDrp = driver.findElement(By.cssSelector("#ctl00_mainContent_DropDownListCurrency"));
		Select s = new Select(selectDrp);
		List<WebElement> elements = s.getOptions();
		
		for(WebElement element : elements)
		{
			String elementText = element.getText();
			if(elementText.equals("USD"))
			{
				element.click();
				break;
			}
		}
		System.out.println(s.getFirstSelectedOption().getText());
	}

}
