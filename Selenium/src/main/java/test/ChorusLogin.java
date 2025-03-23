package test;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ChorusLogin {

    public static void main(String[] args) {

        WebDriver driver;

        // Chrome
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        performLogin(driver);

        // Firefox
        WebDriverManager.firefoxdriver().setup();
        driver = new FirefoxDriver();
        performLogin(driver);

        // Internet Explorer
        //WebDriverManager.iedriver().setup();
        //driver = new InternetExplorerDriver();
        //performLogin(driver);
        
        // Edge
        WebDriverManager.edgedriver().setup();
        EdgeOptions options= new EdgeOptions();
        options.addArguments("-inprivate");
        driver = new EdgeDriver(options);
        performLogin(driver);
    }

    public static void performLogin(WebDriver driver) {
        try {
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
            driver.get("https://chorusqa.cogninelabs.com/");

            WebElement emailField = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("i0116")));
            emailField.sendKeys("chorus.automation@cognine.com");
            Thread.sleep(2);

            WebElement nextButton = wait.until(ExpectedConditions.elementToBeClickable(By.id("idSIButton9")));
            nextButton.click();
            Thread.sleep(2);

            WebElement passwordField = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("i0118")));
            passwordField.sendKeys("Welcome2Cognine");
            Thread.sleep(2);

            WebElement signInButton = wait.until(ExpectedConditions.elementToBeClickable(By.id("idSIButton9")));
            signInButton.click();
            Thread.sleep(2);

            WebElement staySignedInNoBtn = wait.until(ExpectedConditions.elementToBeClickable(By.id("idBtn_Back")));
            staySignedInNoBtn.click();
            Thread.sleep(2);

            System.out.println("Login successful in " + driver.getTitle());
        	Thread.sleep(10);

        } catch (Exception e) {
            System.out.println("Error during login: " + e.getMessage());
        } finally {
            driver.quit();
            System.out.println("Browser closed.");
        }
    }
}
