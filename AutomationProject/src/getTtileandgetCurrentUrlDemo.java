import org.openqa.selenium.firefox.FirefoxDriver;

public class getTtileandgetCurrentUrlDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver","../AutomationProject/driver_exe_files/geckodriver.exe");
		FirefoxDriver fd=new FirefoxDriver();
		fd.get("http://www.google.com");
		String displayed_pagetitle=fd.getTitle();
		String expected_pagetitle="Google";
		if(displayed_pagetitle.equals(expected_pagetitle)) 
		{
			System.out.println("Google Page is displayed");
		}
		else
		{
			System.out.println("Google Page is not displayed");
		}
		//get browser size
		int browser_height=fd.manage().window().getSize().getHeight();
		System.out.println("Browsers height"+browser_height);
		int browser_width=fd.manage().window().getSize().getWidth();
		System.out.println("Browsers width"+browser_width);
		//get browser position
		int browser_xloc=fd.manage().window().getPosition().getX();
		System.out.println("Browsers X co-ordinate location"+browser_xloc);
		int browser_yloc=fd.manage().window().getPosition().getY();
		System.out.println("Browsers Y co-ordinate location"+browser_yloc);
		
		//set browser size
		
		fd.close();
	}
	

}
