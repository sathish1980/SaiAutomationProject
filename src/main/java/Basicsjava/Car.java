package Basicsjava;

public class Car extends Vehicle {
	
	public void carManufacturer()
	{
		System.out.println("Hundai");
		System.out.println(Makeyear);
	}
	
	public void Carspec()
	{
		System.out.println("Disel");
		System.out.println("Tank capacity : 50 L");
		System.out.println("Max Speed : 150");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car c = new Car();
		c.carManufacturer();
		c.Carspec();
		c.VehicleMode();
		c.VehicleType();
	}

}
