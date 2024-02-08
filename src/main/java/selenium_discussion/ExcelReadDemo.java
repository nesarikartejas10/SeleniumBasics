package selenium_discussion;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ExcelReadDemo {
	
	public static void main(String[] args) throws IOException {
		
		String path = System.getProperty("user.dir")+"\\src\\main\\java\\testdata\\exceltest.xlsx";
		File file = new File(path);
		FileInputStream fis = new FileInputStream(file);
		
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		XSSFSheet sh = wb.getSheetAt(0);
		
		int rowCount = sh.getPhysicalNumberOfRows();
		System.out.println(rowCount);
		
		for(int i=0; i<rowCount; i++)
		{
			XSSFRow row= sh.getRow(i);
			int cellCount = row.getPhysicalNumberOfCells();
			
			for(int j=0; j<cellCount; j++) {
				XSSFCell cell = row.getCell(j);
				
				switch(cell.getCellType())
				{
				case STRING: System.out.print(cell.getStringCellValue());
				break;
				
				case NUMERIC: System.out.print(cell.getNumericCellValue());
				break;
				
				case BOOLEAN: System.out.print(cell.getBooleanCellValue());
				break;
				
				
				}
				
				System.out.print(" | ");
			}
			
			System.out.println();
		}
		
	wb.close();		

	}

}
