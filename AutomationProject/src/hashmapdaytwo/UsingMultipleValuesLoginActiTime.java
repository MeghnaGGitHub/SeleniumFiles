package hashmapdaytwo;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.HashMap;


import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class UsingMultipleValuesLoginActiTime 
{
	public static void main(String[] args) throws IOException 
	{
		//excel open
				Workbook wb = WorkbookFactory.create(new FileInputStream("../AutomationProject/Sample.xlsx"));
				Sheet tgt_sheet = wb.getSheet("Sheet4");
				
				int rowcount=tgt_sheet.getLastRowNum();
				
				HashMap<String, String>ref=new HashMap<>();
				
				String un=tgt_sheet.getRow(0).getCell(0).toString();
				String pwd= tgt_sheet.getRow(0).getCell(1).toString();
				
				for(int row=1;row<=rowcount;rowcount++)
				{
						String un1=tgt_sheet.getRow(row).getCell(0).toString();
						String pwd1 = tgt_sheet.getRow(row).getCell(1).toString();	
			
						ref.put(un,un1);
						ref.put(pwd, pwd1);
				}
				
				//selenium scripts
				WebDriverManager.firefoxdriver().setup();
				WebDriver driver=new FirefoxDriver();
				driver.get("https://demo.actitime.com/login.do");
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
				
				String username=ref.get(un);
				driver.findElement(By.id("username")).sendKeys(username);
				
				String password=ref.get(pwd);
				driver.findElement(By.name("pwd")).sendKeys(password);
				
				driver.findElement(By.id("loginButton")).click();		
	}
}
