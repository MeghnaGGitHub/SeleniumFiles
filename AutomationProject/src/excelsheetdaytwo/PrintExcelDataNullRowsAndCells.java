//WATS to print excel sheet as output if it contains empty rows and cells.
package excelsheetdaytwo;
import java.io.FileInputStream;
import java.io.IOException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
public class PrintExcelDataNullRowsAndCells 
{
	public static void main(String[] args) throws  IOException 
	{
		FileInputStream f=new FileInputStream("../AutomationProject/Sample.xlsx");
		 Workbook wb = WorkbookFactory.create(f);
		 Sheet tgt_sheet = wb.getSheet("Sheet3");
		 //identify total rows in sheet
		 int rowcount=tgt_sheet.getLastRowNum();
		 for(int rownum=0;rownum<=rowcount;rownum++)
		 {
			 try 
			{
				 Row tgt_row = tgt_sheet.getRow(rownum);
				 //identify total cells in a row
				 short cellcount = tgt_row.getLastCellNum();
				 for(int cellnum=0;cellnum<cellcount;cellnum++) 
				 {
					 try
					{
						 Cell tgt_cell = tgt_row.getCell(cellnum);
						 String data = tgt_cell.toString();
						 System.out.println(data+" ");	
					} 
					 catch (Exception e) 
					{
						 System.out.print(" ");
					}
				 }
				 System.out.println();
			} 
			 catch (NullPointerException e)
			 {
				 System.out.print(" ");
			 }
		 }
	}
	
}
