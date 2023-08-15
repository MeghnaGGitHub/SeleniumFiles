/*
 WATS to login on Face-book application by identifying element using cssSelector()
 */
package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FBcssSelectorDemo {

	public static void main(String[] args) {
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.cssSelector("input[data-testid='royal_email']")).sendKeys("abc@gmail.com");
		driver.findElement(By.cssSelector("input[data-testid='royal_pass']")).sendKeys("abc");
		driver.findElement(By.cssSelector("button[data-testid='royal_login_button']")).click();
	}

}
