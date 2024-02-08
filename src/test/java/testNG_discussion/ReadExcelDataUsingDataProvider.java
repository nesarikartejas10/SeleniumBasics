package testNG_discussion;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class ReadExcelDataUsingDataProvider {
	
	
	@DataProvider(name="testdata")
	public String [][] getData() throws IOException
	{
		String path = System.getProperty("user.dir")+"\\src\\main\\java\\testdata\\exceltest.xlsx";
		String[][] data = null ;
		File file = new File(path);
		try {
			FileInputStream fis = new FileInputStream(file);
			XSSFWorkbook wb = new XSSFWorkbook(fis);
			XSSFSheet sh = wb.getSheet("LogIn");
			int rowCount = sh.getLastRowNum()+1;
			int columnCount = sh.getRow(0).getLastCellNum();
			System.out.println(rowCount+" : "+columnCount);
			
			data = new String[rowCount-1][columnCount];
			for(int i=1; i<rowCount; i++)
			{
				for(int j=0; j<columnCount; j++)
				{
					DataFormatter df = new DataFormatter();
					data [i-1][j] = df.formatCellValue(sh.getRow(i).getCell(j));
				}
			}	
			
			wb.close();
		} catch (Exception e) {
			
		}
		
		return data;
	}
	
	@Test(dataProvider = "testdata")
	public void logInPage(String username, String password) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.saucedemo.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.findElement(By.cssSelector("#user-name")).sendKeys(username);
		driver.findElement(By.cssSelector("#password")).sendKeys(password);
		driver.findElement(By.cssSelector("#login-button")).submit();
	}

}
