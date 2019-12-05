package Maven.MavenProjects.SeleniumBasics;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class WriteExcel {
	
	@Test
	public void writeExcelData() throws IOException {
		
		// Step 1: Create the workbook 
		XSSFWorkbook workbook = new XSSFWorkbook();
		// Step 2: Create the sheet
		XSSFSheet sheet = workbook.createSheet("CL");
		// Step 3: Create first row
		XSSFRow row = sheet.createRow(0);
		// Step 4: Create first cell of the row
		XSSFCell cell = row.createCell(0);
		// Step 5: Write the contents by its type
		cell.setCellValue("Testing");
		
		// Step 6: Save the workbook
		FileOutputStream fos = new FileOutputStream
				(new File("./data/New.xlsx"));
		
		workbook.write(fos);
		
		
		
		
		
		
		// Step 7: Close the workbook
		workbook.close();
	}

}
