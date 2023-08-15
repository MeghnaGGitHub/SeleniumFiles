package practicescripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FBMaleFemale {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("http://facebook.com");
		driver.findElement(By.linkText("Create new account")).click();
		Thread.sleep(7000);
		WebElement femaleRadio = driver.findElement(By.xpath(".//input[@name='sex' and @value='1']"));
		WebElement maleRadio = driver.findElement(By.xpath(".//input[@name='sex' and @value='2']"));
		byte printedWhat=0; //Male - 1, Female-2
		while(true)
		{
			if(femaleRadio.isSelected()&&printedWhat!=2)
			{
				System.out.println("Female radio is now selected");
				printedWhat=2;

			}
			if(maleRadio.isSelected()&&printedWhat!=1)
			{
				System.out.println("Male radio is now selected");
				printedWhat=1;
			}
		}
	}

}

