//modifying cell data
package excelsheetdaytwo;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class AddOrModifyExcelData 
{
	public static void main(String[] args) throws  IOException 
	{
		// TODO Auto-generated method stub
		FileInputStream f=new FileInputStream("../AutomationProject/Sample.xlsx");
		 Workbook wb = WorkbookFactory.create(f);
		 Sheet tgt_sheet = wb.getSheet("Sheet3");
		 //identify row
		 Row tgt_row = tgt_sheet.getRow(0);
		 //identify cell
		 Cell tgt_cell = tgt_row.getCell(1);
		 //enter data in cell
		 tgt_cell.setCellValue("meghnagupta1");
		 //save changes
		 FileOutputStream output=new FileOutputStream("../AutomationProject/Sample.xlsx");
		 wb.write(output);
	}
}
