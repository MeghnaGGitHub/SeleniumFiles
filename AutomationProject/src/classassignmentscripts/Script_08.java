package classassignmentscripts;

import org.openqa.selenium.firefox.FirefoxDriver;

public class Script_08 
{
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.gecko.driver","../AutomationProject/driver_exe_files/geckodriver.exe");
		FirefoxDriver fd=new FirefoxDriver();
		fd.get("http://www.facebook.com");
		fd.get("http://www.google.com");
		fd.get("http://www.amazon.com");
		fd.get("http://www.youtube.com");
		fd.get("http://www.flipkart.com");
		fd.get("http://www.snapdeal.com");
		fd.get("http://www.myntra.com");
		while(true)
		{
			String title=fd.getTitle();
			if (title.contains("YouTube")) 
			{
				break;
			}
			else
			{
				fd.navigate().back();
			}
		}
	
	}

}
