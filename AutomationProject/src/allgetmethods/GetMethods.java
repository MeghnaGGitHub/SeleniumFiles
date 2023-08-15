package allgetmethods;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GetMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver=new FirefoxDriver();
		driver.get("https://demo.actitime.com/login.do");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		//identify element of which u want tagname,attribute and value
		WebElement target_ele = driver.findElement(By.id("keepLoggedInLabel"));
		
		String ele_tagname = target_ele.getTagName();
		System.out.println("Elemet tag name is:"+ ele_tagname);
		String ele_attribute_value = target_ele.getAttribute("style");
		System.out.println("Element attribute's value is:"+ele_attribute_value);
		String ele_Text = target_ele.getText();
		System.out.println("Elemet text is:"+ele_Text);
		
	}

}
