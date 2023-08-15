package stringprogram;

public class StringMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String s1="Hello";
String s2="HELLO";
String s3="hElLo";
String s4=" ";

//System.out.println(s1.charAt(5));//Compiler is checking for 5th place in Index which doesn't exists so throws java.lang.StringIndexOutOfBound Exception
System.out.println(s1.charAt(0));
System.out.println(s2.compareTo(s1));
System.out.println(s2.equalsIgnoreCase(s3));
System.out.println(s4.isEmpty());//space is counted as character in empty.
System.out.println(s4.isBlank());
System.out.println(s2.contains(s3));
System.out.println(s1.lastIndexOf('o'));
	}

}
 