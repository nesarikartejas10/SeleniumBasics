package practise;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavascriptExDemo {
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://omayo.blogspot.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		
		String title = js.executeScript("return document.title").toString();
		System.out.println(title);
		
//		js.executeScript("arguments[0].click();", driver.findElement(By.xpath("//*[@id='selenium143']")));
//		
//		js.executeScript("alert('hello')");
//		
//		js.executeScript("window.location.reload()");
//		js.executeScript("arguments[0].value='i am selenium'", driver.findElement(By.xpath("//*[@id='ta1']")));
//		js.executeScript("arguments[0].scrollIntoView()", driver.findElement(By.xpath("//*[@id='alert2']")));
		js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
		Thread.sleep(2000);
		js.executeScript("window.scrollBy(0,-document.body.scrollHeight)");
	}

}
