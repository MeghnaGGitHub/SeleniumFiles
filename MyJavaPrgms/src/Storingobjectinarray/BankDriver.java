package Storingobjectinarray;

import java.util.Arrays;

public class BankDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Bank[] b1=new Bank[3];
b1[0]=new Bank("Meghna",1006);
b1[1]=new Bank("Megha", 1004);
b1[2]=new Bank("Meghana", 1005);
System.out.println("Before Sorting the array");
for (int i = 0; i < b1.length; i++) {
	System.out.println(b1[i]);
}
System.out.println("After Sorting the array");
Arrays.sort(b1);
for (int i = 0; i < b1.length; i++) {
	System.out.println(b1[i]);
}
	}
}
