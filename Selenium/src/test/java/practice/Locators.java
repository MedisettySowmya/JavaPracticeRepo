package practice;

import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Locators {

	WebDriver driver;
	WebDriverWait wait;
	Actions actions;

	public void browserLunch(String url) {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(url);
	}

	public void locators() throws InterruptedException {
		// driver.findElement(By.id(""));
		// driver.findElement(By.linkText("TOOLS QA"));
		// driver.findElement(By.partialLinkText("Selenium"));
		wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		System.out.println("Moved to Selenium page");

		//driver.findElement(By.xpath("//img[@alt='Selenium Online Training']")).click();
		//System.out.println("Clicked on ToolsQA logo");

		driver.manage().timeouts().implicitlyWait(1000, TimeUnit.SECONDS);
		Thread.sleep(3000);

	}

	public void ElementAccess() throws InterruptedException {

	    WebElement tabElements = driver.findElement(By.xpath("//h5[contains(text(),'Elements')]"));
	    JavascriptExecutor js = (JavascriptExecutor) driver;

	    // js.executeScript("window.scrollBy(0,500)");
	    Thread.sleep(3000);

	   

	    // js.executeScript("window.scrollTo(0,document.body.scrollHeight)");//bottom
	    js.executeScript("arguments[0].scrollIntoView(true);", tabElements);
	    actions = new Actions(driver);
	    actions.moveToElement(tabElements).pause(Duration.ofSeconds(2)).perform();
	    Thread.sleep(2000);

	    tabElements.click();

	    // driver.findElement(By.xpath("//h5[starts-with(text(),'Forms')]")).click();
	    Thread.sleep(2000);

	    // driver.findElement(By.xpath("//h5[ends-with(text(),'Windows']")).click();
	    List<WebElement> list = driver.findElements(By.tagName("h5"));
	}
	

	public void browserClose() {
		System.out.println("Closing the current window");

		driver.close(); //
		System.out.println("Closing the all the windows");
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// driver.quit();
	}

	public static void main(String args[]) throws InterruptedException {
		Locators l = new Locators();
		l.browserLunch("https://demoqa.com/");
		// l.locators();
		l.ElementAccess();
		//l.browserClose();
	}

}
