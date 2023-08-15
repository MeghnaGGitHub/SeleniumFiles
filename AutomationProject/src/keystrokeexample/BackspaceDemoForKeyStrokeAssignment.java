/*WATS to enter text in username field & remove text by using only BACKSPACE key-stroke in actitime application */
package keystrokeexample;

import java.time.Duration;
import java.util.Iterator;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BackspaceDemoForKeyStrokeAssignment {

	public static void main(String[] args) throws InterruptedException {
		String value="Manager";
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver=new FirefoxDriver();
		driver.get("https://demo.actitime.com/login.do");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement un = driver.findElement(By.id("username"));
		Thread.sleep(3000);
		un.sendKeys(value);
		for(int i=0;i<value.length();i++)
		{
			un.sendKeys(Keys.BACK_SPACE);
			Thread.sleep(2000);

		}
		
	}

}
