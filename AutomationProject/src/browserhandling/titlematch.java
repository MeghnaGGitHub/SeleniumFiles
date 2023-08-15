package browserhandling;

import org.openqa.selenium.firefox.FirefoxDriver;

public class titlematch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.setProperty("webdriver.geckodriver", "../AutomationProject/driver_exe_files/geckodriver.exe");
FirefoxDriver fd=new FirefoxDriver();
fd.get("https://www.facebook.com");
fd.get("https://google.com");
fd.get("https://www.youtube.com");
fd.get("https://www.amazon.in");
//fd.get("https://www.sanpdeal.com");
fd.get("http://myntra.in");
//String title=fd.getTitle();
while(true){
	String title=fd.getTitle();
	if(title.contains("YouTube")) {
		break;
	}
	else {
		fd.navigate().back();
	}
}
	}

}
