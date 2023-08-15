package excelsheetdaytwo;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class RemoveSheetFromExcel 
{
	public static void main(String[] args) throws EncryptedDocumentException, FileNotFoundException, IOException 
	{
		Workbook wb=WorkbookFactory.create(new FileInputStream("../AutomationProject/Sample.xlsx"));
		System.out.println("Creating new sheet!!!");
		wb.createSheet("NewSheet");
		wb.write(new FileOutputStream("../AutomationProject/Sample.xlsx"));
		
		
		System.out.println("Deleting new sheet!!!");
		wb.getSheet("NewSheet");
		wb.removeSheetAt(4);
		wb.write(new FileOutputStream("../AutomationProject/Sample.xlsx"));
		
		
	}

}
/*
 To execute this program run it twice.
 1st comment line from 22 to 24 and open excel sheet and check if new sheet is created or not
 2nd time comment from 17 to 19 and open excel sheet and check if the new sheet is deleted or not
 */
