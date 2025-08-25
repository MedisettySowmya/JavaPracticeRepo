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

public class TimerAlerts {
	public static void main(String[] args) throws Exception {

		System.out.println("==> Setting up ChromeDriver...");
		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();
		System.out.println("==> Chrome browser launched.");

		driver.manage().window().maximize();
		System.out.println("==> Browser window maximized.");

		driver.get("https://demoqa.com/alerts");
		System.out.println("==> Navigated to: https://demoqa.com/alerts");

		// Wait for full page load
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		wait.until(d -> ((JavascriptExecutor) d).executeScript("return document.readyState").equals("complete"));
		System.out.println("==> Page fully loaded.");

		// Locate timer alert button
		WebElement timerAlertBtn = driver.findElement(By.id("timerAlertButton"));
		System.out.println("==> Located 'timerAlertButton'.");

		// Ensure scrolling enabled in case button is out of view
		((JavascriptExecutor) driver).executeScript("document.body.style.overflow = 'auto';");
		System.out.println("==> Ensured scrolling is enabled.");

		// Click on timer alert button
		timerAlertBtn.click();
		System.out.println("==> Clicked 'timerAlertButton'. Waiting for alert...");

		Thread.sleep(2000); // brief pause

		// Wait until alert is present
		wait.until(ExpectedConditions.alertIsPresent());
		System.out.println("==> Alert is now present.");

		// Switch to alert
		Alert timerAlert = driver.switchTo().alert();
		System.out.println("==> Switched to alert. Alert text: " + timerAlert.getText());

		Thread.sleep(2000);

		// Accept the alert
		timerAlert.accept();
		System.out.println("==> Alert accepted.");
		Thread.sleep(2000);

		// Close browser
		driver.quit();
		System.out.println("==> Browser closed. Test completed successfully.");
	}
}
