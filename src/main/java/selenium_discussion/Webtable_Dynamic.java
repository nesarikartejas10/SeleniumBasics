package selenium_discussion;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Webtable_Dynamic {

	public static void main(String[] args) throws InterruptedException {

		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");

		WebDriver driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.get("https://demo.opencart.com/admin/index.php");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.findElement(By.cssSelector("#input-username")).sendKeys("demo");
		driver.findElement(By.cssSelector("#input-password")).sendKeys("demo");
		driver.findElement(By.cssSelector(".btn-primary")).submit();

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@class='modal-content']")));

		Actions act = new Actions(driver);
		act.moveToElement(driver.findElement(By.cssSelector(".btn-close"))).click().build().perform();

		driver.findElement(By.xpath("//a[normalize-space()='Sales']")).click();
		driver.findElement(By.xpath("//a[normalize-space()='Orders']")).click();

		//calculate total number of pages
		String text = driver.findElement(By.xpath("//*[@class='col-sm-6 text-end']")).getText();

		int startidx = text.indexOf("(")+1;
		int endidx = text.indexOf("Pages")-1;

		int total_pages = Integer.valueOf(text.substring(startidx, endidx));
		System.out.println("Total number of pages : "+total_pages);

		for(int p =1; p<=5;p++) {
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("window.scrollTo(0, document.body.scrollHeight)");

			WebElement active = driver.findElement(By.xpath("//ul[@class='pagination']//li//span[normalize-space()='"+p+"']"));
			System.out.println("Active page = "+active.getText());

			js.executeScript("arguments[0].click();", active);

			int rows = driver.findElements(By.xpath("//*[@class='table table-bordered table-hover']/tbody/tr")).size();
			System.out.println("Total no. of rows = "+rows);

			for(int r=1; r<=rows; r++) {

				WebElement orderid = driver.findElement(By.xpath("//*[@class='table table-bordered table-hover']/tbody/tr["+r+"]/td[2]"));
				WebElement customer = driver.findElement(By.xpath("//*[@class='table table-bordered table-hover']/tbody/tr["+r+"]/td[4]"));
				WebElement price = driver.findElement(By.xpath("//*[@class='table table-bordered table-hover']/tbody/tr["+r+"]/td[6]"));
				String pricetext = price.getText();
				if(pricetext.equals("$106.00")) 
				{
					System.out.println(orderid.getText()+" "+customer.getText()+" "+price.getText());
				}
			}
			Thread.sleep(1500);

			driver.findElement(By.xpath("//a[normalize-space()='>']")).click();


		} 


	}

}
