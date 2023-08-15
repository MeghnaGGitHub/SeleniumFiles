package keystrokeexample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class IsSelectedMethodDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.actitime.com/login.do");
		//identify checkbox
		WebElement chk = driver.findElement(By.id("keepLoggedInCheckBox"));
		//verify checkbox is selected or not
		boolean status=chk.isSelected();
		if(status) {
			System.out.println("Checkbox is selected");
		}
		else {
			System.out.println("Checkbox is not selected");
			chk.click();
			System.out.println("Checkbox is now selected !!!!!");
		}
	}

}
