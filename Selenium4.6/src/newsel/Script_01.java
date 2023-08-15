package newsel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.manager.SeleniumManager;

public class Script_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String path=SeleniumManager.getInstance().getDriverPath("chromedriver");
		System.out.println(path);
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com");
		System.out.println(driver.getTitle());
		driver.quit();
	}

}
