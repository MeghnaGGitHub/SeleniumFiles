package javacollectionmapprgms;
import java.util.HashMap;
public class HashMapDemp 
{
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		HashMap<Integer, String> map=new HashMap<Integer,String>();
		System.out.println("Ice-cream Flavours are:");
		map.put(1,"Mango");
		map.put(2,"Apple");
		map.put(3,"Strawberry");
		map.put(4, "Butterscotch");
		System.out.println("Flavour of 4th choice is: "+map.get(4));
		System.out.println(map.keySet());
		System.out.println(map.values());
		System.out.println(map.containsKey(4));
		System.out.println(map.containsValue("Apple"));
		System.out.println(map.entrySet());
		System.out.println(map.size());
		//map.clear();
		//System.out.println(map);
		map.put(null, "Gauva");
		System.out.println(map);
		map.put(null, "Vanilla");
		System.out.println(map);
		map.put(5, null);
		System.out.println(map);
		map.put(6, null);
		map.put(null, null);
		System.out.println(map);
		System.out.println(map.put(5, "Chocolate"));
		System.out.println(map);
		System.out.println(map.remove(2, "Apple"));
		System.out.println(map);
		System.out.println(map.size());
		for(Object o:map.values())
		{
			System.out.println(o);
		}
	}
}
