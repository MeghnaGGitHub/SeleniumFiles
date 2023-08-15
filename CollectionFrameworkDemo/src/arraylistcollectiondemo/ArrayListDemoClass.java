package arraylistcollectiondemo;

import java.util.ArrayList;

public class ArrayListDemoClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> obj=new ArrayList<String>();
		//add elements to collection!
		obj.add("Name");
		obj.add("MiddleName");
		//print collection
		System.out.println("Collection generated is:"+obj);
		//add more elements 
		obj.add("LastName");
		//add specific element to specified index
		obj.add(1, "NickName");
		//print collection
		System.out.println("Collection modified is:"+obj);
		//remove element
		obj.remove(1);
		//removed NickName from collection
		System.out.println("After removing element remaining collection is:"+obj);
		
		//create another ArrayList collection
		ArrayList<Integer> obj1=new ArrayList<Integer>();
		//add elements
		obj1.add(1);
		obj1.add(3);
		obj1.add(4);
		System.out.println("ArrayList another collection is:"+obj1);
		//adding element on specific index number
		obj1.add(1, 2);
		System.out.println("ArrayList another collection is:"+obj1);
		
	}

}
