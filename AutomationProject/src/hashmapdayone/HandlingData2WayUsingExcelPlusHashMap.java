//WATS to login to ActiTime Application by storing data in excel and fetching data by using hashmap
package hashmapdayone;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.HashMap;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandlingData2WayUsingExcelPlusHashMap {

	public static void main(String[] args) throws EncryptedDocumentException, FileNotFoundException, IOException 
	{
		//excel open
		Workbook wb = WorkbookFactory.create(new FileInputStream("../AutomationProject/Sample.xlsx"));
		Sheet tgt_sheet = wb.getSheet("Sheet4");
		String un = tgt_sheet.getRow(0).getCell(0).toString();
		String un1 = tgt_sheet.getRow(1).getCell(0).toString();
		String pwd = tgt_sheet.getRow(0).getCell(1).toString();
		String pwd1 = tgt_sheet.getRow(1).getCell(1).toString();
		
		//hashmap
		HashMap<String, String>ref=new HashMap<>();
		ref.put(un,un1);
		ref.put(pwd, pwd1);
		
		//selenium scripts
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver=new FirefoxDriver();
		driver.get("https://demo.actitime.com/login.do");
		
		String username=ref.get(un);
		driver.findElement(By.id("username")).sendKeys(username);
		
		String password=ref.get(pwd);
		driver.findElement(By.name("pwd")).sendKeys(password);
		
		driver.findElement(By.id("loginButton")).click();

	}

}
