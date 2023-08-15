 
package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FBLoginScript {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.facebook.com/");
		WebElement un = driver.findElement(By.id("email"));
		un.sendKeys("meghnagupta313@gmail.com");
		
		WebElement pwd = driver.findElement(By.id("pass"));
		pwd.sendKeys("Meghn@313");
		
		WebElement loginBtn = driver.findElement(By.name("login"));
		loginBtn.click();
		
	}

}
