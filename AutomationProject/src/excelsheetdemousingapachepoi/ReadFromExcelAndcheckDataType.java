/*
 Write a Test Script to check type of data from Excel sheet
 */
package excelsheetdemousingapachepoi;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

import org.apache.poi.ss.usermodel.CellType;

public class ReadFromExcelAndcheckDataType 
{
	public static void main(String[] args) throws IOException 
	{
		//copy file from ROM to RAM
		FileInputStream f=new FileInputStream("../AutomationProject/Sample.xlsx");
		//open excel sheet
		Workbook wb=WorkbookFactory.create(f);
		//identify sheet
		Sheet tgt_sheet = wb.getSheet("Sheet1");
		//identify row
		Row tgt_row = tgt_sheet.getRow(0);
		//identify cell
		 Cell tgt_cell= tgt_row.getCell(0);
		//identify type of data
		CellType datatype = tgt_cell.getCellType();
		if (datatype==CellType.STRING) 
		{
			String data = tgt_cell.getStringCellValue();
			System.out.println(data);
		}
		else 
		{
			double data = tgt_cell.getNumericCellValue();
			System.out.println(data);
		}
	}
}
