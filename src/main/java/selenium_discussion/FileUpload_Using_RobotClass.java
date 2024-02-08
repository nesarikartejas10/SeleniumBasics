package selenium_discussion;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class FileUpload_Using_RobotClass {


	public static void main(String[] args) throws AWTException {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/upload-download");

		WebElement button = driver.findElement(By.xpath("//*[@id='uploadFile']"));
		Actions act = new Actions(driver);
		act.moveToElement(button).click().perform();

		Robot rb = new Robot();
		rb.delay(2000);

		//copy the path
		StringSelection ss = new StringSelection("C:\\Users\\india\\Desktop\\Screenshot 2023-04-02 112352.png");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null);

		//perform paste (Ctrl +V) operation
		rb.keyPress(KeyEvent.VK_CONTROL);
		rb.keyPress(KeyEvent.VK_V);
		rb.keyRelease(KeyEvent.VK_CONTROL);
		rb.keyRelease(KeyEvent.VK_V);

		//press Enter key
		rb.keyPress(KeyEvent.VK_ENTER);
		rb.keyRelease(KeyEvent.VK_ENTER);
	}
}
