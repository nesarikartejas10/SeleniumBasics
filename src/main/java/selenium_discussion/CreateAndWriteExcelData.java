package selenium_discussion;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class CreateAndWriteExcelData {

	public static void main(String[] args) throws IOException {

		XSSFWorkbook wb = new XSSFWorkbook();
		XSSFSheet sheet = wb.createSheet("LogIn");
		//create first row
		sheet.createRow(0);
		sheet.getRow(0).createCell(0).setCellValue("Username");
		sheet.getRow(0).createCell(1).setCellValue("Password");
		
        //create second row
		sheet.createRow(1);
		sheet.getRow(1).createCell(0).setCellValue("tejas.nesarikar17");
		sheet.getRow(1).createCell(1).setCellValue("tejas@123");
		
	    //create second row
		sheet.createRow(2);
		sheet.getRow(2).createCell(0).setCellValue("soham.nesarikar24");
		sheet.getRow(2).createCell(1).setCellValue("soham@007");
		
		File file = new File(System.getProperty("user.dir")+"\\src\\main\\java\\testdata\\Test1.xlsx");
		FileOutputStream fos = new FileOutputStream(file);
		wb.write(fos);
		wb.close();
		
	}

}
