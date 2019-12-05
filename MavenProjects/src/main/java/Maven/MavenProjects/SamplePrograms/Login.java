package Maven.MavenProjects.SamplePrograms;

import org.openqa.selenium.Keys;
//import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login {

	public static void main(String[] args) throws InterruptedException {
		// Set driver path
		System.setProperty("webdriver.chrome.driver",
				"./drivers/chromedriver.exe");
		// launch browser
		ChromeDriver driver = new ChromeDriver();
		// load the url
		driver.get("http://leaftaps.com/opentaps");
		// maximize the browser
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		driver.findElementById("username")
			.sendKeys("DemoSalesManager");
		driver.findElementById("password")
			.sendKeys("crmsfa", Keys.ENTER);
		/*driver.findElementByClassName("decorativeSubmit")
			.click();*/
		// close the browser
		driver.close();
	}
}




