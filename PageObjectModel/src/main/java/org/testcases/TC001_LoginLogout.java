package org.testcases;

import org.baseAPI.ProjectSpecificMethods;
import org.pages.LoginPage;
import org.testng.annotations.Test;

public class TC001_LoginLogout extends ProjectSpecificMethods {

	
	@Test
	public void loginLogout() {
		
		/*LoginPage obj = new LoginPage();
		obj.enterUserName();
		obj.enterPassword();
		obj.clickLogin();*/
		
		new LoginPage()
		.enterUserName()
		.enterPassword()
		.clickLogin()
		.clickLogout();
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
		
	}
	
	
}
