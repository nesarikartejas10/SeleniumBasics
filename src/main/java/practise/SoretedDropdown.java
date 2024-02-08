package practise;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SoretedDropdown {
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://chercher.tech/practice/practice-dropdowns-selenium-webdriver");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		ArrayList<String> orgList = new ArrayList<String>();
		ArrayList<String> tempList = new ArrayList<String>();
		WebElement selectDrp = driver.findElement(By.xpath("//select[@id='first']"));
		Select s = new Select(selectDrp);
		List<WebElement> elements = s.getOptions();
		for(WebElement element : elements)
		{
			orgList.add(element.getText());
			tempList.add(element.getText());
		}
		
		System.out.println("original list :"+orgList);
		System.out.println("temp list before sorting :"+tempList);
		
	      Collections.sort(tempList);
		
		System.out.println("temp list after sorting :"+tempList);
		if(orgList==tempList)
		{
			System.out.println("Dropdown options are sorted");
		}
		else {
			System.out.println("Dropdown options are not sorted");
		}
		
	}

}
