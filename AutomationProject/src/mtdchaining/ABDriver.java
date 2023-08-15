package mtdchaining;

public class ABDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		B b1=new B();
		b1.test3();
		String s=b1.test2();
		int a=s.length();
		System.out.println(a);
	A a1=b1.test1();
	String s2=a1.abc();
	System.out.println(s2);
		
	}

}
