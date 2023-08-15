package syncprgmpractice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ActiTimeChkBox {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.actitime.com/login.do");
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(5));
		WebElement chk=driver.findElement(By.id("keepLoggedInCheckBox"));
		 try 
		 {
		 wait.until(ExpectedConditions.elementToBeSelected(chk));//false
		 System.out.println("Checkbox is selected");
		 }
		 catch(TimeoutException e) 
		 {
			 System.out.println("Check box is not selected");
			 chk.click();
		 }
	}
}
