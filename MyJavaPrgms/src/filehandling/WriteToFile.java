package filehandling;

import java.io.FileWriter;
import java.io.IOException;

public class WriteToFile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			FileWriter fw=new FileWriter("Demo.txt");
			fw.write("Writing in file can be tricky but is easy enough!");
			System.out.println("Wrote in file successfully!");
			fw.close();
			
		} catch (IOException e) {
			// TODO: handle exception
			System.out.println("An error occured while writing in to a file");
			e.printStackTrace();
		}
	}

}
