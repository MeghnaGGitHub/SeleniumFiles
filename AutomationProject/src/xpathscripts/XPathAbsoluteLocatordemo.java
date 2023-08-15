/*
 AbsoluteXPathLocator
 */

package xpathscripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class XPathAbsoluteLocatordemo 
{
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver=new FirefoxDriver();
		driver.get("file:///H:/1CSA5workspace/AutomationProject/html%20files/xpathhtmlfile.html");
		driver.findElement(By.xpath("./html/body/div[1]/input[1]")).sendKeys("Meghna");
		driver.findElement(By.xpath("./html/body/div[1]/input[2]")).sendKeys("Dinesh");
		driver.findElement(By.xpath("./html/body/div[1]/input[3]")).sendKeys("Gupta");
		driver.findElement(By.xpath("./html/body/div[1]/input[4]")).sendKeys("meghnagupta313@gmail.com");

		driver.findElement(By.xpath("./html/body/div[2]/input[5]")).sendKeys("Meghn@313");
		driver.findElement(By.xpath("./html/body/div[2]/a[1]")).click();
		driver.findElement(By.xpath("./html/body/div[2]/a[1]")).sendKeys("India");

		driver.findElement(By.xpath("./html/body/div[3]/a[1]")).click();
		driver.findElement(By.xpath("./html/body/div[3]/a[2]")).click();
		driver.findElement(By.xpath("./html/body/div[3]/input[1]")).sendKeys("Maharashtra");

		driver.findElement(By.xpath("./html/body/div[4]/a[1]")).click();
		driver.findElement(By.xpath("./html/body/div[4]/a[2]")).click();
		driver.findElement(By.xpath("./html/body/div[4]/a[3]")).click();

	}

}
