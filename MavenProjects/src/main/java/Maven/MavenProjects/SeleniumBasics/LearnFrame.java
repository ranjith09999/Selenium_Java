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

public class LearnFrame {

	public static void main(String[] args) throws InterruptedException, IOException {
		// Set driver path
		System.setProperty("webdriver.chrome.driver",
				"./drivers/chromedriver.exe");
		// launch browser
		ChromeDriver driver = new ChromeDriver();
		// load the url
		driver.get("http://leafground.com/pages/frame.html");
		// maximize the browser
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		
		WebElement eleFrame1 = driver.findElementByXPath("(//div[@id='wrapframe']/iframe)[1]");
		driver.switchTo().frame(eleFrame1);
		driver.findElementById("Click").click();
		//to come out of the frame to the webPage
		driver.switchTo().defaultContent();
		
		WebElement eleFrame2 = driver.findElementByXPath("(//div[@id='wrapframe']/iframe)[2]");
		driver.switchTo().frame(eleFrame2);
		driver.switchTo().frame("frame2");
		WebElement eleClick2 = driver.findElementById("Click1");
		
		File source = eleClick2
				.getScreenshotAs(OutputType.FILE);
		File destinationFile= new File("./snaps/Img002.png");
		FileUtils.copyFile(source, destinationFile);
		
		eleClick2.click();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}




