package excelsheetdaythree;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class RemoveSheetRowCell
{
	public static void main(String[] args) throws  IOException 
	{
		// create a copy
				FileInputStream f=new FileInputStream("../AutomationProject/Sample.xlsx");
				//open excel
				 Workbook wb = WorkbookFactory.create(f);
				 //create a new sheet
				 Sheet newsheet = wb.createSheet("Automationcopytwo");
				 //create new row
				 Row newrow = newsheet.createRow(1);
				 //create new cell
				 Cell newcell = newrow.createCell(4);
				 //enter data in targeted cell
				 newcell.setCellValue("Apache POI");
				 //remove cell
				  newrow.removeCell(newcell);
				
				 //save changes
				 FileOutputStream output=new FileOutputStream("../AutomationProject/Sample.xlsx");
				 wb.write(output);
	}
}
