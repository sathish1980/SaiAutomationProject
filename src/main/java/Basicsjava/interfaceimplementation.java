package Basicsjava;

public class interfaceimplementation extends RBI implements interface1 {
	
	String[] coursedetails = {"python","c#","java","pearl"};
	public void discount(String gender)
	{
		if(gender.equals("male"))
		{
			System.out.println("you are not eligible for discount");
		}
		else if(gender.equals("female"))
		{
			System.out.println("you are eligible for discount");
		}
		
	}
	
	@Override
	public void coursedetails() {

		for(String eachvalue:coursedetails)
		{
			System.out.println(eachvalue);
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		interface2 i = new interfaceimplementation();
		i.coursedetails();
		//interface1.salary();
		interfaceimplementation i1= new interfaceimplementation();
		i1.discount("male");
	}

	@Override
	public void salary() {
		// TODO Auto-generated method stub
		
	}

	

}
