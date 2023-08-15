package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class linkTextAndpartialLinktext {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.firefoxdriver().setup();
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("https://www.facebook.com");
		Thread.sleep(3000);
		//driver.findElement(By.linkText("Forgotten password?")).click();
		driver.findElement(By.partialLinkText("Forgot")).click();
		driver.findElement(By.className("inputtext _9o1w")).sendKeys("meghnagupta313@gmail.com");
		//driver.findElement(By.id("did_submit")).click();
		//driver.quit();
	}

}
