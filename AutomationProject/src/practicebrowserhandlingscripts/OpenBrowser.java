package practicebrowserhandlingscripts;

import org.openqa.selenium.firefox.FirefoxDriver;

public class OpenBrowser {

	public static void main(String[] args)throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "../AutomationProject/driver_exe_files/geckodriver.exe");
		FirefoxDriver fd=new FirefoxDriver();
		FirefoxDriver fd1=new FirefoxDriver();
		fd.get("http://www.google.com");
		Thread.sleep(3000);
		fd1.get("https://www.facebook.com");
		Thread.sleep(3000);
		//fd.close();
		//fd1.close();
	}

}
