package datadriventestingdayone;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WriteIntoSamplePropertyFileUsingFileOutputStream 
{
	public static void main(String[] args) throws IOException 
	{
		//make a copy of Sample File
		FileInputStream fin=new FileInputStream("../AutomationProject/Sample.properties");
		//open the file
		Properties p=new Properties();
		p.load(fin);
		//fetch data from file
		String str =p.getProperty("email");
		String strp =p.getProperty("password");
		p.setProperty("email","meghna" );
		FileOutputStream output=new FileOutputStream("../AutomationProject/Sample.properties");
		p.store(output, "testdata");
		
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.facebook.com");
		driver.findElement(By.id("email")).sendKeys("str");
		driver.findElement(By.id("pass")).sendKeys("strp");
		System.out.println("Email is: "+str);
		System.out.println("Password is: "+strp);
		driver.quit();

			
		
	}

}
