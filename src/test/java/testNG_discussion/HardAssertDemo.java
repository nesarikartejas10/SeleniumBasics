package testNG_discussion;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class HardAssertDemo {

	WebDriver driver;
	
    @BeforeClass
	public void inItBrowser() {

		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));	
	}

    @Test(priority = 1)
	public void verifyTitle() {

		String expTitle = "Automation Testing Practice";
		String actTitle = driver.getTitle();
		Assert.assertEquals(actTitle, expTitle);
	}

    @Test(priority = 2)
	public void verifyIcon() {

		WebElement wikiIcon = driver.findElement(By.cssSelector(".wikipedia-icon"));
		Assert.assertTrue(wikiIcon.isDisplayed());
	}

    @Test(priority = 3)
	public void verifySearchBtn() {

		WebElement searchButton = driver.findElement(By.cssSelector(".wikipedia-search-button"));
		Assert.assertTrue(searchButton.isDisplayed(), "search button is not displayed");
	}

	@AfterClass
	public void tearDown() {
		driver.close();
	}




}
