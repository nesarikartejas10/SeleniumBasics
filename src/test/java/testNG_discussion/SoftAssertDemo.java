package testNG_discussion;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssertDemo {

	@Test
	public void softAssertDemo() {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));	

		SoftAssert sa = new SoftAssert();

		String expTitle = "Automation Testing Practice";
		String actTitle = driver.getTitle();
		sa.assertEquals(actTitle, expTitle);

		WebElement wikiIcon = driver.findElement(By.cssSelector(".wikipedia-icon"));
		sa.assertTrue(wikiIcon.isDisplayed());


		WebElement searchButton = driver.findElement(By.cssSelector(".wikipedia-search-button"));
		sa.assertTrue(searchButton.isDisplayed(), "search button is not displayed");
		sa.assertAll();

	}

}
