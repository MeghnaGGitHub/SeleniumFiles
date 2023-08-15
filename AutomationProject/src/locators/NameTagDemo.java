package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class NameTagDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver=new FirefoxDriver();
		driver.get("http://www.google.com");
		//Approach 01-->multiple actions on same element
		WebElement rv = driver.findElement(By.name("q"));
		//enter selenium text
		rv.sendKeys("Selenium");
		//remove text
		rv.clear();
		//enter new text
		rv.sendKeys("WebDriver");
		//Approach 02-->single action on  element
		//driver.findElement(By.name("q")).sendKeys("Selenium");
		
	}

}
