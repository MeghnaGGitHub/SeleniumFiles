import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class UsernameAndPwdFBField {
	public static void main(String[] args) {

		WebDriver driver=new FirefoxDriver();
		driver.get("https://fb.com/");
		driver.findElement(By.linkText("Create new account"));
		WebElement fbtn = driver.findElement(By.xpath(".//input[@value='1']"));
		if (fbtn.isSelected()) {
			System.out.println("Female btn is selected!!!");
		}
		else
		{
			System.out.println("Selecting female btn is getting selected");
			fbtn.click();
		}
		}
	}
