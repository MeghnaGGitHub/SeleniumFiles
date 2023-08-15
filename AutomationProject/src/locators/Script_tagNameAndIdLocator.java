package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Script_tagNameAndIdLocator {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver=new FirefoxDriver();
		driver.get("file:///C:/Users/Meghna/Desktop/Htmlwebpage.html");
		//identify
		WebElement un = driver.findElement(By.tagName("input"));
		un.sendKeys("admin");
		WebElement pwd = driver.findElement(By.id("pass"));
		pwd.sendKeys("manager");
		WebElement chkbox = driver.findElement(By.id("chk"));
		chkbox.click();
		Thread.sleep(3000);
		driver.close();
	}

}
