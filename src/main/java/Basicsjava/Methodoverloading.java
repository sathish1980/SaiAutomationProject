package Basicsjava;

public class Methodoverloading {
	
	
	public void add(int a, int b)
	{
		int c=a+b;
		System.out.println("The addition of 2 number is"+c);
	}
	
	public void add(int a, int b, int d)
	{
		int c=a+b+d;
		System.out.println("The addition of 3 number is"+c);
	}
	
	public void add(int a, double b)
	{
		double c=a+b;
		System.out.println("The addition of 2 number with decimal"+c);
	}
	
	public void add(double a, double b)
	{
		double c=a+b;
		System.out.println("The addition of 2 number with decimal"+c);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Methodoverloading M = new Methodoverloading();
		M.add(2.3, 3.0);
	}

}
