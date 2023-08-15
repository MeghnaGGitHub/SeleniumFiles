package practicescripts;

import org.openqa.selenium.firefox.FirefoxDriver;

public class script2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.geckodriver","../AutomationProject/Library/geckodriver.exe");
		FirefoxDriver fd=new FirefoxDriver();
		fd.get("https://www.google.com");
		fd.close();
		FirefoxDriver fd1=new FirefoxDriver();
		fd1.get("https://www.facebook.com");
		fd1.close();
	}

}
