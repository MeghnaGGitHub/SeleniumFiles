package sdetprgmspractice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropdownDemo {
public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.opencart.com/index.php");
	//identify register btn locator
	 WebElement register_btn = driver.findElement(By.xpath(".//a[2][text()='Register']"));
	 //click on it
	 register_btn.click();
	 //verify country dropdown locator
	 WebElement drpdwn_country_element = driver.findElement(By.xpath(".//select[@id='input-country']"));
	 //select a country by passing name and for that create obj of Select class as select tag is used in html
	 Select drpdwn_country=new Select(drpdwn_country_element);
	 //drpdwn_country.selectByVisibleText("Denmark");
	//drpdwn_country.selectByIndex(4);//American Samoa
	//drpdwn_country.selectByValue("15");//Ajerbaijan
	 
	 //selecting options from dropdown without using select methods
	 
	 List<WebElement> all_options = drpdwn_country.getOptions();
	 for (WebElement option : all_options) {
		if (option.getText().equals("Cuba")) {
			option.click();
			break;
		}
	}
}
}
