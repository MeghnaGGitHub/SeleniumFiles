// WATS to print sheet data as an output if cell count is varying from row to row
package excelsheetdaytwo;
import java.io.FileInputStream;
import java.io.IOException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
public class PrintExcelDataRowsAndCells 
{
	public static void main(String[] args) throws IOException 
	{
		FileInputStream f=new FileInputStream("../AutomationProject/Sample.xlsx");
		 Workbook wb = WorkbookFactory.create(f);
		 Sheet tgt_sheet = wb.getSheet("Sheet3");
		 //identify total rows in sheet
		 int rowcount=tgt_sheet.getLastRowNum();
		 for(int rownum=0;rownum<=rowcount;rownum++)
		 {
			 Row tgt_row = tgt_sheet.getRow(rownum);
			 //identify total cells in a row
			 short cellcount = tgt_row.getLastCellNum();
			 for(int cellnum=0;cellnum<cellcount;cellnum++) 
			 {
				 Cell tgt_cell = tgt_row.getCell(cellnum);
				 String data = tgt_cell.toString();
				 System.out.print(data+" ");
			 }
			 System.out.println();
		 }
	}
}
