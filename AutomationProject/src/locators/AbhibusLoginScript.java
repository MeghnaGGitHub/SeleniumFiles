/*WATS to perform following actions:
1.Open abhi-bus application web-site
2.Click on login option
3.Enter mobile number,select Get free ride check-box
4.Enter referral code and click on get OTP
	*/

package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AbhibusLoginScript {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.abhibus.com/");
		Thread.sleep(1000);
		driver.findElement(By.id("AccLogin")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("mobileNo")).sendKeys("7768909528");
		Thread.sleep(5000);
		driver.findElement(By.id("chk_refer_code")).click();
		Thread.sleep(5000);
		driver.findElement(By.id("referral_code")).sendKeys("ABHIPKT2");
		Thread.sleep(5000);
		driver.findElement(By.id("getotp")).click();
	}

}
