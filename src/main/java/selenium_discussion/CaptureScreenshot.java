package selenium_discussion;

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

public class CaptureScreenshot {
	static WebDriver driver;

	public static void fullScreenshot() {

		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

		TakesScreenshot ts = (TakesScreenshot)driver;
		File source = ts.getScreenshotAs(OutputType.FILE);

		String path = System.getProperty("user.dir")+"\\Screenshots\\facebookFullPage.png";
		File target = new File(path);

		try {
			FileHandler.copy(source, target);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}		
	}

	public static void sectionScreenshot() throws IOException {

		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

		WebElement section = driver.findElement(By.cssSelector("._8iep"));

		File source = section.getScreenshotAs(OutputType.FILE);

		String path = System.getProperty("user.dir")+"\\Screenshots\\facebookSection.png";
		File target = new File(path);

		FileHandler.copy(source, target);

	}

	public static void elementScreenshot() throws IOException {

		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

		WebElement element = driver.findElement(By.xpath("//div[@class='_8ice']/img"));

		File source = element.getScreenshotAs(OutputType.FILE);

		String path = System.getProperty("user.dir")+"\\Screenshots\\facebookElement.png";
		File target = new File(path);

		FileHandler.copy(source, target);

	}

	public static void main(String[] args) throws IOException {
		
		//fullScreenshot();
		//sectionScreenshot();
		elementScreenshot();

	}

}
