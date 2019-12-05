package Maven.MavenProjects.SamplePrograms;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClassRoom {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	ChromeDriver driver = new ChromeDriver();
	driver.get("http://leafground.com/pages/sorttable.html");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	List<WebElement> empIds = driver.findElementsByXPath("//tbody/tr[@role='row']/td[1]");
	for (WebElement eachElement : empIds) {
		System.out.println(eachElement.getText());
	}





}
}
