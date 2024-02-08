package testNG_discussion;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderDemo1 {
	
	WebDriver driver;
	
	@BeforeMethod
	public void intItBrowser() {
		
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	
	@DataProvider(name = "searchDataSet")
	public Object[][] searchData(){
		
		Object[][] search = {{"India","Taj Mahal"},{"China","The Great Wall"},{"Dubai","Burj Khalifa"}};
		
		return search;
	}
	
	@Test(dataProvider = "searchDataSet")
	public void googleSearch(String country, String monument) throws InterruptedException {
		
		WebElement search = driver.findElement(By.id("APjFqb"));
		search.sendKeys(country+" "+monument);
		driver.findElement(By.name("btnK")).click();
		Thread.sleep(2000);
	}
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
	
	

}
