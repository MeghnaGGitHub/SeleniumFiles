package arraylistcollectiondemo;

import java.util.ArrayList;

public class InsertAlphaAndRemoveVowelsFromALCollection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Character> al=new ArrayList<Character>();
		al.add('a');
		al.add('b');
		al.add('c');
		al.add('d');
		al.add('e');
		al.add('f');
		al.add('g');
		al.add('h');
		al.add('i');
		al.add('j');
		al.add('o');
		al.add('u');
		System.out.println("ArrayList Collection:"+al);
		al.removeIf(a->(a=='a'||a=='e'||a=='i'||a=='o'||a=='u'));
		System.out.println("After removing vowels from the list:"+al);
	}

}
