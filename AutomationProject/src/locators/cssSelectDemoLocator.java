package locators;
import org.openqa.selenium.By;
//import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
public class cssSelectDemoLocator {
public static void main(String[] args) throws InterruptedException {
	WebDriverManager.firefoxdriver().setup();
	WebDriver driver=new FirefoxDriver();
	driver.get("file:///C:/Users/Meghna/Desktop/selenium/Demo2.html");
	driver.findElement(By.cssSelector("input[type='text']")).sendKeys("admin");
	Thread.sleep(3000);
	driver.findElement(By.cssSelector("input[type='password']")).sendKeys("manager");
	Thread.sleep(3000);
	driver.findElement(By.cssSelector("input[type='checkbox']")).click();
	Thread.sleep(3000);
	driver.findElement(By.cssSelector("input[value='Login']")).click();
	Thread.sleep(3000);
	//driver.close();
}
}
