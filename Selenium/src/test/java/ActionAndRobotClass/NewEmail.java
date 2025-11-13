package ActionAndRobotClass;

import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.Point;
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

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));

		// Enter email
		WebElement emailLocator = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("i0116")));
		emailLocator.sendKeys("sowmyamedisetty@outlook.com");
		Actions actions = new Actions(driver);
		actions.sendKeys(Keys.ENTER).perform();

		WebElement usePwdBtn = wait.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath("//span[contains(text(),'Use your password')]")));

		Point location = usePwdBtn.getLocation();
		int x = location.getX();
		int y = location.getY();

		robot.mouseMove(x, y);

		Thread.sleep(2000);

		usePwdBtn.click();

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

		// Drag and Drop
		// Locate drag sources and targets
		WebElement sentItemsLocationfrom = driver.findElement(By.xpath("//div[@data-folder-name='sent items']"));
		WebElement draftLocationTo = driver.findElement(By.xpath("//div[@data-folder-name='drafts']"));
		Point from = sentItemsLocationfrom.getLocation();
		Point to = draftLocationTo.getLocation();

		// Move directly to source
		robot.mouseMove(from.getX() + 100, from.getY() + 150);
		Thread.sleep(1000);

		// Press and hold left button
		robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
		Thread.sleep(1000);

		// Instantly move to target
		robot.mouseMove(to.getX() + 100, to.getY() + 150);
		Thread.sleep(1000);

		// Release mouse
		robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);

		// Get BEFORE text (3rd element)
		WebElement before = driver.findElement(By.xpath("(//span[@class='gtcPn _8g73 LPIso'])[3]"));
		String beforeText = before.getText();
		System.out.println("Before drag, 3rd element = " + beforeText);

		// Example: Sent → Drafts
		if (beforeText.equals("Drafts")) {
			actions.dragAndDrop(draftLocationTo, sentItemsLocationfrom);
		} else {
			actions.dragAndDrop(sentItemsLocationfrom, draftLocationTo);
		}

		actions.clickAndHold(sentItemsLocationfrom).moveToElement(draftLocationTo).release().build().perform();

		Thread.sleep(3000); // allow UI to update

		// Get AFTER text (3rd element)
		WebElement after = driver.findElement(By.xpath("(//span[@class='gtcPn _8g73 LPIso'])[3]"));
		String afterText = after.getText();
		System.out.println("After drag, 3rd element = " + afterText);

		// Validation
		if (afterText.equalsIgnoreCase("Sent Items")) {
			System.out.println("PASS: Source is dropped into target successfully");
			driver.close();
		} else {
			System.out.println("FAIL: Drag and Drop did not work");
		}
	}
}
