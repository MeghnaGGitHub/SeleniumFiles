package ObjectStorageInArray;

import java.util.Arrays;

public class BookDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Books[]b1=new Books[5];
		b1[0]=new Books("Java",6);
		b1[1]=new Books("C",3);
		b1[2]=new Books("SQL",8);
		b1[3]=new Books("Python",1);
		b1[4]=new Books("C++",2);
		for (int i = 0; i < b1.length; i++) {
			System.out.println(b1[i]);
		}
		System.out.println("After sorting books are arranged as:");
		System.out.println("-----------------");
		Arrays.sort(b1);
		for (int i = 0; i < b1.length; i++) {
			System.out.println(b1[i]);
		}
	}

}
