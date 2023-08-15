package classroomscripts;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

class SelectBrowser
{
	static WebDriver driver;
	
	public static void openBrowser(String browsername) 
	{
		if(browsername.equals("Firefox")) 
		{
			System.setProperty("webdriver.gecko.driver", "../AutomationProject/driver_exe_files/geckodriver.exe");
			driver=new FirefoxDriver();
		}
		else if(browsername.equals("Chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "../AutomationProject/driver_exe_files/chromedriver.exe");
			driver=new ChromeDriver();
		}
		else 
		{
			//System.setProperty("webdriver.edge.driver", "..")
			driver=new EdgeDriver();
		}
	}
}
public class SameScriptInMultipleBrowser extends SelectBrowser
{
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		SameScriptInMultipleBrowser.openBrowser("Firefox");//open browser
		driver.get("https://www.google.com");//open application
		String title=driver.getTitle();//use title method
		System.out.println(title);//print title on console
		driver.close();//close browser
	}
}
