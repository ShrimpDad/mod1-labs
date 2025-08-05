package lab3;

import java.util.Scanner;

public class ScannerUtils {
	
	public static Scanner s = new Scanner( System.in );
	
	public static void main(String[] args) {
		
	}
	
	public static int getInt( String prompt ) {
		System.out.println( prompt );
		int result = s.nextInt();
		s.nextLine();
		return result;
	}
	
	public static int getInt() {
		int result = s.nextInt();
		s.nextLine();
		return result;
	}
	
	public static String getString( String prompt ) {
		System.out.println( prompt );
		String result = s.nextLine();
		s.nextLine();
		return result;
	}
	
	public static String getString() {
		String result = s.nextLine();
		s.nextLine();
		return result;
	}

	public static void close() {
		s.close();
	}
}
