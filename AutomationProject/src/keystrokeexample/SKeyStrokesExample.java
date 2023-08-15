package keystrokeexample;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SKeyStrokesExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver=new FirefoxDriver();
		driver.get("https://demo.actitime.com/login.do");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		//un
		//driver.findElement(By.id("username")).sendKeys("admin");
		//driver.findElement(By.name("pwd")).sendKeys("manager");
		
		WebElement un = driver.findElement(By.id("username"));
		un.sendKeys("admin");
		//select admin text from un field
		un.sendKeys(Keys.CONTROL+"a");
		//cpoy the admin text
		un.sendKeys(Keys.CONTROL,"c");
		un.sendKeys(Keys.TAB+""+Keys.CONTROL,"v");
		
		//sendKeys(Keys.CONTROL,"v");
		
		//paste admin in pwd field
		//driver.findElement(By.name("pwd")).sendKeys(Keys.CONTROL+"v");
		
		/*//select checkbox
		driver.findElement(By.id("keepLoggedInCheckBox")).sendKeys(Keys.SPACE);
		//click on login btn
		driver.findElement(By.id("loginButton")).sendKeys(Keys.ENTER);*/
		
	}

}
