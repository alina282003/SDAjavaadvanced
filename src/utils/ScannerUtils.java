package utils;

import java.util.Scanner;

public class ScannerUtils {
	
	private static Scanner scanner;
	
	public static Scanner getScanner() {
		if(scanner == null) {
			scanner = new Scanner(System.in);
		}
		return scanner;
	}
	
	public static void closeScanner() {
		scanner.close();
	}
		
	public static int getScannerInt() {
		int value;
		try {
			value = getScanner().nextInt();
		} catch (Exception e) {
			System.out.println("The value you entered is not valid. Please enter again an int value: ");
			getScanner().nextLine();
			value = getScannerInt();
		}
		return value;
	}
	
	public static double getScannerDouble() {
		double value;
		try {
			value = getScanner().nextDouble();
		} catch (Exception e) {
			System.out.println("The value you entered is not valid. Please enter again an double value: ");
			getScanner().nextLine();
			value = getScannerDouble();
		}
		return value;
	}
	
}
