package browserhandling;

import org.openqa.selenium.firefox.FirefoxDriver;

public class script_01 {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "../AutomationProject/driver_exe_files/geckodriver.exe");//connect browser
		FirefoxDriver ev=new FirefoxDriver();//open browser
		ev.get("https://www.facebook.com");//open URL
		//FirefoxDriver ev1=new FirefoxDriver();
		ev.get("https://www.google.com");
		//ev1.close();
		ev.close();
	}

}
