package Windows;

import java.util.Set;
import java.util.Iterator;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MultipleWindows {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://demoqa.com/browser-windows");

        String mainWindow = driver.getWindowHandle();

        WebElement windowBtn = driver.findElement(By.id("windowButton"));
        WebElement messageWindowBtn = driver.findElement(By.id("messageWindowButton"));

        // Click "New Window" using JavaScript
        ((JavascriptExecutor) driver).executeScript("arguments[0].click();", windowBtn);
        System.out.println("Clicked 'New Window'");

        Thread.sleep(1000); // give time for new window to open

        ((JavascriptExecutor) driver).executeScript("arguments[0].click();", messageWindowBtn);
        System.out.println("Clicked 'New Window Message'");

        Thread.sleep(2000); // give time for both windows to appear

        Set<String> allWindows = driver.getWindowHandles();
        Iterator<String> windowIterator = allWindows.iterator();

        int count = 1;

        while (windowIterator.hasNext()) {
            String windowId = windowIterator.next();

            if (!windowId.equals(mainWindow)) {
                driver.switchTo().window(windowId);
                System.out.println("Switched to Child Window " + count + ", Title: " + driver.getTitle());

                try {
                    Thread.sleep(1000);
                    driver.close();
                    System.out.println("Closed Child Window " + count);
                } catch (Exception e) {
                    System.out.println("Could not close child window " + count + ": " + e.getMessage());
                }

                count++;
            }
        }

        driver.switchTo().window(mainWindow);
        System.out.println("✅ Returned to Main Window");

        driver.quit(); // closes all windows and ends session
    }
}
