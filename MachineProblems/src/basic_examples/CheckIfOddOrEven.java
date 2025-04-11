/**
 * 
 */
package basic_examples;

public class CheckIfOddOrEven {
	
	String message;
	
	final int number;
	public CheckIfOddOrEven(int number){
		this.number = number;
		
		printIsOddOrEven(oddOrEvenModuloIf(number));
		printIsOddOrEven(oddOrEvenModuloIfElse(number));
		printIsOddOrEven(oddOrEvenModuloShortIfElse(number));
		
		System.out.println("Testing using recursion");
		printIsOddOrEven(oddOrEvenRecursion(number));
		
	}
	/*
	 * if using modulo operator
	 *  @param number apply modulo operator to check if the number is odd or even
	 *  if equals to 1 the number is odd if 0 the number is even
	 */
	boolean oddOrEvenModuloIf(int number) {
		System.out.println("Testing using if modulo");
		boolean isOdd = false;
		if(number%2==1)
			isOdd = true;
		return isOdd;						
	}
	/*
	 * if-else using modulo operator
	 *  @param number apply modulo operator to check if the number is odd or even
	 *  if equals to 1 the number is odd if 0 the number is even
	 */
	boolean oddOrEvenModuloIfElse(int number) {
		System.out.println("Testing using if-else modulo");
		boolean isOdd;
		if(number%2==1)
			isOdd = true;
		else 
			isOdd = false;
		return isOdd;						
	}
	
	/*
	 * shorthand if-else version Using modulo operator
	 *  @param number apply modulo operator to check if the number is odd or even
	 *  if equals to 1 the number is odd if 0 the number is even
	 */
	boolean oddOrEvenModuloShortIfElse(int number) {
		System.out.println("Testing using short if-else modulo");
		return number%2==1 ? true : false;					
	}
	
	/*
	 * recursion - not efficient but just for example
	 *  @param number apply modulo operator to check if the number is odd or even
	 *  if equals to 1 the number is odd if 0 the number is even
	 */
	boolean oddOrEvenRecursion(int number) {
		if (number == 0) return false;
		if (number == 1) return true;
		return oddOrEvenRecursion(number-2);
	}
	
	/*
	 * @param isOdd boolean to check if the number is odd or even
	 * true if add even if false
	 */
	void printIsOddOrEven(boolean isOdd) {	 
		 String text = isOdd ? "odd" : "even";
		 System.out.println("The number is " + text);
	}
	
	
}
