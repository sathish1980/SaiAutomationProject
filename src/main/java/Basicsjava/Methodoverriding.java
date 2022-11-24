package Basicsjava;

public class Methodoverriding extends RBI{
	
	public void personalloaninetrestrate(int amount)
	{ 	
		double interesetrate=0.2;
		double actualamount=amount*interesetrate;
		System.out.println("personal loan amount intereset is "+actualamount);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Methodoverriding M = new Methodoverriding();
		M.personalloaninetrestrate();
		M.personalloaninetrestrate(5000);
	}

}
