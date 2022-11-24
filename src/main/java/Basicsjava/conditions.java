package Basicsjava;

public class conditions {
	
	public void ifconditions(String color,String vehicletype,String occupancy)
	{
		if(color=="Green")
		{
			System.out.println("You are good to go");
		}
		else if(color=="Yellow") 
		{
			System.out.println("You are about to start");
		}
		else if(color=="Red")
		{
			System.out.println("You have to stop");
			if((vehicletype=="Ambulance") && (occupancy=="Yes"))
			{
				System.out.println("You are good to go");
				
				/*if(occupancy=="Yes")
				{
					System.out.println("You are good to go");
				}
				else
				{
					System.out.println("Wait along with other vehicles");
				}*/
			}
			else
			{
				System.out.println("Please wait . dont blow horn");
			}
		}
		else
		{
			System.out.println("This is an invalid color");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		conditions c = new conditions();
		c.ifconditions("Red","Ambulance","Yes");
		
	}

}
