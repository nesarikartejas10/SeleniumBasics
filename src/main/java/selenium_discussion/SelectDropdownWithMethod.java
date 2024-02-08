package selenium_discussion;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectDropdownWithMethod {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		WebElement selectDrp = driver.findElement(By.cssSelector("#ctl00_mainContent_DropDownListCurrency"));
		Select s = new Select(selectDrp);
		s.selectByIndex(2);
		System.out.println(s.getFirstSelectedOption().getText());
		s.selectByValue("USD");
		System.out.println(s.getFirstSelectedOption().getText());
		s.selectByVisibleText("INR");
		System.out.println(s.getFirstSelectedOption().getText());
	}

}
