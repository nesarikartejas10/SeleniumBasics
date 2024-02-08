package selenium_discussion;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelWriteDemo {
	
	public static void main(String[] args) throws IOException {
		
		String path = System.getProperty("user.dir")+"\\src\\main\\java\\testdata\\Test1.xlsx";
		File file = new File(path);
		FileOutputStream fos = new FileOutputStream(file);
		XSSFWorkbook wb = new XSSFWorkbook();
		XSSFSheet sheet = wb.createSheet("Login");
		
		sheet.createRow(0);
		sheet.getRow(0).createCell(0).setCellValue("Username");
		sheet.getRow(0).createCell(1).setCellValue("Password");
		
		sheet.createRow(1);
		sheet.getRow(1).createCell(0).setCellValue("ABC");
		sheet.getRow(1).createCell(1).setCellValue("ABC@123");
		
		sheet.createRow(2);
		sheet.getRow(2).createCell(0).setCellValue("XYZ");
		sheet.getRow(2).createCell(1).setCellValue("XYZ@456");
		
		wb.write(fos);
		wb.close();
		fos.close();
		
	}

}
