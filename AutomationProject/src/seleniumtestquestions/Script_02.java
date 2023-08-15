/*
 WATS to perform following actions:
 1.Open flip-kart in fire-fox
 2.Print title of web-page
 3.Open flip-kart in Chrome
 4.Print title of web-page
 5.Verify both titles of flip-kart is same or not.
 
 */
package seleniumtestquestions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Script_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.firefoxdriver().setup();
		WebDriver fdriver=new FirefoxDriver();
		// 1.Open flip-kart in fire-fox

		fdriver.get("https://www.flipkart.com");
		//2.Print title of web-page
		String ftitle = fdriver.getTitle();
		System.out.println("Title of Firefox's website page is:"+ftitle);
		//3.Open flip-kart in Chrome
		WebDriverManager.chromedriver().setup();

		WebDriver cdriver=new ChromeDriver();
		cdriver.get("https://www.flipkart.com");
		// 4.Print title of web-page
		String ctitle = cdriver.getTitle();
		System.out.println("Title of Chrome's website page is:"+ctitle);
		//5.Verify both titles of flip-kart is same or not.
		if (ctitle==ftitle) {
			System.out.println("Both webpages title match exactly !!");
		}
		else 
		{
			System.out.println("Both webpages title doesn't match!!!!");
			cdriver.close();
			fdriver.close();

		}

	}

}
