package browserhandling;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.firefox.FirefoxDriver;

public class script_03 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "../AutomationProject/Library/geckodriver.exe");
		FirefoxDriver fd=new FirefoxDriver();
		fd.navigate().to("https://www.facebook.com");
		Thread.sleep(4000);
		Dimension d=new Dimension(300, 500);
		fd.manage().window().setSize(d);
		Thread.sleep(4000);
		//Point p=new Point();
		fd.manage().window().setPosition(new Point(300, 400));
		Thread.sleep(4000);
		fd.manage().window().fullscreen();
		Thread.sleep(4000);
		fd.manage().window().maximize();
		Thread.sleep(4000);
		fd.manage().window().minimize();
		Thread.sleep(4000);
		fd.close();
	}

}
