//WATS to login into Acti time application

package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class ActitimeApplLoginScript {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.actitime.com/login.do");
		driver.findElement(By.id("username")).sendKeys("admin");
		driver.findElement(By.id("pwd")).sendKeys("manager");
		driver.findElement(By.id("keepLoggedInCheckBox")).click();
		driver.findElement(By.id("loginButton")).click();
		
	}

}
