/*
 WATSTPFA:
 1.Open google
 2.Print size & position of page
 3.Print URL of page
 4.Open Face-book
 5.Open Flip-kart
 6.Open myntra
 7.Refresh page
 8.Go back until google page is displayed.
 */

package seleniumtestquestions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Script_03 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver=new FirefoxDriver();
		//1.Open google
		driver.get("https://www.google.com");
		//2.Print size & position of page
		int hbrowser = driver.manage().window().getSize().getHeight();
		int wbrowser = driver.manage().window().getSize().getWidth();
		System.out.println("Browser's height is: "+hbrowser);
		System.out.println("Browser's width is: "+wbrowser);

		int xbrowser = driver.manage().window().getPosition().getX();
		int ybrowser=driver.manage().window().getPosition().getY();
		System.out.println("Browser's X co-ordinate is: "+xbrowser);
		System.out.println("Browser's height is: "+ybrowser);
		
		//3.Print URL of page
		String url=driver.getCurrentUrl();
		System.out.println("URL of the page is:"+url);
		
		// 4.Open Face-book
		driver.get("https://www.facebook.com");
		Thread.sleep(3000);
		// 5.Open Flip-kart
		driver.get("https://www.amazon.com");
		Thread.sleep(3000);

		//6.Open myntra
		driver.get("https://www.myntra.com");

		// 7.Refresh page
		driver.navigate().refresh();

		// 8.Go back until google page is displayed.
		while(true) 
		{
			if (driver.getTitle().contains("Google")) {
				break;
			}
			else {
				driver.navigate().back();
			}
		}
	}

}
