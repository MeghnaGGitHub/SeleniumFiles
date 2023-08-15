/* WATS TO PRINT ERROR MSG AS TEXT */
package assignmenttwotwentysixjan;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ErrorMsgPrintOnScreen {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.actitime.com/login.do");
		//identify login button loc
		driver.findElement(By.id("loginButton")).click();
		//
		WebElement errormsg = driver.findElement(By.xpath(".//input[contains(@id,'username')]"));
		String txt = errormsg.getText();
		System.out.println(txt);
		//error msg volor code-->css property
		String errormsg_color = errormsg.getCssValue("color"); //copy color from css side
		System.out.println(errormsg_color);
		//error msg font size->css property
		String errormsg_fontsize = errormsg.getCssValue("font-size");//copy color from css side
		System.out.println(errormsg_fontsize);	
	}
}
