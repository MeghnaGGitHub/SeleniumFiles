package hashmapdaytwo;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class HMDemo3 
{
	public static void main(String[] args) throws EncryptedDocumentException, FileNotFoundException, IOException {
		Workbook wb=WorkbookFactory.create(new FileInputStream("../AutomationProject/Sample.xlsx"));
		Sheet s = wb.getSheet("Sheet1");
		int rowcount = s.getLastRowNum();
		for(int rownum=0;rownum<rowcount;rownum++) 
		{
			Row r = s.getRow(rownum);
			short cellcount = r.getLastCellNum();
			for(int cellnum=0;cellnum<cellcount;cellnum++) 
			{
				String key_name = r.getCell(cellnum).toString();
				System.out.println(key_name);
			}
		}
		
		
		Map<String, List<String>> user_hashmap = new HashMap<String, List<String>>();
		//Creating two lists and inserting some data in it
		List<String> list_1 = new ArrayList<String>();
		list_1.add("Anvesh");
		list_1.add("Anvesh@gmail.com");
		list_1.add("Anvesh123");
		list_1.add("AP");
		list_1.add("India");

		
		List<String> list_2 = new ArrayList<String>();
		list_2.add("Raghu");
		list_2.add("Raghu@gmail.com");
		list_2.add("Raghu123");
		list_2.add("NewYork");
		list_2.add("USA");
		
		List<String> list_3= new ArrayList<String>();
		list_3.add("Gagan");
		list_3.add("gagan@gmail.com");
		list_3.add("Gagan123");
		list_3.add("Karnataka");
		list_3.add("India");
		
		List<String> list_4= new ArrayList<String>();
		list_4.add("Kiran");
		list_4.add("kiran@gmail.com");
		list_4.add("Kiran123");
		list_4.add("London");
		list_4.add("UK");

		//Inserting both the lists and key to the Map 
		user_hashmap.put("User-01", list_1);
		user_hashmap.put("User-02", list_2);
		user_hashmap.put("User-03", list_3);
		user_hashmap.put("User-04", list_4);

		for(Map.Entry<String, List<String>> hashmap_data : user_hashmap.entrySet())
		{
		      String key = hashmap_data.getKey(); // contains the keys
		      List<String> val = hashmap_data.getValue(); // contains arraylists
		      // print all the key and values in the hashmap
		      System.out.println(key + ": " +val);
		      
		      // using interator to get the specific values arraylists
		      Iterator<String> itr = val.iterator();
		      int i = 0;
		      String[] data = new String[val.size()];
		        while (itr.hasNext()){
		            String array = itr.next();
		            data[i] = array;
		            System.out.println(data[i]); // GET THE VALUE
		            i++;
		        }
		}
	}
}
