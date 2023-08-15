package excelsheetdemousingapachepoi;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadExcelDataUsing2Methods 
{
	public static void main(String[] args) throws  IOException 
	{
		//create a copy from ROM to RAM
	FileInputStream f=new FileInputStream("../AutomationProject/Sample.xlsx");
	//open excel sheet
	Workbook wb=WorkbookFactory.create(f);
	//identify target sheet
	Sheet tgt_sheet = wb.getSheet("Sheet1");
	//identify target row
	Row tgt_row = tgt_sheet.getRow(0);
	//identify target cell
	Cell tgt_cell = tgt_row.getCell(0);
	//store cell data
	String data = tgt_cell.getStringCellValue();
	//display data using tgt_cell reference variable
	System.out.println(data);
	System.out.println(data.toString());
	}
}
