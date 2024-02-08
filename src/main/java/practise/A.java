package practise;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class A {
	
public static void main(String[] args) throws InterruptedException, AWTException, IOException {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		driver.findElement(By.name("username")).sendKeys("Admin");
		driver.findElement(By.name("password")).sendKeys("admin123");
		driver.findElement(By.cssSelector(".oxd-button")).submit();
		wait.until(ExpectedConditions.titleContains("OrangeHRM"));
		driver.findElement(By.xpath("//*[@class='oxd-userdropdown-name']")).click();
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//*[@class='oxd-dropdown-menu']"))));
		List<WebElement> drps = driver.findElements(By.xpath("//*[@class='oxd-dropdown-menu']/li/a"));
		
		for(WebElement element : drps) {
			
			String text = element.getText();
			if(text.contains("Change Password")) {
				element.click();
			}
		}
		
	
	}

}
