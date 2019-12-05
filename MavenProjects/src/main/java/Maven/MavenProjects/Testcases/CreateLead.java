package Maven.MavenProjects.Testcases;

import Maven.MavenProjects.ProjectSpecificMethods;
import org.testng.annotations.Test;

public class CreateLead 
extends ProjectSpecificMethods{
	@Test
	public void runCreateLead() {
		
		driver.findElementByLinkText("Lead1").click();
		driver.findElementByLinkText("Create Lead").click();
		driver.findElementById("createLeadForm_companyName").sendKeys("TestLeaf");
		driver.findElementById("createLeadForm_firstName").sendKeys("Gopi");
		driver.findElementById("createLeadForm_lastName").sendKeys("J");
		driver.findElementByName("submitButton").click();
		
}
}






