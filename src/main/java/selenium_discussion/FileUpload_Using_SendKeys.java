package selenium_discussion;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUpload_Using_SendKeys {

	public static void main(String[] args) {	
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/upload-download");
		
		driver.findElement(By.xpath("//*[@id='uploadFile']")).sendKeys("C:\\Users\\india\\Desktop\\Screenshot 2023-04-02 112352.png");
	}

}
