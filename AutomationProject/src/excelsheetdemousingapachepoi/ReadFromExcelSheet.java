package excelsheetdemousingapachepoi;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadFromExcelSheet 
{
	public static void main(String[] args) throws  IOException 
	{
		//copy excel sheet from ROM TO RAM
		FileInputStream f=new FileInputStream("../AutomationProject/Sample.xlsx");
		//open excel sheet
		Workbook wb=WorkbookFactory.create(f);
		//open sheet
		Sheet tgt_sheet = wb.getSheet("Sheet1");
		//identify row
		Row tgt_row = tgt_sheet.getRow(0);
		//identify cell
		Cell tgt_cell = tgt_row.getCell(0);
		//row data
		String data = tgt_cell.getStringCellValue();
		System.out.println(data);
		//open sheet
		Sheet tgt_sheet1 = wb.getSheet("Sheet2");
		//identify row
		Row tgt_row1 = tgt_sheet1.getRow(0);
		//identify cell
		Cell tgt_cell1 = tgt_row1.getCell(0);
		//row data
		String data1 = tgt_cell1.getStringCellValue();
		System.out.println(data1);
		
	}

}
