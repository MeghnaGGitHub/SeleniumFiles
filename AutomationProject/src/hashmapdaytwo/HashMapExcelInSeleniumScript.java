//WATS for storing excel data in hashmap in sheet 1 excel format
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
public class HashMapExcelInSeleniumScript 
{
	public static void main(String[] args) throws EncryptedDocumentException, FileNotFoundException, IOException 
	{
		//storing values from excel to hashmap
		Workbook wb=WorkbookFactory.create(new FileInputStream("../AutomationProject/Sample.xlsx"));
		Sheet s = wb.getSheet("Sheet1");
		int rowcount = s.getLastRowNum();
		HashMap<String, String> ref=new HashMap<>();
		for(int rownum=0;rownum<=rowcount;rownum++) 
		{
			Row r=s.getRow(rownum);
			short cellcount = r.getLastCellNum();
			for(int cellnum=0;cellnum<cellcount;cellnum++) 
			{
				if(rownum==cellnum) 
				{
					String var_name = r.getCell(cellnum).toString();
					String var_value = s.getRow(rownum+1).getCell(cellnum).toString();
					ref.put(var_name, var_value);
				}
				else if (rownum>cellnum) 
				{
				String var_name = s.getRow(rownum-1).getCell(cellnum+1).toString();
				String var_value = s.getRow(rownum-1).getCell(cellnum+1).toString();
				ref.put(var_name, var_value);
				break;
				}
			}
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