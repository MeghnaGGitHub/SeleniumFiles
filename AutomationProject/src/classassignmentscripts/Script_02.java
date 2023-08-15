/*
 WATSTEFCommands
 1.Open Browser
 2.Open Face-book
 3.Open Google
 5.Close Window
 */
package classassignmentscripts;

import org.openqa.selenium.firefox.FirefoxDriver;

public class Script_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "../AutomationProject/driver_exe_files/geckodriver.exe");
		FirefoxDriver fd=new FirefoxDriver();
		fd.get("http://www.facebook.com");
		fd.get("https://www.google.com");
		fd.close();
	}

}
