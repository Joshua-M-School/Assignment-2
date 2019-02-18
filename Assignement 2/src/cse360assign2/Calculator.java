package cse360assign2;

public class Calculator {

	private int total; //this value will be added, subtracted, multiplied, and divided from
	/**
	 * Constructor for Calculator class, does not need any parameters
	 */
	public Calculator () {
		total = 0;  // not needed - included for clarity
	}
	
	/**
	 * Returns the total value from all add, subtract, multiply, and divide methods
	 * @return total
	 */
	public int getTotal () {
		return 0;
	}
	
	/**
	 * Adds the given value to the total
	 * @param value
	 */
	public void add (int value) {
		
	}
	
	/**
	 * Subtracts the given value from the total
	 * @param value
	 */
	public void subtract (int value) {
		
	}
	
	/**
	 * Multiplies the total value by the given value
	 * @param value
	 */
	public void multiply (int value) {
		
	}
	
	/**
	 * Divides the total by the given value
	 * @param value
	 */
	public void divide (int value) {
		
	}
	/**
	 * Returns the history of all methods used on the total <br>
	 * For example, calling the methods in this order: <br> <br>
	 * add (4); <br>
	 * subtract (2); <br>
	 * multiply (2); <br>
	 * add(5); <br> <br>
	 * Returns the String: <br>
	 * "0 + 4 –2 * 2 + 5"
	 * 
	 * @return history
	 */
	public String getHistory () {
		return "";
	}
}
