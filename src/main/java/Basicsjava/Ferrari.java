package Basicsjava;

public class Ferrari extends Car {
	int make=2020;
	
	public void FerrariManufacturer()
	{
		System.out.println("Ferrai");
		System.out.println(make);
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ferrari F = new Ferrari();
		F.FerrariManufacturer();
		F.Carspec();
		F.VehicleMode();
	}

}
