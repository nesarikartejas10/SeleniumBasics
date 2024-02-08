package selenium_discussion;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SortDropdown {
	
	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.seleniumeasy.com/");
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		
		driver.findElement(By.xpath("//*[text()='More.. ']/span")).click();
		wait.until(ExpectedConditions.visibilityOfAllElements(driver.findElements(By.xpath("//*[text()='JXL']/ancestor::ul[@class='dropdown-menu']"))));
		ArrayList<String> orglist = new ArrayList<String>();
		ArrayList<String> templist = new ArrayList<String>();
		
		 List<WebElement> drpElements = driver.findElements(By.xpath("//*[@class='last expanded active dropdown open']/ul/li"));
		 
		 for(WebElement element:drpElements){
			 
			 orglist.add(element.getText());
			 templist.add(element.getText());
			 
		 }
		 System.out.println("orginal list"+orglist);
		 System.out.println("temp list before sorting"+templist);
		 
		 Collections.sort(templist);
		 
		 System.out.println("temp list after sorting"+templist);
		 
		 if(templist.equals(orglist)) {
			 System.out.println("dropdown is sorted");
		 }
		 else {
			 System.out.println("dropdown is not sorted");
		 }
		
	}

}
