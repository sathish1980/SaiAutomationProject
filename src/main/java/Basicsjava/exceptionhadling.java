package Basicsjava;

public final class exceptionhadling {
	
	int z=20;
	public void add()
	{
		int a=10;
		int b=20;
		int c=a+b;
		System.out.println(c);
	}
	
	public void sub() throws ArithmeticException,NullPointerException
	{
		int a=10;
		int b=20;
		int c=a-b;
		System.out.println(c);
	}
	
	public void div()
	{
		try
		{
			int a=10;
			int b=0;
			int c=a/b;
			System.out.println(c);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		finally
		{
			System.out.println("finally is exection");
		}
	}

	public void age(int age) throws Throwable
	{
		if (age <18)
		{
			finalize();
			throw new NullPointerException("You are under 18");
		}
	}
	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
		exceptionhadling e = new exceptionhadling();
		e.div();
		e.add();
		e.sub();
		e.age(15);
	}

}
