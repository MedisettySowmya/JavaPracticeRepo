package ActionAndRobotClass;

import java.awt.AWTException;
import java.awt.Dimension;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.time.Duration;

import javax.imageio.ImageIO;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ScreenShot {

	public static void main(String[] args) throws AWTException, IOException {

		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(5));
		driver.manage().window().maximize();
		driver.get("https://outlook.office.com/mail/");
		
		wait.until(ExpectedConditions.titleIs("Sign in to your account"));
		WebElement emailLocator = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("i0116")));


		Robot robot = new Robot();

		Dimension screensize = Toolkit.getDefaultToolkit().getScreenSize();
		Rectangle screenRect = new Rectangle(screensize);
		
		BufferedImage screenshot = robot.createScreenCapture(screenRect);
		File outputFile = new File("C:\\Users\\Sowmya Medisetty\\Desktop\\screenshot1.png");
		
		ImageIO.write(screenshot, "png", outputFile);
		System.out.println("Screenshot saved at: " + outputFile.getAbsolutePath());
		
		  // Take screenshot
        TakesScreenshot ts = (TakesScreenshot) driver;
        File sourceFile = ts.getScreenshotAs(OutputType.FILE);

        // Define destination and copy the file
        File destinationFile = new File("C:\\Users\\Sowmya Medisetty\\Desktop\\screenshot2.png"); 
        FileUtils.copyFile(sourceFile, destinationFile);

        System.out.println("Screenshot saved to: " + destinationFile.getAbsolutePath());

		

	}

}
