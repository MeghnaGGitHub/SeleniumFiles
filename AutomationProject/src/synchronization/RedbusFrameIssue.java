package synchronization;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RedbusFrameIssue 
{
	public static void main(String[] args) throws InterruptedException 
	{
	WebDriverManager.firefoxdriver().setup();
	WebDriver driver=new FirefoxDriver();
	WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));
	driver.get("http://www.redbus.in/");
	driver.findElement(By.id("i-icon-profile")).click();
	driver.findElement(By.id("signInLink")).click();
	Thread.sleep(3000);
	// WebElement frame = driver.findElement(By.id("newFbId"));
	WebElement frame=driver.findElement(By.linkText("Facebook"));
	wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(frame));
	frame.click();
	}

}

