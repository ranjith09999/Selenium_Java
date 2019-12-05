package Maven.MavenProjects.SeleniumBasics;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Drag {

	public static void main(String[] args) throws InterruptedException {
		// Set driver path
		System.setProperty("webdriver.chrome.driver",
				"./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leafground.com/pages/drag.html");
		WebElement ele = driver.findElementById("draggable");
		Actions builder = new Actions(driver);
		builder.dragAndDropBy(ele, 100, 50).perform();
	}
}












