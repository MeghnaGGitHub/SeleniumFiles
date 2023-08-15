package datadriventestingdayone;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
public class FBDataThroughSamplePropertyFileInputStreamDemo 
{
	public static void main(String[] args) throws IOException 
	{
		//create a copy from ROM -RAM
		FileInputStream f=new FileInputStream("../AutomationProject/Sample.properties");
		//Open Sample file from Properties class using load(non-static method)
		Properties p=new Properties();
		p.load(f);
		//fetch email
		String str =p.getProperty("email");
		//fetch password
		String str2=p.getProperty("password");
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.facebook.com");
		//enter email
		driver.findElement(By.id("email")).sendKeys("str");
		//enter password
		driver.findElement(By.id("pass")).sendKeys("str2");
	}
}
