// WATS to perform functional testing on login page by fetching data from excel.
package excelsheetdaythree;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import io.github.bonigarcia.wdm.WebDriverManager;
public class FunctionalTestingUsingExcel 
{
	public static void main(String[] args) throws InterruptedException, FileNotFoundException, IOException 
	{
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver=new FirefoxDriver();
		driver.get("https://demo.actitime.com/login.do");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		// excel data
		Workbook wb=WorkbookFactory.create(new FileInputStream("../AutomationProject/Sample.xlsx"));
		//fetch sheet
		Sheet tgt_sheet = wb.getSheet("Sheet2");
		int rowcount = tgt_sheet.getLastRowNum();
		for (int rownum = 1; rownum <=rowcount; rownum++) {
			Row tgt_row = tgt_sheet.getRow(rownum);
			String un = tgt_row.getCell(0).toString();
			String pwd=tgt_row.getCell(1).toString();
			driver.findElement(By.id("username")).sendKeys(un);
			Thread.sleep(3000);
			driver.findElement(By.name("pwd")).sendKeys(pwd);
			driver.findElement(By.id("loginButton")).click();
			try {
				WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(30));
				wait.until(ExpectedConditions.titleContains("Time-Track"));
				tgt_row.createCell(2).setCellValue("Home Page is displayed");
				tgt_row.createCell(1).setCellValue("Pass");
			}
			catch (TimeoutException e) {
				tgt_row.createCell(2).setCellValue("Unable to login");
				tgt_row.createCell(1).setCellValue("Pass");
			}
		}
		wb.write(new FileOutputStream("../AutomationProject/Sample.xlsx"));
	}
}
