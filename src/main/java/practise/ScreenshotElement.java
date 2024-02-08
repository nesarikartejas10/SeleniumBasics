package practise;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class ScreenshotElement {
	
	public static void main(String[] args) throws IOException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://omayo.blogspot.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		WebElement img = driver.findElement(By.xpath("//*[contains(@src,'softwaretestingcollege')]"));
		File source= img.getScreenshotAs(OutputType.FILE);
		String path = System.getProperty("user.dir")+"\\Screenshots\\omayo.png";
		File target = new File(path);
		FileHandler.copy(source, target);
		
		
	}

}
