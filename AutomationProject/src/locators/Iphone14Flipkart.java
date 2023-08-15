/*
 WATS to search for iphone 14 on flipkart
 */
/*
order-> id ,name,Class
*/
package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Iphone14Flipkart {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver=new FirefoxDriver();
		//open website
		driver.get("http://www.flipkart.com");
		Thread.sleep(3000);
		//enter iphone 14 in search field
		driver.findElement(By.id("_3704LK")).sendKeys("iphone 14");
		Thread.sleep(5000);
		//click on search button
		driver.findElement(By.className("L0Z3Pu")).click();
		
	}

}
