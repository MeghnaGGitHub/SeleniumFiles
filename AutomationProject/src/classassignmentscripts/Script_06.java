/*
 WATSTEFA
 1.Open Browser
 2.Open Application(any)
 3.Change the size of browser to half of the displayed size.
 4.Change the position of browser to double value of actual displayed position.
 */

package classassignmentscripts;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Script_06 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver","../AutomationProject/driver_exe_files/geckodriver.exe");
		FirefoxDriver fd=new FirefoxDriver();
		fd.get("https://www.google.com");
		int browser_height=fd.manage().window().getSize().getHeight();
		int browser_width=fd.manage().window().getSize().getWidth();
		System.out.println("Height of Browser before changing:"+browser_height+"");
		System.out.println("Width of Browser before changing:"+browser_width+"");

		int changed_height=browser_height/2;
		int changed_width=browser_width/2;
		fd.manage().window().setSize(new Dimension(changed_height,changed_width));
		System.out.println("Height of Browser after changing:"+changed_height+"");
		System.out.println("Width of Browser after changing:"+changed_width+"");

		Thread.sleep(9000);
		
		int browser_xloc=fd.manage().window().getPosition().getX();
		int browser_yloc=fd.manage().window().getPosition().getY();
		System.out.println("X co-ordinate  of Browser before changing:"+browser_xloc+"");
		System.out.println(" Y co-ordinate of Browser before changing:"+browser_yloc+"");

		int changed_xloc=browser_xloc*2;
		int changed_yloc=browser_yloc*2;
		
		fd.manage().window().setPosition(new Point(changed_xloc,changed_yloc));
		System.out.println("X co-ordinate of Browser before changing:"+changed_xloc+"");
		System.out.println("Y co-ordinate of Browser before changing:"+changed_yloc+"");

		Thread.sleep(4000);
		fd.close();
	}
}
