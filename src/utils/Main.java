package utils;

public class Main {

	public static void main(String[] args) {

		System.out.println("Please insert the int numerator");
		int numerator = ScannerUtils.getScannerInt();
		System.out.println("Please insert the int denominator");

		System.out.println("Result of division is: " + calculateDivisionResult(numerator));

	}

	private static double calculateDivisionResult(int numerator) {
		int denominator = ScannerUtils.getScannerInt();

		double result;
		try {
			result = makeDivision(numerator, denominator);
		} catch (DivisionByZeroException divisionException) {
			System.out.println(divisionException.getMessage() + " Please insert another int denominator");
			ScannerUtils.getScanner().nextLine();
			result = calculateDivisionResult(numerator);
		}

		return result;
	}

	private static double makeDivision(int numerator, int denominator) throws DivisionByZeroException {
		if (denominator == 0) {
			throw new DivisionByZeroException("Division by zero is not posible.");
		} else
			return (double) numerator / denominator;
	}

}
