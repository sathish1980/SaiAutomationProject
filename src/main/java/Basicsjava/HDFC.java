package Basicsjava;

public class HDFC extends RBI {
	
	public void HDFCinfo()
	{
		System.out.println("HDFC ,Bengaluru");
		System.out.println("Karnataka");
	}
	
	public void profit()
	{
		System.out.println("20 % profit");

	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HDFC H = new HDFC();
		H.profit();
		H.HDFCinfo();
		H.personalloaninetrestrate();
		H.homeloaninetrestrate();
	}

}
