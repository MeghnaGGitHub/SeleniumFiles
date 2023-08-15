package browserhandling;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.firefox.FirefoxDriver;

public class que_Script03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.geckodriver", "../AutomationProject/driver_exe_files/geckodriver.exe");//connect browser
		FirefoxDriver fd=new FirefoxDriver();
		fd.get("https://www.youtube.com");
		fd.manage().window().maximize();
		int h=fd.manage().window().getSize().getHeight();
		int w=fd.manage().window().getSize().getWidth();
		//int h1=h/2;
		//int w1=w/2;
		fd.manage().window().setSize(new Dimension(w/2, h/2));
		
		int x=fd.manage().window().getPosition().getX();
		int y=fd.manage().window().getPosition().getY();
	//	int x1=x*2;
		//int y1=y*2;
		fd.manage().window().setPosition(new Point(x*2,y*2));
		/*title
		String title=fd.getTitle();
		System.out.println(title);
		//url
		String url=fd.getCurrentUrl();
		System.out.println(url);*/
		/*String title1=fd.getTitle();
		if(title1.contains("log in")) {
			System.out.println("Login page displayed");
		}
		else {
			System.out.println("Login Page is not displayed");
		}
		*/
		
	}

}
