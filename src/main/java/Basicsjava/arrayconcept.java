package Basicsjava;

public class arrayconcept {
	
	int[] age = {34,23,34,23,2,43,3};
	String[] fruits= {"apple","orange","banana"};
	
	public void arrrayimplementaion()
	{
		//System.out.println(age[1]);
		for (int i=0;i<age.length;i++)
		{
			System.out.println(age[i]);
		}
		
		for (int temp : age)
		{
			System.out.println(temp);
		}
		
		for(String eachval:fruits)
		{
			System.out.println(eachval);
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		arrayconcept a = new arrayconcept();
		a.arrrayimplementaion();
	}

}
