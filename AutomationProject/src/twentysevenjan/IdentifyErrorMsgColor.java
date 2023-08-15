/* 
 WATS to verify if error msg is displayed in red color or not
 */
package twentysevenjan;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.Color;

import io.github.bonigarcia.wdm.WebDriverManager;

public class IdentifyErrorMsgColor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver = new FirefoxDriver();
		driver.get("https://demo.actitime.com/login.do");
		// identify login button loc
		driver.findElement(By.id("loginButton")).click();
		// identify un  loc
		WebElement errormsg = driver.findElement(By.xpath(".//span[contains(text(),'Username or Password is invalid. Please try again.')]"));
		// error msg volor code-->css property
		String errormsg_color = errormsg.getCssValue("color"); // copy color from css side
		// convert rgb to hex
		String error_hexformat = Color.fromString(errormsg_color).asHex();
		// take red color from css webpage
		String redcolor_format = "#ce0100";
		if (error_hexformat.equals(redcolor_format)) {
			System.out.println("Error msg is displayed in red color");
		} else {
			System.out.println("Error msg is not displayed in red color");
		}
	}
	


}
