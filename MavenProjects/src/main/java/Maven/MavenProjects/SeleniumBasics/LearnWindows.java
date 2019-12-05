package Maven.MavenProjects.SeleniumBasics;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;

public class LearnWindows {

	public static void main(String[] args) throws InterruptedException, IOException {
		// Set driver path
		System.setProperty("webdriver.chrome.driver",
				"./drivers/chromedriver.exe");
		// launch browser
		ChromeDriver driver = new ChromeDriver();
		// load the url
		driver.get("http://leafground.com/pages/Window.html");
		// maximize the browser
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		System.out.println(driver.getTitle());
		String CurrentwindowRef = driver
				.getWindowHandle();
		System.out.println(CurrentwindowRef);
		
		
		driver.findElementById("home").click();
		Set<String> windowHandles
		= driver.getWindowHandles();
		List<String> allHandles 
		= new ArrayList<String>(windowHandles);
		String window2 = allHandles.get(1);
		driver.switchTo().window(window2);
		System.out.println("No.of Windows "+windowHandles.size());
		System.out.println(driver.getTitle());
		driver.quit();
		
		
		
//		driver.switchTo().window(nameOrHandle)
		
	}
}




