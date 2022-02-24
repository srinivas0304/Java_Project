package collections;

import java.util.ArrayList;

public class ArrayList_Class 
{
	public static void main(String[] args)
	{
		ArrayList al=new ArrayList<>();
		
		
		al.add("David");
		
		al.add("1230");
		
		al.add('A');
		
		al.add("dave14");
		
		System.out.println(al);
		
		for(Object s:al)
		{
			System.out.println(s);
		}
		
	}
}
