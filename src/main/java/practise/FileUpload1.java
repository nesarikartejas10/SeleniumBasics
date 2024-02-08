package practise;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class FileUpload1 {
	
	public static void main(String[] args) throws AWTException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://omayo.blogspot.com/search?q=");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		WebElement uploadBtn = driver.findElement(By.xpath("//input[@id='uploadfile']"));
		
		Actions act = new Actions(driver);
		act.scrollToElement(uploadBtn).click(uploadBtn).build().perform();
		
		Robot rb = new Robot();
		rb.delay(2000);
		
		StringSelection ss = new StringSelection("C:\\Users\\india\\Desktop\\employee.png");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null);
		
		rb.keyPress(KeyEvent.VK_CONTROL);
		rb.keyPress(KeyEvent.VK_V);
		rb.keyRelease(KeyEvent.VK_CONTROL);
		rb.keyRelease(KeyEvent.VK_V);
		
		rb.keyPress(KeyEvent.VK_ENTER);
		rb.keyRelease(KeyEvent.VK_ENTER);
	}

}
