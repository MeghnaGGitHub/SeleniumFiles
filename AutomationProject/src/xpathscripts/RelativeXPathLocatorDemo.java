package xpathscripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RelativeXPathLocatorDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/Meghna/selenium/Demo4.html");
		// FirstName & State
		driver.findElement(By.xpath(".//div[1]/input[1]"));
		// FirstName & State
		//driver.findElement(By.xpath(".//div[1]/input[1]|.//div[3]/input[1]"));
		//FirstName
		driver.findElement(By.xpath(""));
		
		//LastName
		driver.findElement(By.xpath(""));
		
		//E-mail
		driver.findElement(By.xpath(""));

		//Password
		driver.findElement(By.xpath(""));

		
		//Link1
		driver.findElement(By.xpath(".//div[2]/a[1]")).click();
		
	}

}

//		driver.findElement(By.xpath(""));
