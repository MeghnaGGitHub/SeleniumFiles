package practicebrowserhandlingscripts;

import org.openqa.selenium.firefox.FirefoxDriver;

public class Script_001 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "../AutomationProject/driver_exe_files/geckodriver.exe");
		FirefoxDriver fd=new FirefoxDriver();
		fd.get("https://www.google.com");
		int x_loc=fd.manage().window().getPosition().getX();
		System.out.println("Browsers X co-ordinate is: "+x_loc+"");
		int y_loc=fd.manage().window().getPosition().getY();
		System.out.println("Browsers Y co-ordinate is: "+y_loc+"");
		Thread.sleep(5000);
		
		int b_height=fd.manage().window().getSize().getHeight();
		System.out.println("Browsers Height is: "+b_height+"");
		int b_width=fd.manage().window().getSize().getWidth();
		System.out.println("Browsers Width is: "+b_width+"");
		Thread.sleep(9000);
		
		fd.close();
		

	}

}
