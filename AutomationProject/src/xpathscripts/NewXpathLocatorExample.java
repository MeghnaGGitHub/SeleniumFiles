package xpathscripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class NewXpathLocatorExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver=new FirefoxDriver();
		driver.get("file:///H:/1CSA5workspace/AutomationProject/html%20files/Xpath-2.html");
		//locator absoulte x-path
		driver.findElement(By.xpath("./html/body/table/tbody/tr[5]/td[2]"));
		//locator using relative x-path
		driver.findElement(By.xpath(".//tr[5]/td[2]"));
		//all rows using absolute x-path
		driver.findElement(By.xpath("./html/body/table/tbody/tr"));
		//all rows using relative x-path
		driver.findElement(By.xpath(".//tr"));
		//all subjects using absolute x-path
		driver.findElement(By.xpath("./html/body/table/tbody/tr/td[2]"));
		//all subjects using relative x-path
		driver.findElement(By.xpath(".//td[2]"));
		//3rd row 2nd cell-> SQL using absolute x-path
		driver.findElement(By.xpath("./html/body/table/tbody/tr[3]/td[2]"));
		//3rd row 2nd cell-> SQL using relative x-path
		driver.findElement(By.xpath(".//tr[3]/td[2]"));
		//manual subject using absolute x-path
		driver.findElement(By.xpath("./html/body/table/tbody/tr[2]/td[2]"));//-->manual subject
		//java cost using absoulte x-path
		driver.findElement(By.xpath("./html/body/table/tbody/tr[4]/td[3]"));//-->java  cost
		//manual subject and Java cost using absolute x-path
		driver.findElement(By.xpath("./html/body/table/tbody/tr[2]/td[2]|./htm/body/table/tbody/tr[4]/td[3]"));//-->manual subject+java cost
		//manual subject and Java cost using relative x-path
		driver.findElement(By.xpath(".//tr[2]/td[2]|.//tr[4]/td[3]"));


	}

}
