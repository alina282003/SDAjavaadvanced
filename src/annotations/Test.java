package annotations;


public class Test {
	
	@Deprecated
	public static void printTest() {
		System.out.println("Test");
	}
	
	@MyAnnotation
	public static void testSupress() {
		String test = "2";
		@SuppressWarnings("unused")
		int number = Integer.valueOf(test);
	}
	
	

}
