package collections;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Set_Concept 
{
	public static void main(String[] args) 
	{
		Set s=new HashSet<>();
		
		s.add("Roy");
		s.add("Buttler");
		s.add("David");
		s.add("Kane");
		s.add("Roy");
		
		
		Iterator itr=s.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
		LinkedHashSet ls=new LinkedHashSet<>();
		
		ls.add("Srinivas");
		ls.add("Rohit");
		ls.add("Pooran");
		ls.add("Rohit");
		
		System.out.println(ls);
		
		
		Iterator it=ls.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		
		
		TreeSet ts=new TreeSet<>();
		
		ts.add(10);
		ts.add(15);
		ts.add(7);
		ts.add(3);
		ts.add(45);
		
		
		System.out.println(ts);
		
		Iterator itr1=ts.iterator();
		
		while(itr1.hasNext())
		{
			System.out.println(itr1.next());
		}
		
		System.out.println("---------------------------------------------");
		Iterator itr2=ts.descendingIterator();
		
		while(itr2.hasNext())
		{
			System.out.println(itr2.next());
		}
		
		TreeSet ts1=(TreeSet) ts.headSet(10);
		
		System.out.println(ts1);
		
		TreeSet ts2=(TreeSet) ts.tailSet(10);
		
		System.out.println(ts2);
		
		TreeSet ts3=(TreeSet) ts.subSet(10,45);
		
		System.out.println(ts3);
		
	}
}
