package practicescripts;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class script1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.geckodriver", "../AutomationProject/driver_exe_files/chromedriver.exe");//open browser
		FirefoxDriver fd=new FirefoxDriver();
		fd.get("https://www.facebook.com");
		System.setProperty("webdriver.chromedriver", "../AutomationProject/driver_exe_files/chromedriver.exe");
		ChromeDriver cd=new ChromeDriver();
		cd.get("https://www.google.com");
		cd.close();
		//fd1.get("https://www.google.com");
		//fd1.close();
		fd.close();
	}
}