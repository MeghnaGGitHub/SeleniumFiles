package seleniumtestquestions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ActiTimeAppScript {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver=new FirefoxDriver();
		driver.get("https://demo.actitime.com/login.do");
		driver.findElement(By.id("username")).sendKeys("admin");
		Thread.sleep(2000);
		driver.findElement(By.name("pwd")).sendKeys("manager");
		Thread.sleep(2000);
		driver.findElement(By.id("keepLoggedInCheckBox")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("loginButton")).click();
		Thread.sleep(8000);
		driver.findElement(By.id("addTaskButtonId")).click();
	}
}
