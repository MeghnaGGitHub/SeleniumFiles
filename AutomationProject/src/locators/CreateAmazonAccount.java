package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateAmazonAccount {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		//driver.get("www.amazon.com");
		driver.get("https://www.amazon.com/ap/signin?openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.com%2F%3Fref_%3Dnav_ya_signin&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=usflex&openid.mode=checkid_setup&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0&");
		WebElement createAcc = driver.findElement(By.id("createAccountSubmit"));
		createAcc.click();

		WebElement cxName = driver.findElement(By.id("ap_customer_name"));
		cxName.sendKeys("Meghna Gupta");
		WebElement cxEmail = driver.findElement(By.id("ap_email"));
		cxEmail.sendKeys("cba.fed@yahoo.com");
		WebElement cxPwd=driver.findElement(By.id("ap_password"));
		cxPwd.sendKeys("Meghn@313");
		WebElement cxConPwd=driver.findElement(By.id("ap_password_check"));
		cxConPwd.sendKeys("Meghn@313");
		WebElement continueBtn = driver.findElement(By.id("continue"));
		continueBtn.click();
		WebElement solvePuzzle = driver.findElement(By.className("sc-bdnxRM bdpiRp sc-kEqXSa escriG"));
		solvePuzzle.click();
	}

}
