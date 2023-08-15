//WATS to login in actitimeapp by fetching data from excel
package excelsheetdaythree;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ActiTimePlusExcel 
{
	public static void main(String[] args) throws IOException 
	{
	WebDriverManager.firefoxdriver().setup();
	WebDriver driver=new FirefoxDriver();
	driver.get("https://demo.actitime.com/login.do");
	//fetch data from excel
	Workbook wb=WorkbookFactory.create(new FileInputStream("../AutomationProject/Sample.xlsx"));
	Row tgt_row = wb.getSheet("LoginPage").getRow(1);
	String un = tgt_row.getCell(0).toString();
	String pwd = tgt_row.getCell(1).toString();
	//enter username
	driver.findElement(By.id("username")).sendKeys(un);
	//enter password
	driver.findElement(By.name("pwd")).sendKeys(pwd);
	//click on login button
	driver.findElement(By.id("loginButton")).click();
	//verify homepage displayed or not
	WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));
	try 
	{
		wait.until(ExpectedConditions.titleContains("Time-Track"));
		System.out.println("Home Page is displayed");
		tgt_row.createCell(2).setCellValue("pass");
	} 
	catch (NullPointerException e) 
	{
		System.out.println("Home page is not displayed");
		tgt_row.createCell(2).setCellValue("fail");	
	}
	 //save changes
	 FileOutputStream output=new FileOutputStream("../AutomationProject/Sample.xlsx");
	 wb.write(output);
	}

}
