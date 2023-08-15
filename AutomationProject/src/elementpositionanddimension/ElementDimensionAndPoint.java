package elementpositionanddimension;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ElementDimensionAndPoint {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver=new FirefoxDriver();
		driver.get("https://demo.actitime.com/login.do");
		
		//identify ele
		WebElement un = driver.findElement(By.id("username"));
		//username dimensions
		int un_height = un.getSize().getHeight();
		int un_width = un.getSize().getWidth();
		System.out.println("Username Height:"+un_height +" and Username Width:"+ un_width);
		//username position
		int un_xloc = un.getLocation().getX();
		int un_yloc=un.getLocation().getY();
		System.out.println("Username xloc:"+un_xloc+" and yloc:"+un_yloc);
	}

}
