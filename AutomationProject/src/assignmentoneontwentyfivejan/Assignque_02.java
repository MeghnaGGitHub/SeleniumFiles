/* 
 WATS to perform folln actions:
 1.Open flipkart appln.
 2.Verify logo is created using image tag or not.
 3.Verify search field contains default text or not and print that text.
 4.Enter iphone 14  text in search field and print that text as output.
*/
package assignmentoneontwentyfivejan;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignque_02 {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("http://flipkart.com");
		driver.findElement(By.xpath(".//button[@class=\"_2KpZ6l _2doB4z\"]")).click();
		//verify tag logo
		
		String tagName=driver.findElement(By.xpath(".//*[@title='Flipkart']")).getTagName();
		if(tagName.equals("img"))
		{
			System.out.println("Flipkart Logo is created using IMG tag");
		}
		else
		{
			System.out.println("Logo is created using any other tag");
		}
		WebElement search_txt = driver.findElement(By.name("q"));
		String stxt = search_txt.getAttribute("placeholder");
		if (stxt!=null) { //we can use isEmpty() or length()>0
			System.out.println("Search field contains default text:"+stxt);
		}
		else
		{
			System.out.println("Search field has no default text in it!");
		}
		 search_txt.sendKeys("iphone 14");
		 System.out.println(search_txt.getAttribute("value"));
	}
		
	}
