package browserhandling;

import org.openqa.selenium.firefox.FirefoxDriver;

public class que_script02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.geckodriver", "../AutomationProject/driver_exe_files/geckodriver.exe");//connect browser
		FirefoxDriver fd=new FirefoxDriver();
		fd.get("https://www.facebook.com");
		fd.get("https://www.youtube.com");
		fd.get("https://www.google.com");
		FirefoxDriver fd1=new FirefoxDriver();
		fd1.get("https://www.google.com");

		fd.close();
		fd1.close();
	}

}
