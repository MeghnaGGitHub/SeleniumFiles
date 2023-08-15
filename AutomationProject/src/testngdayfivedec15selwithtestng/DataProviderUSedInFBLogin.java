//WATS to login FB by fetching data from DataProvider
package testngdayfivedec15selwithtestng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DataProviderUSedInFBLogin
{
	@DataProvider
	public Object[] testData()
	{
		Object[][] rv=new Object[1][2];
		rv[0][0]="admin@gmail.com";
		rv[0][1]="admin123";
		return rv;
	}
	@Test(dataProvider = "testData")
	public void testLogin(String email,String pwd)
	{	
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.facebook.com");
		driver.findElement(By.id("email")).sendKeys("email");
		driver.findElement(By.id("pass")).sendKeys("pwd");
	}
}
