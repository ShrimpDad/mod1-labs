package lab3_2;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vehicle[] vehicles = new Vehicle[3];
		
		vehicles[0] = new Vehicle( 20, 10 );
		vehicles[1] = new Vehicle( 20, 10 );
		vehicles[2] = new Vehicle( 20, 10 );
		
		for (Vehicle vehicle : vehicles) {
			vehicle.getDetails();
		}
	}

}
