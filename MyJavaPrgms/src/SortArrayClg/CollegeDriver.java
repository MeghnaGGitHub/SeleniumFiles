package SortArrayClg;

import java.util.Arrays;
import java.util.Scanner;

public class CollegeDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);//create object of scanner class to take values from user.
		System.out.println("Enter size of array:");//ask array size
		int size=sc.nextInt();
		College []c1=new College[size];
		for (int i = 0; i < c1.length; i++) {
			System.out.println("Enter college name:");
			String cname=sc.next();
			System.out.println("Enter colege id:");
			int cid=sc.nextInt();
			c1[i]=new College(cname, cid);
											}
		System.out.println("College details stored successfully in array");
		System.out.println("---------------------");
		System.out.println("Before sorting college array");
		for (int i = 0; i < c1.length; i++) {
			System.out.println("College name"+c1[i].cname+" College id: "+c1[i].cid);	
											}
		System.out.println("----------------------------------------");
		System.out.println("Before sorting college array");
		Arrays.sort(c1);
		for (int i = 0; i < c1.length; i++) {
			System.out.println("College name"+c1[i].cname+" College id: "+c1[i].cid);
											}
		System.out.println("----------");
		System.out.println("Enter college name to search:");
		String cname=sc.next();
		for (int i = 0; i < c1.length; i++) {
		if (c1[i].cname.equalsIgnoreCase(cname)) {
			System.out.println("College exists");
			return;
												 }	
											}
		System.out.println("College doesn't exists");
		
											}

							}
