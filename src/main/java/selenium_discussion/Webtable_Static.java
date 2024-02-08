package selenium_discussion;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Webtable_Static {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://softwaretestingo.blogspot.com/2020/09/static-table.html");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		//total number of rows
		int rows = driver.findElements(By.xpath("//table[@name='BookTable']/tbody/tr")).size();
		System.out.println("Total no. of rows : "+rows);

		//total number of columns
		int columns = driver.findElements(By.xpath("//table[@name='BookTable']/tbody/tr/th")).size();
		System.out.println("Total no. of columns : "+columns);

		//retrieve specific row / column data
		String value = driver.findElement(By.xpath("//table[@name='BookTable']/tbody/tr[5]/td[3]")).getText();
		System.out.println("value : "+value);

		//retrieve only headers from the table

		List<WebElement> headers = driver.findElements(By.xpath("//table[@name='BookTable']/tbody/tr[1]/th"));

		for(WebElement header :headers) {
			String headertext = header.getText();
			System.out.print(headertext+" --> ");
		}
		
		System.out.println();

		//retrieve all the data from the table		

		for(int r=2;r<=rows;r++) {

			for(int c=1;c<=columns;c++) {
				String data = driver.findElement(By.xpath("//table[@name='BookTable']/tbody/tr["+r+"]/td["+c+"]")).getText();
				System.out.print(data+" --> ");

			}
			System.out.println();

		}

		//retrieve the data based on condition
		//e.g. fetch only 'subject' and 'price' where bookname is 'Master In Selenium'

		for(int r= 2;r<=rows;r++) {

			String bookname = driver.findElement(By.xpath("//table[@name='BookTable']/tbody/tr["+r+"]/td[1]")).getText();

			if(bookname.equals("Master In Selenium")) {

				String subject = driver.findElement(By.xpath("//table[@name='BookTable']/tbody/tr["+r+"]/td[3]")).getText();
				String price = driver.findElement(By.xpath("//table[@name='BookTable']/tbody/tr["+r+"]/td[4]")).getText();

				System.out.print(bookname+" --> "+subject+" --> "+price);
			}
		}
	}
}
