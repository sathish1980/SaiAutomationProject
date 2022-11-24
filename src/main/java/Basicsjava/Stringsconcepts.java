package Basicsjava;

public class Stringsconcepts {
	
	String name ="sathish kumarR";
	String name1 = " sathish kumarR ";
	String name2 ="";
	int a=10;
	
	public void stringimplementation()
	{
		System.out.println(name);
		System.out.println(name.length());
		System.out.println(name.charAt(13));
		System.out.println(name.compareTo(name1));
		System.out.println(name.equals(name1));
		System.out.println(name.equalsIgnoreCase(name1));
		System.out.println(name.concat(name1));
		System.out.println(name+name1);
		System.out.println(name.contains("thi"));
		System.out.println(name.startsWith("s"));
		System.out.println(name.endsWith("R"));
		System.out.println(name.indexOf("a"));
		System.out.println(name2.isEmpty());
		System.out.println(name.lastIndexOf("a"));
		System.out.println(name.replace("athi","A"));
		//String[] after =name.split("a");
		String[] after =name.split("\\s");
		for (String eachval :after)
		{
			System.out.println(eachval);
		}
		
		System.out.println(name.substring(2));
		System.out.println(name.substring(2,7));
		char[] chage=name.toCharArray();
		for (char c:chage)
		{
			System.out.println(c);
		}
		
		System.out.println(name.toLowerCase());
		System.out.println(name.toUpperCase());
		System.out.println(name.toUpperCase());
		System.out.println(name1.trim());
		System.out.println(String.valueOf(a));
	}
	
	public void stringanotherimplmentation()
	{
		System.out.println(name);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stringsconcepts s = new Stringsconcepts();
		s.stringimplementation();
		s.stringanotherimplmentation();
	}

}
