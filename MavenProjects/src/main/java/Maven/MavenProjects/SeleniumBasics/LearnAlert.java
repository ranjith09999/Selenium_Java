package Maven.MavenProjects.SeleniumBasics;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnAlert {

	public static void main(String[] args) throws InterruptedException, IOException {
		// Set driver path
		System.setProperty("webdriver.chrome.driver",
				"./drivers/chromedriver.exe");
		// launch browser
		ChromeDriver driver = new ChromeDriver();
		// load the url
		driver.get("http://leafground.com/pages/Alert.html");
		// maximize the browser
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);


		driver.findElementByXPath("//button[text()='Prompt Box']").click();
	/*	File source = driver.getScreenshotAs(OutputType.FILE);
		File destinationFile= new File("./snaps/Img002.png");
		FileUtils.copyFile(source, destinationFile);*/
		
		
		Alert alert = driver.switchTo().alert();
		String alertText = alert.getText();
		System.out.println(alertText);
		alert.sendKeys("Test Leaf");
		Thread.sleep(5000);
//		alert.dismiss();
		String title = driver.getTitle();
		System.out.println(title);
		
		
		
		
		
		
		
		
	}
}




