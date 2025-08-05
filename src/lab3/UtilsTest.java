package lab3;

public class UtilsTest {
	
	public static void main(String[] args) {
		
		Utils utils = new Utils();
		
		System.out.println( utils.getInt( "Type an Int:" ) );

		System.out.println( utils.getString( "Type a String:" ) );
		
		utils.s.close();
	}
};