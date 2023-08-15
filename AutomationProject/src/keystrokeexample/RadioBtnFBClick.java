package keystrokeexample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RadioBtnFBClick {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.linkText("Create new account")).click();
		Thread.sleep(3000);
		WebElement femaleradionbtn = driver.findElement(By.xpath(".//input[@value='1']"));
		 femaleradionbtn.click();
		 Thread.sleep(8000);
		if (femaleradionbtn.isSelected()) {
			System.out.println("Radio Button for female option is selected");
		}
		else
		{
			System.out.println("Radio button for female option is not selected");
		}
		Thread.sleep(3000);
		driver.findElement(By.xpath(".//input[@value='2']")).click();
		if(femaleradionbtn.isSelected())
		{
			
			System.out.println("Radio button for female option is  selected");

		}
		else {
			System.out.println("Radio button for female option is deselected");
			System.out.println("Radio button for male option is  selected");
		}
		}

}
