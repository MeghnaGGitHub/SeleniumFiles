package browserhandling;

import org.openqa.selenium.firefox.FirefoxDriver;

public class script_02 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "../AutomationProject/Library/geckodriver.exe");//connect browser
		FirefoxDriver fd=new FirefoxDriver();//open browser
		fd.navigate().to("https://www.google.com");
		Thread.sleep(4000);
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
