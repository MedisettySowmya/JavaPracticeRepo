package test;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class SeleniumTest {

    public static void main(String[] args) {

        // Setup ChromeDriver using WebDriverManager
        WebDriverManager.chromedriver().setup();
        
        // Initialize WebDriver
        WebDriver driver = new ChromeDriver();

        // Open Google
        driver.get("https://chorusqa.cogninelabs.com/");

        // Print Page Title
        System.out.println("Page Title: " + driver.getTitle());

        // Close the browser
        driver.quit();
    }
}

