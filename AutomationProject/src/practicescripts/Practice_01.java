package practicescripts;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver.Options;
import org.openqa.selenium.WebDriver.Window;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class Practice_01 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "../AutomationProject/driver_exe_files/geckodriver.exe");

			FirefoxDriver f =new FirefoxDriver();
			Thread.sleep(3000);
			f.get("http://www.google.com");
			Thread.sleep(3000);
			FirefoxDriver f1 =new FirefoxDriver();
			Thread.sleep(3000);
			f1.get("http://www.magicbricks.com");
			Thread.sleep(3000);
			System.setProperty("webdriver.chrome.driver", "../AutomationProject/driver_exe_files/chromedriver.exe");
				ChromeDriver c = new ChromeDriver();
				Thread.sleep(3000);
				c.get("http://www.facebook.com");
			f.close();
				//c.close();
			f1.close();

/*f.get("http://www.google.com");
Thread.sleep(3000);
f.navigate().to("http://www.facebook.com");
Thread.sleep(3000);
f.navigate().back();
//Thread.sleep(3000);
f.navigate().refresh();
Thread.sleep(3000);
f.navigate().forward();

f.navigate().refresh();

Options o = f.manage();
Window w = o.window();
Dimension d =new Dimension(300,500);
w.setSize(d);//f.manage().window().setSize(new Dimension(300,500));
Thread.sleep(3000);
Point p= new Point(300,400);
w.setPosition(p);//f.manage().window().setPosition(new Point(300,400);
Thread.sleep(3000);
f.manage().window().fullscreen();
Thread.sleep(3000);
f.manage().window().minimize();
Thread.sleep(3000);
f.manage().window().maximize();
Thread.sleep(3000);
*/
f.close();
		
		
	}

}
