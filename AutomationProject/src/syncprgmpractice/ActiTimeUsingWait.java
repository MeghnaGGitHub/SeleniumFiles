package syncprgmpractice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ActiTimeUsingWait {

	public static void main(String[] args) {
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver=new FirefoxDriver();
		driver.get("https://demo.actitime.com/login.do");
		//verify un is present or not
		WebElement un = driver.findElement(By.id("username"));
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(6));
		wait.until(ExpectedConditions.visibilityOf(un));
		un.sendKeys("admin");
		//verify pwd is present or not
		wait.withTimeout(Duration.ofSeconds(10));
		WebElement pwd=driver.findElement(By.name("pwd"));
		wait.until(ExpectedConditions.visibilityOf(pwd));
		pwd.sendKeys("manager");
		// verify check-box is click-able or not
		WebElement chk = driver.findElement(By.id("keepLoggedInCheckBox"));
		try 
		{
		System.out.println("check box is selected!!");
		wait.until(ExpectedConditions.elementToBeClickable(chk));
		}
		catch(TimeoutException e)
		{
			System.out.println("check box is selected!!");
			chk.click();
		}
		//verify login button
		WebElement lbutton = driver.findElement(By.id("loginButton"));
		wait.until(ExpectedConditions.elementToBeClickable(lbutton));
		lbutton.click();
		System.out.println("Wait Time of 5 seconds has started!!!");
		wait.withTimeout(Duration.ofSeconds(5));
		System.out.println("Wait Time of 5 seconds has ended!!!");
		driver.close();
	}

}
