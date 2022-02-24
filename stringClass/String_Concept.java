package stringClass;

public class String_Concept 
{
	public static void main(String[] args) 
	{
		//String str=new String();//here new keyword will create an object of String and stores in heap area
		String str="Srinivas";//it will store in scp static class pool
		System.out.println(str);
		
		String str1="Addla";
		
		int size=str.length();
		
		System.out.println(size);
		
		String lString=str.toLowerCase();
		
		System.out.println(lString);
		
		String upperCase=str.toUpperCase();
		System.out.println(upperCase);
		
		String nonTrim="         Srinivas    ";
		
		System.out.println(nonTrim);
		System.out.println(nonTrim.trim());
		
		String substr="Srinivas";
		System.out.println(substr.substring(1));
		System.out.println(substr.substring(1,8));
		
		String name="Srinivas";
		System.out.println(name.replace('S', 'D'));
		
		System.out.println(name.startsWith("Sri"));
		
		System.out.println(name.startsWith("ri"));
		
		System.out.println(name.endsWith("vas"));
		
		System.out.println(name.startsWith("si"));
		
		System.out.println(name.charAt(2));
		
		System.out.println(name.charAt(7));
		
		System.out.println(name.indexOf('i'));
		
		System.out.println(name.indexOf('i',3));
		
		System.out.println(name.equals("Srinivas"));
		
		System.out.println(name.equalsIgnoreCase("SriniVAS"));//lower or uppercase it will ignore the case
		
		
	}
}
