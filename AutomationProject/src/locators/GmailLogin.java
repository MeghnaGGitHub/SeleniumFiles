package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GmailLogin {

	public static void main(String[] args) {
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver=new FirefoxDriver();
		
		
		
		driver.get("https://mail.google.com");
		WebElement emailLogin = driver.findElement(By.id("identifierId"));
		emailLogin.sendKeys("seltester16112022@gmail.com");
		
		//driver.findElement(By.cssSelector("#identifierId")).sendKeys("seltester16112022@gmail.com");
		// driver.findElement(By.cssSelector(".VfPpkd-LgbsSe-OWXEXe-k8QpJ > span:nth-child(4)")).click();
		
		WebElement nextBtn = driver.findElement(By.className("VfPpkd-LgbsSe-OWXEXe-k8QpJ"));
		nextBtn.click();
		
		WebElement pwd = driver.findElement(By.className("whsOnd zHQkBf"));
		pwd.sendKeys("Meghn@313");
		
		driver.findElement(By.className("VfPpkd-vQzf8d")).click();
		
		
		
		
		
		/*WebElement nextBtn = driver.findElement(By.id("login-signin"));
		nextBtn.click();
		WebElement pwdLogin = driver.findElement(By.id("login-passwd"));
		pwdLogin.sendKeys("Meghn@313");
		WebElement nextBtn2 = driver.findElement(By.id("login-signin"));
		nextBtn2.click();
		WebElement mailIcon = driver.findElement(By.linkText("Mail"));
		mailIcon.click();
		*/
		
	}

}
