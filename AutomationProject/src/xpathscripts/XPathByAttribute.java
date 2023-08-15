package xpathscripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class XPathByAttribute {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.fb.com");
		
		//		//x-path by single attribute
		driver.findElement(By.xpath(".//input[@data-testid=\"royal_email\"]")).sendKeys("Abcde@gmail.com");
		//x-path by more than one attribute
		
		//x-path by 2 attributes
		 driver.findElement(By.xpath(".//input[@data-testid=\"royal_pass\" and @ type=\"password\"]")).sendKeys("Pass@123");

		//x-path by or attributes
		 driver.findElement(By.xpath(".//input[@data-testid=\"royal_pass\" or @ type=\"pass\"]")).sendKeys("Pass@123");
		 
		 //click on login
		 driver.findElement(By.xpath(".//button[@data-testid=\"royal_login_button\"]")).click();
	}

}
