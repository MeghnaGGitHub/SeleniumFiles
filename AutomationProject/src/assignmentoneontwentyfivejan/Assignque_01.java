/* 
 WATS to perform folln actions:
 1.Open fb appln.
 2.Click on Create new Account.
 3.Enter e-mail.
 4.Verify re-enter emailid field displayed or not.
 5.Remove email & verify re-enter 
*/
package assignmentoneontwentyfivejan;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assignque_01 {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		//open fb app
		driver.get("https://fb.com");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		//click on Create new Account
		driver.findElement(By.xpath(".//a[text()='Create new account']")).click();
		Thread.sleep(5000);
		WebElement enter_emailid = driver.findElement(By.xpath(".//input[@class='inputtext _58mg _5dba _2ph-' and @name='reg_email__']"));
		//Enter e-mail
		enter_emailid.sendKeys("abcdefghijklm@gmail.com");
		WebElement reenter_emailid = driver.findElement(By.xpath(".//input[@class='inputtext _58mg _5dba _2ph-' and @name='reg_email_confirmation__']"));
		boolean status = reenter_emailid.isDisplayed();
		//Verify re-enter emailid field displayed or not
		if (status) {
			System.out.println("Re-enter field is displayed!!!");
		} else {
			System.out.println("Re-enter field is not displayed!!!");
		}
		
		Thread.sleep(9000);
		//Remove email & verify re-enter 
		String email_value = enter_emailid.getAttribute("value");
		enter_emailid.clear();
		/*for (int i = 0; i < email_value.length()-(email_value.length()-3); i++) {
			Thread.sleep(2000);
			enter_emailid.sendKeys(Keys.BACK_SPACE);		}*/
		String email_value1 = enter_emailid.getAttribute("value");
		System.out.println(email_value);
		Thread.sleep(4000);
		Thread.sleep(4000);
		boolean status2 = reenter_emailid.isDisplayed();
		if (status2) {
			System.out.println("Re-enter field is displayed");
		}
		else {
			System.out.println("Re-enter field is no longer available!");
		}
	}
}
