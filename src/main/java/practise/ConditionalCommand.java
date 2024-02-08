package practise;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ConditionalCommand {
	
	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://omayo.blogspot.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		WebElement bttn = driver.findElement(By.xpath("//*[@id='but1']"));
		Boolean isDispaly = bttn.isEnabled();
		System.out.println(isDispaly);
		
		WebElement checkBox = driver.findElement(By.xpath("//*[@id='checkbox2']"));
		checkBox.click();
		Boolean isEnable = checkBox.isSelected();
		System.out.println(isEnable);
		
	}

}
