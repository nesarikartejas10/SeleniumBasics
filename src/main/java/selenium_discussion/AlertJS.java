package selenium_discussion;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertJS {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://testpages.herokuapp.com/styled/alerts/alert-test.html");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

		//alert window with ok button
		driver.findElement(By.cssSelector("#alertexamples")).click();
		Thread.sleep(2000);
		driver.switchTo().alert().accept();

		//alert window with ok and cancel button
		driver.findElement(By.cssSelector("#confirmexample")).click();
		Thread.sleep(2000);
		driver.switchTo().alert().dismiss();
		
		//alert window with prompt message
		driver.findElement(By.cssSelector("#promptexample")).click();
		Thread.sleep(2000);
		Alert alertPrompt = driver.switchTo().alert();
		System.out.println(alertPrompt.getText());
		
		alertPrompt.sendKeys("Tejas");
		alertPrompt.accept();
	}
}
