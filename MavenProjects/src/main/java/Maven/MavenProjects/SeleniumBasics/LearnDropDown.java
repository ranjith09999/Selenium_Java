package Maven.MavenProjects.SeleniumBasics;

import java.util.List;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class LearnDropDown {

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
		WebElement dropdown1 = driver.findElementById("dropdown1");
		Select dd = new Select(dropdown1);
		List<WebElement> options = dd.getOptions();
		int size = options.size();
		dd.selectByIndex(size-1);
//		dd.selectByValue("3");
//		dd.selectByVisibleText("Selenium");
//		dd.selectByIndex(3);
	}
}




