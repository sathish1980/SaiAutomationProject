package Basicsjava;

public class abstractimplementation extends abstractclass
{

	
	@Override
	public void taxcalculation() {
		int amount =5000;
		double taxpercentage=0.3;
		double taxamount=amount*taxpercentage;
		System.out.println(taxamount);
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		abstractclass c = new abstractimplementation();
		c.taxcalculation();
	}

	

}
