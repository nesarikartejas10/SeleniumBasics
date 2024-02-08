package selenium_discussion;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebtableDynamicDemo2 {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://qavbox.github.io/demo/webtable/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		//Get table headers
		System.out.println("******************Get table headers********************");
		List<WebElement> headers = driver.findElements(By.xpath("//*[@id='table02']//tr/th"));
		for(WebElement header:headers)
		{
			String headerText = header.getText();
			System.out.println(headerText);
		}
		
		//Get no.of rows and columns
		System.out.println("*************Get total no. of rows and columns****************");
		List<WebElement> rows = driver.findElements(By.xpath("//*[@id='table02']//tbody/tr"));
		System.out.println("Total number of rows : "+rows.size());
		
		List<WebElement> columns = driver.findElements(By.xpath("//*[@id='table02']//tr/th"));
		System.out.println("Total number of columns : "+columns.size());
		
		//Get name of employees whose position is 'Software Engineer'
		System.out.println("******Get name of employees whose position is 'Software Engineer'*******");		
		for(int i=1;i<=rows.size();i++)
		{
			WebElement position = driver.findElement(By.xpath("//*[@id='table02']//tr["+i+"]/td[2]"));
			if(position.getText().contains("Software Engineer"))
			{
				WebElement name = driver.findElement(By.xpath("//*[@id='table02']//tr["+i+"]/td[1]"));
				System.out.println(name.getText());
			}
		}
	
		//Get name of employees whose age is '<25'
		System.out.println("************Get name of employees whose age is '<25'***************");
		for(int i=1;i<rows.size();i++)
		{
			WebElement empAge = driver.findElement(By.xpath("//*[@id='table02']//tr["+i+"]/td[4]"));
			if(Integer.parseInt(empAge.getText())<25)
			{
				WebElement name = driver.findElement(By.xpath("//*[@id='table02']//tr["+i+"]/td[1]"));
				System.out.println(name.getText());
			}
			
		}
		
		//Get last row
		System.out.println("********************Get last Row********************");
		List<WebElement> lastRow = driver.findElements(By.xpath("//*[@id='table02']//tr[last()]/td"));
		for(WebElement lRow : lastRow)
		{
			System.out.print(lRow.getText()+" | ");
		}
		System.out.println();
		
		//get particular cell value
		System.out.println("************particular cell value**************");
		
		//for static table
		WebElement empName = driver.findElement(By.xpath("//*[@id='table02']//tr[4]/td[1]"));
		System.out.println(empName.getText());
		
		//for dynamic table
		WebElement name = driver.findElement(By.xpath("//*[@id='table02']//tr/td[contains(text(),'Caesar Vance')]"));
		System.out.println(name.getText());
		
		//get all table data
		System.out.println("*******************get all table data*****************");
		for(int i=1;i<=rows.size();i++)
		{
			for(int j=1; j<=columns.size();j++)
			{
				WebElement data = driver.findElement(By.xpath("//*[@id='table02']//tr["+i+"]/td["+j+"]"));
				System.out.print(data.getText()+" | ");
			}
			System.out.println();
		}
		
		//get Particular all column data
		System.out.println("******************get Particular all column data**********************");
		for(int i=1; i<=rows.size(); i++)
		{
			WebElement columnData = driver.findElement(By.xpath("//*[@id='table02']//tr["+i+"]/td[5]"));
			System.out.println(columnData.getText());
		}
		
		
		Thread.sleep(2000);
		driver.quit();
	}
}

