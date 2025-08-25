package Windows;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ChildWindow {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/browser-windows");
		
		((JavascriptExecutor) driver).executeScript("document.body.style.overflow = 'auto';");

		WebElement newWindow = driver.findElement(By.id("windowButton"));
		newWindow.click();
		String mainWindowHandle  = driver.getWindowHandle();
		
		Set<String> windows = driver.getWindowHandles();
		Iterator<String> iterator = windows.iterator();
		
		
		while(iterator.hasNext())
		{
			String childWindow  = iterator.next();
			
			if(!mainWindowHandle.equalsIgnoreCase(childWindow))
			{
				driver.switchTo().window(childWindow);
                WebElement text = driver.findElement(By.id("sampleHeading"));
                System.out.println("Heading of child window is " + text.getText());			}
			
		}
		System.out.println("Window found");

	}

}
