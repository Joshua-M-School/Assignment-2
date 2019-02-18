package cse360assign2;

public class Main {
	
	public static Calculator calc = new Calculator();
	
	public static void main(String[] args) {
		calc.add(10);
		System.out.println(calc.getTotal());
		calc.subtract(5);
		System.out.println(calc.getTotal());
		calc.multiply(2);
		System.out.println(calc.getTotal());
		calc.divide(3);
		System.out.println(calc.getTotal());
		System.out.println(calc.getHistory());
	}
	
}
