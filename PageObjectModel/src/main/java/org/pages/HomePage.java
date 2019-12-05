package org.pages;

import org.baseAPI.ProjectSpecificMethods;

public class HomePage extends ProjectSpecificMethods{
	
	public LoginPage clickLogout() {
		driver.findElementByClassName("decorativeSubmit").click();
		return new LoginPage();
	}
	

	
	
	
	
	
	
	
	
	
	
	
}
