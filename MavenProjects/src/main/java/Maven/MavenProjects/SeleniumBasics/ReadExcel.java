package Maven.MavenProjects.SeleniumBasics;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class ReadExcel {

	@Test
	public void readExcelData() throws IOException {

		// Hierarchy -> WorkBook, Sheet, Row, Cell
		// Step 1: Open the workbook by its file name
		XSSFWorkbook book = new XSSFWorkbook("./data/CreateLead.xlsx");
		XSSFSheet sheet = book.getSheet("CL"); 		// Step 2: Go to the sheet
		int rowCount = sheet.getLastRowNum(); 		// Step 3: Go to the first row
		System.out.println("Row Count " + rowCount);
		for (int j = 1; j <= rowCount; j++) {
			XSSFRow row = sheet.getRow(j);
			int colCount = row.getLastCellNum();
			System.out.println("Col Count " + colCount);
			for (int i = 0; i < colCount; i++) {
				XSSFCell cell = row.getCell(i); // Step 4: Go to the first cell of the row
				String value = cell.getStringCellValue();  // Step 5: Read the contents by its type
				System.out.println(value);
			}
		}
		book.close(); 		// Step 6: Close the workbook
	}

}


