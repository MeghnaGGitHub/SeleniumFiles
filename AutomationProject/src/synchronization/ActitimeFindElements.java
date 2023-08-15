package synchronization;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import io.github.bonigarcia.wdm.WebDriverManager;
public class ActitimeFindElements 
{
	public static void main(String[] args) 
	{		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.actitime.com/login.do");
		//verify username field is displayed or not
		/*WebElement un=driver.findElement(By.id("username"));
		boolean value = un.isDisplayed();
		if (value) {
		syso("chk box is displayed");}
		else{
		syso("chk box is not displayed");
		}*/
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(5));
		WebElement un=driver.findElement(By.id("username"));
		wait.until(ExpectedConditions.visibilityOf(un));
		un.sendKeys("admin");
		//verify pwd field displayed or not
		 WebElement pwd=driver.findElement(By.name("pwd"));
		 wait.until(ExpectedConditions.visibilityOf(pwd));
		 pwd.sendKeys("manager");
		 //verify if checkbox is selected or not
		 WebElement chk=driver.findElement(By.id("keepLoogedInCheckBox"));
		 try {
		 wait.until(ExpectedConditions.elementToBeSelected(chk));//false
		 System.out.println("Checkbox is selected");
		 }
		 catch(TimeoutException e) {
			 System.out.println("Check box is not selected");
			 chk.click();
		 }
		 //verify login button click-able or not
		WebElement button=driver.findElement(By.id("loginButton"));
		wait.until(ExpectedConditions.elementToBeClickable(button));
		button.click();	  
	}
}
