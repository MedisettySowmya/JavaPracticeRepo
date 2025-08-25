package iframes;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class NestedIFrames {

	public static void main(String[] args) throws Exception {

		WebDriverManager.chromiumdriver().setup();

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://demoqa.com/nestedframes");
		// driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		// ((JavascriptExecutor) driver).executeScript("document.body.style.overflow =
		// 'auto'");
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));

		wait.until(d -> ((JavascriptExecutor) d).executeScript("return document.readyState").equals("complete"));

		WebElement parentiFrame = driver.findElement(By.id("frame1"));
		driver.switchTo().frame(parentiFrame);
		WebElement parentiFrameElement = driver.findElement(By.tagName("body"));
		String parentiFrameText = parentiFrameElement.getText();
		System.out.println(parentiFrameText);

		driver.switchTo().frame(0);
		WebElement childiFrameElement = driver.findElement(By.tagName("p"));
		String childiFrameText = childiFrameElement.getText();
		System.out.println(childiFrameText);
		Thread.sleep(3000);
		driver.quit();
	}
}
