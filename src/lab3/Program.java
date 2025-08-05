package lab3;

import java.util.Scanner;

public class Program {
	
	public static void main(String[] args) {
		
		System.out.println( ScannerUtils.getInt( "Type an Int:" ) );

		System.out.println( ScannerUtils.getString( "Type a String:" ) );
		
		 ScannerUtils.s.close();
	}
};