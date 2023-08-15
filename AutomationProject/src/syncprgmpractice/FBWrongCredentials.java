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

public class FBWrongCredentials 
{
	public static void main(String[] args) 
	{
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.facebook.com");
		
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(5000));
		wait.until(ExpectedConditions.titleContains("Facebook"));
		WebElement email = driver.findElement(By.id("email"));
		wait.until(ExpectedConditions.visibilityOf(email));
		email.sendKeys("meghnagupta313@gmail.com");
		
		WebElement pwd = driver.findElement(By.id("pass"));
		wait.until(ExpectedConditions.visibilityOf(pwd));
		pwd.sendKeys("Meghn@");
		
		WebElement loginbtn = driver.findElement(By.name("login"));
		wait.until(ExpectedConditions.elementToBeClickable(loginbtn));
		loginbtn.click();
	/*	String title = driver.getTitle();
		if (title.contains(title))
		{
			WebElement forgotpwd=driver.findElement(By.partialLinkText("Forgotten"));
			wait.until(ExpectedConditions.visibilityOf(forgotpwd));
			forgotpwd.click();
			System.out.println("Forgot pwd page is displayed!!");
			
			WebElement iemail = driver.findElement(By.id("identify_email"));
			wait.until(ExpectedConditions.visibilityOf(iemail));
			iemail.sendKeys("meghnagupta313@gmail.com");
			
			WebElement searchbtn = driver.findElement(By.id("did_submit"));
			wait.until(ExpectedConditions.elementToBeClickable(searchbtn));
			searchbtn.click();
		}*/
		try 
		{
			System.out.println("Caution------>>>>> You just clicked on Forgot password link  !!!!!!");
		}
		catch (TimeoutException e) 
		{
			WebElement forgotpwd=driver.findElement(By.partialLinkText("Forgotten"));
			wait.until(ExpectedConditions.visibilityOf(forgotpwd));
			forgotpwd.click();
			System.out.println("Forgot pwd page is displayed!!");
		}
	}
}
