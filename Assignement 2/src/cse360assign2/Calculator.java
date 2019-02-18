package cse360assign2;

public class Calculator {

	private int total; //this value will be added, subtracted, multiplied, and divided from
	private String history; //this value stores the calculator's history
	/**
	 * Constructor for Calculator class, does not need any parameters
	 */
	public Calculator () {
		total = 0;  // not needed - included for clarity
		history = "0";
	}
	
	/**
	 * Returns the total value from all add, subtract, multiply, and divide methods
	 * @return total
	 */
	public int getTotal () {
		return total;
	}
	
	/**
	 * Adds the given value to the total
	 * @param value
	 */
	public void add (int value) {
		total = total + value;
		history = history + " + " + value;
	}
	
	/**
	 * Subtracts the given value from the total
	 * @param value
	 */
	public void subtract (int value) {
		total = total - value;
		history = history + " - " + value;
	}
	
	/**
	 * Multiplies the total value by the given value
	 * @param value
	 */
	public void multiply (int value) {
		total = total * value;
		history = history + " * " + value;
	}
	
	/**
	 * Divides the total by the given value
	 * @param value
	 */
	public void divide (int value) {
		if(value == 0 ) {
			total = 0;
		}else {
			total = total / value;
		}
		history = history + " / " + value;
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
		return history;
	}
}
