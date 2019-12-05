package Maven.MavenProjects.SeleniumBasics;

import java.io.IOException;

import Maven.MavenProjects.ProjectSpecificMethods;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class CreateLeadUsingDataProvider extends ProjectSpecificMethods {
	@DataProvider(name = "fetchData")
	public String[][] sendData() throws IOException {
		ExcelDataProvider data = new ExcelDataProvider();
		String[][] excelData = data.readExcelData("CreateLead");
		return excelData;
	}
	@Test(dataProvider = "fetchData")
	public void runCreateLead(String companyName, String firstName, String lastName) {
		driver.findElementByLinkText("Leads").click();
		driver.findElementByLinkText("Create Lead").click();
		driver.findElementById("createLeadForm_companyName").sendKeys(companyName);
		driver.findElementById("createLeadForm_firstName").sendKeys(firstName);
		driver.findElementById("createLeadForm_lastName").sendKeys(lastName);
		driver.findElementByName("submitButton").click();

	}

	
	@DataProvider(name = "fetchData1")
	public String[][] sendData1() {
//		String[][] data = new String[rowSize][colSize];

		String[][] data = new String[2][3];
		data[0][0] = "Testleaf";
		data[0][1] = "Sam";
		data[0][2] = "Lazaruz";

		data[1][0] = "Qeagle";
		data[1][1] = "Naveen";
		data[1][2] = "Elumalai";
		return data;

	}

}
