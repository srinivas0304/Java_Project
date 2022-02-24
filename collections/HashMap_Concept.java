package collections;

import java.security.KeyStore.Entry;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMap_Concept 
{
	public static void main(String[] args) 
	{
		HashMap<Integer, String> map=new HashMap<Integer, String>();
		
		map.put(1, "Srinivas");
		map.put(2, "Buttler");
		map.put(3, "Kane");
		map.put(5, "Rohit");
		map.put(4, "Srinivas");
		map.put(6, "Buttler");
		map.put(7, "Kane");
		map.put(8, "Rohit");
		map.put(9, "Srinivas");
		map.put(10, "Buttler");
		map.put(11, "Kane");
		map.put(12, "Rohit");
		map.put(13, "Srinivas");
		map.put(14, "Buttler");
		map.put(15, "Kane");
		map.put(16, "Rohit");
		map.put(18, "Srinivas");
		//map.put("Dave", 20);
		
		System.out.println(map);
		
		System.out.println(map.get(5));//it provides null
		
		for(Integer i: map.keySet())//Print keys and values
		{
			System.out.println(i+" "+map.get(i));
		}
		
		map.putIfAbsent(17, "Faf");
		for(Integer i: map.keySet())//Print keys and values
		{
			System.out.println(i+" "+map.get(i));
		}
		
		map.size();	
		System.out.println();
		
		HashMap mp=new HashMap<>();
		
		mp.put("name", "Srinivas");
		mp.put("dob", "05july");
		mp.put("name", "Kane");
		
		System.out.println(mp);
		
		for(Object s:mp.keySet())
		{
			System.out.println(s+" "+mp.get(s));
		}
		 
		System.out.println(mp.get("dob"));
		
		System.out.println(mp.size());
		
		System.out.println("=========================================");
		
		//another way to print key and value
		Set s=mp.keySet();
		
		Iterator itr=s.iterator();
		
		while(itr.hasNext())
		{
			Object obj=itr.next();
			
			String str=(String)obj;
			
			System.out.println(str+" "+mp.get(str));
		}
	}
}
