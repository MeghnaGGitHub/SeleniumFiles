package filehandling;

import java.io.File;
import java.io.IOException;

public class CreateNewFile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			File f1=new File("Demo.txt");
			if (f1.createNewFile()) {
				System.out.println("File is created successfully and name is:"+f1.getName());
			}
			else
				System.out.println("File already exists!!");
		} catch (IOException e) {
			// TODO: handle exception
			System.out.println("An error occured!");
		}
	}

}
