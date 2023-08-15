package hashmapdaytwo;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
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

public class HandlingMultipleValuesFromExcelToHashMap {

	public static void main(String[] args) throws EncryptedDocumentException, FileNotFoundException, IOException 
	{
		
		//storing values from excel to hashmap
				Workbook wb=WorkbookFactory.create(new FileInputStream("../AutomationProject/Sample.xlsx"));
				Sheet s = wb.getSheet("Sheet6");
				int rowcount = s.getLastRowNum();
				ArrayList<String> key=new ArrayList<String>();//Creating arraylist    
			      key.add("Key");//Adding object in arraylist 
			      key.add("Name");    
			      key.add("Email");    
			      key.add("Password");    
			      key.add("State");    
			      key.add("Country");
			      System.out.println(key);
				ArrayList<String> user01=new ArrayList<String>();//Creating arraylist    
			      key.add("Anvesh");//Adding object in arraylist    
			      user01.add("Anvesh@gmail.com");    
			      user01.add("Anvesh123");    
			      user01.add("AP");
			      user01.add("India");
			      System.out.println(user01);	
			      ArrayList<String> user02=new ArrayList<String>();//Creating arraylist    
			      user02.add("Raghu");//Adding object in arraylist    
			      user02.add("Raghu@gmail.com");    
			      user02.add("Raghu123");    
			      user02.add("NewYork");
			      user02.add("USA");
			      System.out.println(user02);
			      
			      //Store direct values from excel to hashmap string.
			      
			  /*    HashMap<String, ArrayList> ref=new HashMap<>();
				for(int rownum=0;rownum<=rowcount;rownum++) 
				{
					Row r = s.getRow(rownum);
					short cellcount = r.getLastCellNum();
					for(int cellnum=0;cellnum<cellcount;cellnum++) 
					{
						String var_key = r.getCell(cellnum).toString();
						String var_value1 = s.getRow(rownum).getCell(cellnum).toString();
						String var_value2 = s.getRow(rownum).getCell(cellnum+1).toString();
					}	
				}
				sel script
				WebDriverManager.firefoxdriver().setup();
				WebDriver driver=new FirefoxDriver();
				driver.get("https://demo.actitime.com/login.do");
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
				
				String un=ref.get("username");
				driver.findElement(By.id("username")).sendKeys(un);
				
				String pswd=ref.get("password");
				driver.findElement(By.name("pwd")).sendKeys(pswd);
				*/
	}
}
