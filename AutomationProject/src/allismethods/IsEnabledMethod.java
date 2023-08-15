package allismethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class IsEnabledMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver=new FirefoxDriver();
		driver.get("file:///H:/1CSA5workspace/AutomationProject/html%20files/isEnabledExampleWebPage.html");
		//identify un field
		WebElement un = driver.findElement(By.xpath(".//input[@type='text']"));
		//identify un field is enabled or not
		boolean status = un.isEnabled();
		if (status) {
			System.out.println("Username field is enabled");
		}
		else
		{
			System.out.println("Username field is disabled");

		}
	}

}
