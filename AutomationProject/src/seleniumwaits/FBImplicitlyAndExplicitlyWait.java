
/*
 * Write a test script to check if face-book forgot password page is displayed or not.
 * 
 */

package seleniumwaits;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import io.github.bonigarcia.wdm.WebDriverManager;
public class FBImplicitlyAndExplicitlyWait 
{
	public static void main(String[] args) 
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://facebook.com");
		driver.findElement(By.linkText("Forgotten password?")).click();
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		//verify expected page is displayed or not
		WebDriverWait w=new WebDriverWait(driver,Duration.ofSeconds(20));
		//w.pollingEvery(Duration.ofMillis(500));
		w.until(ExpectedConditions.titleContains("Forgot"));
		System.out.println("Forgot page is displayed");
	}
}
