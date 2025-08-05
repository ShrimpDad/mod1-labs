package lab3;

public class WeightConversions {

	public static void main(String[] args) {
		System.out.println("Enter weight in kg: ");
		int weight = ScannerUtils.getInt();		
		convertKgsToStonesPounds( weight );

		ScannerUtils.close();

	}
	
	static void convertInputToStonesPounds( int pounds ) {
		int convStones = pounds/14;
		int convPounds = pounds%convStones;
		System.out.printf( "Weight is %d Stone %d Pounds", convStones, convPounds );
	}
	
	static void convertKgsToStonesPounds( int kg) {
		int pounds = (int)(kg*2.20462);
		convertInputToStonesPounds( pounds );
	}
}
