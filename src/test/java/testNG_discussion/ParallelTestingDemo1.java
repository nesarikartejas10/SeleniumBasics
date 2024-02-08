package testNG_discussion;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


import org.testng.annotations.Test;

public class ParallelTestingDemo1 {

	WebDriver driver;

	@Test
	public void verifyGoogleTitle() throws InterruptedException {

		driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		Thread.sleep(2000);
		String googleTitle = driver.getTitle();
		System.out.println(googleTitle);
		
	}

	@Test
	public void verifyFacebookSignupTitle() throws InterruptedException {

		driver = new ChromeDriver();
		driver.get("https://www.facebook.com/signup/");
		
		Thread.sleep(2000);
		String facebookTitle = driver.getTitle();
		System.out.println(facebookTitle);
	}

	@Test
	public void verifyMyntraTitle() throws InterruptedException {

		driver = new ChromeDriver();
		driver.get("https://www.myntra.com/");
		Thread.sleep(2000);

		String myntraTitle = driver.getTitle();
		System.out.println(myntraTitle);
	
	}

}
