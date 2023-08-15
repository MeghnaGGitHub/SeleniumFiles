package javacollectionmapprgms;

import java.util.ArrayList;

public class ForEachDemo {

	public static void main(String[] args) {
		ArrayList a1=new ArrayList();
		
		a1.add(2);
		a1.add(4);
		a1.add(6);
		a1.add(8);
		for(Object o:a1)
		{
			System.out.println(o);
		}
		

	}

}
