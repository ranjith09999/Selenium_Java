package Maven.MavenProjects.SeleniumBasics;

import java.util.List;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class LearnFindElements {

	public static void main(String[] args) {
		// Set driver path
		System.setProperty("webdriver.chrome.driver",
				"./drivers/chromedriver.exe");
		// launch browser
		ChromeDriver driver = new ChromeDriver();
		// load the url
		driver.get("http://leafground.com/pages/Dropdown.html");
		// maximize the browser
		driver.manage().window().maximize();
		List<WebElement> allDropDown = driver.findElementsByTagName("select");
		System.out.println(allDropDown.size());
		WebElement first = allDropDown.get(0);
		first.click();
	}
}




