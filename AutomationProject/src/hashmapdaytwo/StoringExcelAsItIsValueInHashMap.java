//Storing excel data in hashmap in sheet 2 excel format
package hashmapdaytwo;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.HashMap;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class StoringExcelAsItIsValueInHashMap {

	public static void main(String[] args) throws EncryptedDocumentException, FileNotFoundException, IOException {
		//storing values from excel to hashmap
				Workbook wb=WorkbookFactory.create(new FileInputStream("../AutomationProject/Sample.xlsx"));
				Sheet s = wb.getSheet("Sheet1");
				int rowcount = s.getLastRowNum();
				HashMap<String, String> ref=new HashMap<>();
				for(int rownum=0;rownum<=rowcount;rownum++) 
				{
					Row r=s.getRow(rownum);
					String var_name = r.getCell(0).toString();
					String var_value = r.getCell(1).toString();
					ref.put(var_name, var_value);
					
				}
				//sel script
				WebDriverManager.firefoxdriver().setup();
				WebDriver driver=new FirefoxDriver();
				driver.get("https://demo.actitime.com/login.do");
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
				
				String un=ref.get("username");
				driver.findElement(By.id("username")).sendKeys(un);
				
				String pswd=ref.get("password");
				driver.findElement(By.name("pwd")).sendKeys(pswd);	
			}
	}
