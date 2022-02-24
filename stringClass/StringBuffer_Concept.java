package stringClass;

import java.util.Scanner;

public class StringBuffer_Concept
{
	public static void main(String[] args) 
	{
		
		StringBuffer sb=new StringBuffer();//It reserves room for 16 characters without reallocation
		
		int s=sb.capacity();
		
		sb=sb.append("Srinivas");
		sb.charAt(5);
		
		System.out.println(s);
		StringBuffer s1=sb.append("abcdefghijklmnopq");
		
		StringBuffer sb1=new StringBuffer(20);//explicitly sets the size of the buffer. 
		
		sb1.append("Srinivas");
		
		
		System.out.println(sb1.capacity());
		
		sb.append("Srinivas");
		System.out.println(s1);
		
		int s2=sb.capacity();
		
		System.out.println(s2);
		
		sb.append("qwertyuiklasdfghjkl;zxcvbnm,");
		
		int s3=sb.capacity();
		
		System.out.println(s3);
		
		StringBuffer sb3=new StringBuffer("Srinivas");// It accepts a string argument that sets the initial contents of the StringBuffer object and reserves room for 16 more characters without reallocation.
		
		sb3.append(" Addla");
		
		System.out.println("After appending text: "+sb3);
		
		System.out.println(sb3.capacity());
		
		
		System.out.println("--------------------------------------------------------------------");
		
		String str="Ratna*^%$";
		
		StringBuffer sb5=new StringBuffer(str);
		
		sb5=sb5.replace(5, 10, "");
		
		System.out.println(sb5);//
		
		
		StringBuffer sb6=new StringBuffer("Srinivas");
		sb6=sb6.insert(8, " Addla");
		System.out.println(sb6);
		
		StringBuffer sb7=new StringBuffer("Srinivas");
		System.out.println(sb7.charAt(7));//Exception in thread "main" java.lang.StringIndexOutOfBoundsException
		
		StringBuffer sb8=new StringBuffer("Sri");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
