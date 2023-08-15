

/*
 WATSTEFA
 1.Open Browser
 2.Open Face-book
 3.Verify Login Page is displayed or not.
 */
package classassignmentscripts;

import org.openqa.selenium.firefox.FirefoxDriver;

public class Script_07 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver","../AutomationProject/driver_exe_files/geckodriver.exe");
		FirefoxDriver fd=new FirefoxDriver();
		fd.get("http://www.facebook.com");
		while(true)
		{
			String title=fd.getTitle();
		
			if (title.contains("Log In")) 
				{
				System.out.println("Title of Page is:"+title+"");
				break;
				}
			else 
				{
				System.out.println("Title of Page is:"+title+"");
				fd.close();
				
			}
		}
			
		
	}

}
