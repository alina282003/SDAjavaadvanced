package nestedclasses;


public class MainNestedClasses {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		TestAnonymous test = new TestImplementation();
		
		TestAnonymous testAnomymous = new TestAnonymous() {
			private int number  = 10;
			
			private String getNumber() {
				return String.valueOf(number);
			}
			

			@Override
			public void test() {
				System.out.println("Print from anounymous class that implemnts interface and has parameter number: "+ getNumber());
			}
			
		};
		
		test.test();
		testAnomymous.test();
	}

}
