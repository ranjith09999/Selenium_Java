package Maven.MavenProjects.SeleniumBasics;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTable {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts()
			.implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("http://leafground.com/pages/table.html");
		List<WebElement> rows = driver.findElementsByXPath
				("//table[@id='table_id']//td/parent::tr");
		System.out.println(rows.size());
		List<WebElement> cols = driver.findElementsByXPath
				("//table[@id='table_id']//th");
		System.out.println(cols.size());
		driver.findElementByXPath
		("//td[text()='Learn XPath']/following::input").click();
		driver.findElementByXPath("//td[text()='Babu']/preceding::input[1]")
		 .click();
		
		
		
		
		
		
		
	}
}












