 //WATS to identify 2X2 cells
package excelsheetdaytwo;
import java.io.FileInputStream;
import java.io.IOException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
public class Identify2by2dataFromExcel 
{
	public static void main(String[] args) throws IOException 
	{
	Workbook wb=WorkbookFactory.create(new FileInputStream("../AutomationProject/Sample.xlsx"));
	Sheet tgt_sheet = wb.getSheet("Sheet3");
	for(int rownum=0;rownum<=1;rownum++)
	{
		Row r = tgt_sheet.getRow(rownum);
		for(int cellnum=0;cellnum<=1;cellnum++) 
		{
			Cell tgt_cell = r.getCell(cellnum);
			String data=tgt_cell.toString();
			System.out.print(data+" ");
		}
		System.out.println();
	}
	}
}
