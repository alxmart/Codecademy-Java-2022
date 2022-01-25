package java_introductions_variables;
public class Casting {
	
	public static void main(String[] args) {


		double numDouble = 12.99;
		System.out.println("Double value: " + numDouble);
		
		// convert a double to int
		int numInt = (int) numDouble;
		System.out.println("Int value: " + numInt);
		
		double numDouble2 = 12.99;
		System.out.println("Double value: " + numDouble);
		
		// convert a double to an int rounded to nearest value
		int numInt2 = (int) (numDouble2 + 0.5);
		System.out.println("Int value: " + numInt2);
		
		System.out.println("Min: " + Integer.MIN_VALUE); // Prints: Min: -2147483648
		System.out.println("Max: " + Integer.MAX_VALUE); // Prints: Max: 2147483647

}
	
}