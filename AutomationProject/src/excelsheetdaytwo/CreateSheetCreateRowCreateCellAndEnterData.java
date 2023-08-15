//WATS to create new sheet in excel and Write data in targeted row's targeted cell as Apache POI.
package excelsheetdaytwo;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
public class CreateSheetCreateRowCreateCellAndEnterData 
{
	public static void main(String[] args) throws  IOException 
	{
		// create a copy
		FileInputStream f=new FileInputStream("../AutomationProject/Sample.xlsx");
		//open excel
		 Workbook wb = WorkbookFactory.create(f);
		 //create a new sheet
		 Sheet newsheet = wb.createSheet("Automation");
		 Sheet newsheet1 = wb.createSheet("Automationcopyone");
		 //create new row
		 Row newrow = newsheet.createRow(1);
		 Row newrow1 = newsheet1.createRow(1);
		 //create new cell
		 Cell newcell = newrow.createCell(4);
		 Cell newcell1 = newrow1.createCell(4);
		 //enter data in targeted cell
		 newcell.setCellValue("Apache POI");
		 newcell1.setCellValue("Apache POI");
		 //save changes
		 FileOutputStream output=new FileOutputStream("../AutomationProject/Sample.xlsx");
		 wb.write(output);
	}
}
