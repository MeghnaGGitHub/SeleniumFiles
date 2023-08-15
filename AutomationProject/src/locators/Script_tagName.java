package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Script_tagName {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver=new FirefoxDriver();
		driver.get("file:///C:/Users/Meghna/Desktop/Htmlwebpage.html");
		Thread.sleep(3000);
		//identify the UN field
		WebElement un=driver.findElement(By.tagName("input"));
		// Right click->Inspect->Click on left most inspect option and click on element from web page.
		un.sendKeys("admin");//admin will be typed in UN textbox 
		Thread.sleep(3000);//admin will be cleared form textbox
		un.clear();
		driver.close();
		
	}

}
