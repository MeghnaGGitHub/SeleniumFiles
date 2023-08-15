//WATS to login into Facebook using TestNg
package testngdayfivedec15selwithtestng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SimpleFacebookLogin 
{
	@Test()
	public void testLogin()
	{	
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.facebook.com");
		driver.findElement(By.id("email")).sendKeys("admin@gmail.com");
		driver.findElement(By.id("pass")).sendKeys("admin123");
	}
}
