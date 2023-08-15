package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class fbEmailAndPwd {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.facebook.com/");
		WebElement rv1=driver.findElement(By.id("email"));
		rv1.sendKeys("admin@gmail.com");
		WebElement rv2 = driver.findElement(By.id("pass"));
		rv2.sendKeys("admin@1234");
		Thread.sleep(3000);
		driver.close();
	}

}
