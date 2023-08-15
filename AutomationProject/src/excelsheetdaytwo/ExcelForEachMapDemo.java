package excelsheetdaytwo;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelForEachMapDemo {

	public static void main(String[] args) throws  IOException {
		FileInputStream f=new FileInputStream("../AutomationProject/Sample.xlsx")	;
		Workbook wb=WorkbookFactory.create(f);
		//Sheet tgt_sheet = wb.getSheet("Sheet3");
		for(Sheet sheet:wb)
		{
		for (Row row : sheet) 
		{
			for(Cell cell:row)
			{
			//Cell tgt_cell=row.getCell(0);
			System.out.print(cell+" ");
		}
			System.out.println();
		}
		System.out.println();
		}

	}

}
