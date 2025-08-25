package Alerts;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SimpleAlerts {
	public static void main(String[] args) throws Exception {

		System.out.println("Setting up ChromeDriver...");
		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();
		System.out.println("Chrome browser launched.");

		driver.manage().window().maximize();
		System.out.println("Browser window maximized.");

		driver.get("https://demoqa.com/alerts");
		System.out.println("Navigated to: https://demoqa.com/alerts");

		// Wait for full page load
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		wait.until(d -> ((JavascriptExecutor) d).executeScript("return document.readyState").equals("complete"));
		System.out.println("Page fully loaded.");

		// Find and click the alert button
		WebElement simpleAlertbtn = driver.findElement(By.id("alertButton"));

		System.out.println("Located 'Click me' button for simple alert.");
		Thread.sleep(2000);

		simpleAlertbtn.click();
		System.out.println("Clicked the 'Click me' button.");
		Thread.sleep(2000);
		// Wait for alert and accept
		wait.until(ExpectedConditions.alertIsPresent());

		Alert simpleAlert = driver.switchTo().alert();
		System.out.println(simpleAlert.getText());
		assertEquals("You clicked a button", simpleAlert.getText());
		simpleAlert.accept();
		System.out.println("Simple alert appeared and was accepted.");

		Thread.sleep(2000);
		System.out.println("Paused for 2 seconds to observe result.");

		driver.quit();
		System.out.println("Browser closed. Test completed successfully.");

	}
}
