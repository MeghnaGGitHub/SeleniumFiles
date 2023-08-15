package locpractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LocatorDemo1 {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver=new FirefoxDriver();
		driver.get("file:///C:/Users/Meghna/Desktop/LocatorDemo1.html");
		Thread.sleep(3000);
		driver.findElement(By.xpath(".//div[1]/input[2]")).sendKeys("Gupta");
		Thread.sleep(3000);
		driver.close();
	}

}
