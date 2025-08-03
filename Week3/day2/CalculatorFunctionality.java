package week3.day2;

public class CalculatorFunctionality {

	// add

	public void addNumbers(int a, int b) {
		System.out.println(a + b);

	}
	
	public void addNumbers(float a, float b) {
		System.out.println(a + b);

	}

	public void addNumbers(int a, int b, int c) {
		System.out.println(a + b + c);

	}
	
	public static void main(String[] args) {
		CalculatorFunctionality calc=new CalculatorFunctionality();
		calc.addNumbers(4,3);
		calc.addNumbers(2, 3, 4);
		calc.addNumbers(2.5f, 3.5f);
	}

}
