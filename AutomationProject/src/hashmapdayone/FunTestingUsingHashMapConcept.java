package hashmapdayone;

import java.util.HashMap;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FunTestingUsingHashMapConcept 
{
	public static void main(String[] args) 
	{
		//Hashmap concept
		HashMap<String, String> ref=new HashMap<>();
		ref.put("username", "admin");
		ref.put("password", "manager");
	
		//selenium script
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver=new FirefoxDriver();
		driver.get("https://demo.actitime.com/login.do");
		//fetch username from Hashmap
		String un = ref.get("username");
		
		driver.findElement(By.id("username")).sendKeys(un);
		//fetch password from Hashmap
		String pswrd = ref.get("password");
		driver.findElement(By.name("pwd")).sendKeys(pswrd);
		driver.findElement(By.id("loginButton")).click();
		driver.close();	
	}
}


