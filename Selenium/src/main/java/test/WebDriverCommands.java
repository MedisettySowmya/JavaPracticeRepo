package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
import java.time.Duration;

public class WebDriverCommands {

    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        try {
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

            driver.get("https://www.google.com");
            System.out.println(driver.getCurrentUrl());

            String title = driver.getTitle();
            System.out.println(title);

            WebElement searchBox = driver.findElement(By.name("q"));
            searchBox.sendKeys("Selenium WebDriver Commands");
            searchBox.submit();

            Thread.sleep(3000);

            driver.navigate().to("https://www.selenium.dev/");
            System.out.println(driver.getCurrentUrl());

            driver.navigate().back();
            System.out.println(driver.getCurrentUrl());

            driver.navigate().forward();
            System.out.println(driver.getCurrentUrl());

            driver.navigate().refresh();

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            driver.quit();
            System.out.println("Browser closed.");
        }
    }
}
