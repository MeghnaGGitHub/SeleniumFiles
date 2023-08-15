/*
 WATSTEFA
 1.Open Browser
 2.Open Google
 3.Open Face-book
 4.Navigate back to google
 5.Move forward to face-book
 6.Refresh the page.
 7.Close the browser.
 */
package classassignmentscripts;

import org.openqa.selenium.firefox.FirefoxDriver;

public class Script_03 
{
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "../AutomationProject/driver_exe_files/geckodriver.exe");
		FirefoxDriver fd=new FirefoxDriver();
		fd.get("https://www.google.com");
		fd.get("http://www.facebook.com");
		fd.navigate().back();
		fd.navigate().forward();
		fd.navigate().refresh();
		fd.close();
	}
}
