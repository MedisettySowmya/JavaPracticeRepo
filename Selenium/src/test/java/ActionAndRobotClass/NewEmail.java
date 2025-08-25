package ActionAndRobotClass;

import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class NewEmail {
	public static void main(String[] args) throws Exception {

		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();
		Robot robot = new Robot();
		driver.manage().window().maximize();
		driver.get("https://outlook.office.com/mail/");

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));

		// Enter email
		WebElement emailLocator = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("i0116")));
		emailLocator.sendKeys("sowmyamedisetty@outlook.com");
		Actions actions = new Actions(driver);
		actions.sendKeys(Keys.ENTER).perform();

		// Enter password
		WebElement passwordLocator = wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("passwd")));
		passwordLocator.sendKeys("Sowmy@369");
		actions.sendKeys(Keys.ENTER).perform();

		// Click Yes on "Stay signed in?"
		try {
			// WebElement staySignedInSkipforow = wait
			// .until(ExpectedConditions.elementToBeClickable(By.xpath("//button[contains(text(),'Skip
			// for now')]")));
			WebElement staySignedInYes = wait
					.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[contains(text(),'Yes')]")));
			Thread.sleep(1000);
			staySignedInYes.click();
			// actions.moveToElement(staySignedInSkipforow).click().perform();

			Thread.sleep(1000);
		} catch (Exception e) {
			System.out.println("Stay signed in prompt not shown or took too long.");
		}

		try {
			WebElement noThanksbtn = wait.until(
					ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[contains(text(),'No, thanks')]")));
			noThanksbtn.click();
			System.out.println("'No, thanks' button clicked.");
		} catch (Exception e) {
			System.out.println("'No, thanks' button not shown.");
		}

		// Click "New mail" button with wait and JavaScript (more reliable than Robot
		// for buttons)
		WebElement newEmailBtn = wait
				.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@aria-label='New mail']")));
		((JavascriptExecutor) driver).executeScript("arguments[0].click();", newEmailBtn);

		// Wait for "To" textbox to confirm new email form is open
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@id='0']")));

		// Wait for the bottom bar or Attach icon to be visible
		WebElement attachFile = wait.until(
				ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@aria-label='Include']//button[1]")));
		Thread.sleep(2000); // Just to ensure full render (optional but helps)

		// Click Attach File
		((JavascriptExecutor) driver).executeScript("arguments[0].click();", attachFile);

		// Wait for "Browse this computer" option
		WebElement browseThiscomputerlocator = wait.until(
				ExpectedConditions.elementToBeClickable(By.xpath("//span[normalize-space()='Browse this computer']")));

		browseThiscomputerlocator.click();

		// Upload the file using Robot
		String filePath = "C:\\Users\\Sowmya Medisetty\\Downloads\\Testing.xlsx";
		StringSelection selection = new StringSelection(filePath);
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(selection, null);

		// Simulate Ctrl+V and Enter
		Thread.sleep(1000); // Give time for the dialog to appear
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_CONTROL);
		Thread.sleep(500);
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);

	}
}
