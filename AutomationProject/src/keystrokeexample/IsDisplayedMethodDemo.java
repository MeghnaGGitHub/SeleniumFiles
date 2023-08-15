package keystrokeexample;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class IsDisplayedMethodDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver=new FirefoxDriver();
		driver.get("https://demo.actitime.com/login.do");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.id("loginButton")).click();
		WebElement errmsg = driver.findElement(By.xpath(".//span[contains(text(),'Username or Password')]"));
		boolean status = errmsg.isDisplayed();
		if (status) {
			System.out.println("Error msg is displayed");
		}else
		{
			System.out.println("Error msg is not displayed");

		}
	}

}
