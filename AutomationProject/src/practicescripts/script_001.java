package practicescripts;

import org.openqa.selenium.firefox.FirefoxDriver;

public class script_001 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "../AutomationProject/driver_exe_files/geckodriver.exe");//connect MFF
		FirefoxDriver fd=new FirefoxDriver();//MFF will open
		fd.get("https://www.facebook.com");
		fd.close();
	}

}
;