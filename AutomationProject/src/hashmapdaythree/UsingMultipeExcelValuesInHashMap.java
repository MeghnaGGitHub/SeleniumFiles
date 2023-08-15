package hashmapdaythree;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;
import java.util.Vector;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class UsingMultipeExcelValuesInHashMap 
{
	public static void main(String[] args) throws EncryptedDocumentException, FileNotFoundException, IOException 
	{
		int a=1;
		//storing values in hm from excel
		Workbook wb = WorkbookFactory.create(new FileInputStream("../AutomationProject/Sample.xlsx"));
		Sheet s = wb.getSheet("Sheet3");
		int rowcount = s.getLastRowNum();
		ArrayList a1=new ArrayList();
		HashMap<String, String> ref=new HashMap<>();
		for(int rownum=0;rownum<=rowcount;rownum++) 
		{
			String value =s.getRow(rownum).getCell(0).toString();
			a1.add(value);
		}
		System.out.println(a1);
		
		
		
		/*
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		switch (a) {
		case 1:
		{
			System.out.println(user_01);
		}
			break;
		case 2:
		{
			System.out.println(user_02);
			
		}
			break;
		case 3:
		{
			System.out.println(user_03);
		}
			break;
		case 4:
		{
			System.out.println(user_04);
		}
			break;

		default:
			System.out.println("Wrong choice");
			break;
		}*/
		//file:///C:/Users/Meghna/Desktop/demo.html
		
	}

}
