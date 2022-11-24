package Basicsjava;

public class Firstclass {
	
	//Method without parameter / arguments
	//Method with parameter
	//method with out return type
	//method with return type
	//constructor
	//2 without parameter and with parameter
	
	// syntax : accessmodifier returntype methodname(){}
	
	//Datatype
	// data		  		keyword
	//Wholenumner 		int
	//1digitdecimal		float
	//>1digitdeicmal	double
	//character			char
	//word				String
	//Trueorfalse		Boolean
	
	public int phonenumber = 915921118;  //global variable
	static float mark1 = 1.2f; // in real time we will not use this
	double mark2 = 99.999;
	char gender	 = 'M';
	String name = "sathish";
	Boolean checked = true;
	
	//syntax for variable
	// accessmodifier datatype variablename = value;
	
	
	/*public Firstclass(int a, int b) //constructor
	{
		int phonenumber = 19929;  //localvariable
		System.out.println("The constuctor"+phonenumber);
	}*/
	
	//Method without parameter / arguments and without return type
	public void add()
	{
		int a = 10;
		int b = 20;
		int c = a+b;
		System.out.println("The addition of 2 numbers : "+c); //method implementation
		System.out.println("global variablevalue : "+phonenumber);
	}
	
	//Method with parameter / arguments
	public void sub(int a, int b, int d, int z,int A)
	{
		int c = a+b;
		//int e = mul();
		int e = multiply(a,b); // Method Call
		int f= c-e;
		System.out.println("global variablevalue : "+phonenumber);
		System.out.println("The addition of 2 numbers : "+c); //method implementation
	}
	
	//without parameter and with returntype
	public int mul()
	{
		int a=10;
		int b=20;
		int c=a*b;
		return c;
		
	}
	
	//with parameter and with returntype
		public int multiply(int a,int b)
		{
			int c=a*b;
			return c;	
		}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("sathish");
		System.out.println("kumar");
		System.out.println("B.tech");
		System.out.print("annanagar");
		System.out.println("kilpauk");
		Firstclass obj=new Firstclass();
		Firstclass FC=new Firstclass();
		obj.add();
		obj.sub(3,4,5,6,7); //method call
	}

}
