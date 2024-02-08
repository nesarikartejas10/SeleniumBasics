package practise;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavasricptExeuterDemo {
	
	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://omayo.blogspot.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		
		//draw border
		WebElement element = driver.findElement(By.xpath("//h3[@itemprop='name']/a"));
		js.executeScript("arguments[0].style.border='10px solid yellow'", element);
		
		//enter text
		WebElement textElement = driver.findElement(By.xpath("//*[@id='ta1']"));
		js.executeScript("arguments[0].value='My name is Tejas'", textElement);
		
		//click
		WebElement clickElement = driver.findElement(By.xpath("//*[@id='radio2']"));
		js.executeScript("arguments[0].click()", clickElement);
		
		
	}

}
