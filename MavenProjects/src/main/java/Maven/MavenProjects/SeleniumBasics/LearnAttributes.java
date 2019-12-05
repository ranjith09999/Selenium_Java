package Maven.MavenProjects.SeleniumBasics;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class LearnAttributes {
	//@Test(invocationCount=10)
	//@Test(priority=1)
	@Test()
	public void runCreateLead() {
		System.out.println("Run Create Lead for Balaji");
	}
	@Test(dependsOnMethods="LearnAttributes.runCreateLead")
	public void runEditLead() {
		System.out.println("Run Edit Lead for Balaji");
	}
	@Test(dependsOnMethods="LearnAttributes.runCreateLead")
	public void runF() {
		System.out.println("Run Delete Lead for Balaji");
	}
	
	@Test()
	 public void run() {
		 
	 }
	 
	 @DataProvider(name="smoke")
	 public Object[][] returnData(){
		 return null;
	 }

}
