 package classassignmentscripts;

import org.openqa.selenium.WebDriver.Navigation;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Script_04 {

	public static void main(String[] args)throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "../AutomationProject/driver_exe_files/geckodriver.exe");
		FirefoxDriver fd=new FirefoxDriver();
		//fd.get("https://www.google.com");
		Navigation  nvg=fd.navigate();
		nvg.to("http://www.google.com");
		//fd.navigate().to("http://www.google.com");
		Thread.sleep(3000);
		nvg.to("http://www.facebook.com");
		//fd.navigate().to("http://www.facebook.com");
		fd.get("https://www.facebook.com");
		fd.navigate().back();
		Thread.sleep(4000);
		fd.navigate().forward();
		Thread.sleep(4000);
		fd.navigate().refresh();
		Thread.sleep(4000);
		fd.close();

	}

}
