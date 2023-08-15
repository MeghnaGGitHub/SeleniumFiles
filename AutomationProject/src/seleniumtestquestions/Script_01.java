/*
WATS to perform following actions:
1.Open FB application
2.Print URL of web-page
3.minimize window
4.Change size of page to (200,200)
5. Change position of page to(200,150)
 */

package seleniumtestquestions;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Script_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver=new FirefoxDriver();
		//1.Open FB application
		driver.get("https://www.facebook.com");
		//2.Print URL of web-page
		String url = driver.getCurrentUrl();
		System.out.println("Title of this web-page is:"+url);
		//3.minimize window
		driver.manage().window().minimize();
		//4.Change size of page to (200,200)
		driver.manage().window().setSize(new Dimension(200,200));
		//5. Change position of page to(200,150)
		driver.manage().window().setPosition(new Point(200,150));
	}

}
