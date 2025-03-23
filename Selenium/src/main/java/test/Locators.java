package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
import java.time.Duration;

public class Locators {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();

		try {
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

			driver.get("https://www.saucedemo.com/");

			WebElement username = driver.findElement(By.id("user-name"));
			username.sendKeys("standard_user");

			WebElement password = driver.findElement(By.name("password"));
			password.sendKeys("secret_sauce");

			WebElement loginButton = driver.findElement(By.className("btn_action"));
			loginButton.click();

			Thread.sleep(3000);

			String currentUrl = driver.getCurrentUrl();
			if (currentUrl.contains("inventory")) {
				System.out.println("Login successful!");
			} else {
				System.out.println("Login failed.");
			}

			WebElement firstProduct = driver.findElement(By.cssSelector(".inventory_item_name"));
			System.out.println("First product: " + firstProduct.getText());

			WebElement addToCart = driver.findElement(By.xpath("//button[text()='Add to cart']"));
			addToCart.click();

			Thread.sleep(3000);

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			driver.quit();
			System.out.println("Browser closed.");
		}
	}
}
