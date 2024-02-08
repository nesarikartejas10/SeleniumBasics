package practise;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectDrp {
	
	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://omayo.blogspot.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		WebElement drpdown = driver.findElement(By.xpath("//*[@id='multiselect1']"));
		
		Select s = new Select(drpdown);
		s.selectByVisibleText("Hyundai");
		s.selectByIndex(1);
		s.selectByValue("audix");
	}

}
