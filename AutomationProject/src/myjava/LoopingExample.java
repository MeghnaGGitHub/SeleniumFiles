package myjava;

public class LoopingExample 
{
public void whileLoppExample() 
{
	int i=1;
	while(i<=10) 
	{
		System.out.println("i="+ i);
		//break;
		i++;
	}
	System.out.println("done");
}
	public void doWhileLoop() 
	{
	int i=1;
	do 
	{
		System.out.println("i="+i);
		i++;// if this is not gvn then ctrl goes in infinite loop
	} while (i<=10);
	System.out.println("done");
}
public void forLoop() 
{
	for(int i =1;i <=10;i++) 
	{
		System.out.println("i="+i);
	}
}
public void multiTable(int num,int limit) {
	for(int i=1;i<=limit;i++) {
		System.out.println(num + " * "+ i +" = " + (num*i));
	}
}

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		LoopingExample obj=new LoopingExample();
	//	obj.whileLoppExample();
	//	obj.doWhileLoop();
//		obj.forLoop();
		obj.multiTable(35,20);
	}

}
