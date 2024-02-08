package practise;

import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Test1 {

	public static void main(String [] args) throws Exception  {

		String excelPath = "C:\\Users\\india\\eclipse-workspace\\project.zip_expanded\\Selenium_Interview\\src\\main\\java\\testdata\\Test data.xlsx";
		FileInputStream fis = new FileInputStream(excelPath);
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		XSSFSheet sheet = wb.getSheet("Test");
		
		int row = sheet.getPhysicalNumberOfRows();
		System.out.println("Total no. of rows : "+row);
		
		int cell = sheet.getRow(0).getPhysicalNumberOfCells();
		System.out.println("Total no. of cell : "+cell);
		
		DataFormatter df = new DataFormatter();
		
		String data = df.formatCellValue(sheet.getRow(2).getCell(3));
		System.out.println(data);
		
	}
}
