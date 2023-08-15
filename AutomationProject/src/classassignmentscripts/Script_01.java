
/*
 WATSTEFA(Write A Test Script To Execute Following Actions)
 1.Open Browser
 2.Open Face-book
 3.Open New Browser Window
 4.Open Google in that new Window
 5.Close both Window
 */

package classassignmentscripts;

import org.openqa.selenium.firefox.FirefoxDriver;

public class Script_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver","../AutomationProject/driver_exe_files/geckodriver.exe");
		FirefoxDriver fd=new FirefoxDriver();
		fd.get("https://www.facebook.com");
		FirefoxDriver fd1=new FirefoxDriver();
		fd1.get("http://www.google.com");
		fd1.close();
		fd.close();
		
	}

}
