package Basicsjava;

public class SBI extends RBI {
	
	public void SBIinfo()
	{
		System.out.println("SBI ,Chennai");
		System.out.println("Tamilnadu");
	}
	
	public void ATMcount()
	{
		System.out.println(" online ATM :25");
		System.out.println(" ofline ATM :15");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SBI S = new SBI();
		S.SBIinfo();
		S.ATMcount();
		S.personalloaninetrestrate();
		S.homeloaninetrestrate();
	}

}
