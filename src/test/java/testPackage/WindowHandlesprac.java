package testPackage;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandlesprac {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"/Driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
	
	
		driver.get("http://www.naukri.com/");
		
		String mWindow = driver.getWindowHandle();
		
		Set<String> cWindow = driver.getWindowHandles();
		Iterator<String> it = cWindow.iterator();
		
		while(it.hasNext()) {
			String child = it.next();
			if(!mWindow.equalsIgnoreCase("child")) {
				driver.switchTo().window(child);
				driver.close();
			}
		}
		
	}
	}

