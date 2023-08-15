package filehandling;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadToFile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try 
		{
			File f1=new File("Demo.txt");
			Scanner sc=new Scanner(f1);
			while (sc.hasNextLine()) 
			{
				String str = (String) sc.nextLine();
				System.out.println("Demo File content is:\n"+str);
			}
			sc.close();
		} 
		
		catch (FileNotFoundException e) 
		{
			// TODO: handle exception
			System.out.println("An error occured!!!");
			e.printStackTrace();
		}
	}

}
