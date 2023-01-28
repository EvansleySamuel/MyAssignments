package week3.day1;

//Overloading
public class Calculator {
	public static void main(String[] args) {
		Calculator value = new Calculator();
		value.add(2, 2, 3);
		value.add(4, 4);
		value.multiply(3.22, 6.44);
		value.multiply(2, 23.134);

	}

	public void add(int num1, int num2) {
		System.out.println(num1 + num2);
	}

	public void add(int num1, int num2, int num3) {
		System.out.println(num1 + num2 + num3);
	}

	public void multiply(double num1, double num2) {
		System.out.println(num1 * num2);
	}

	public void multiply(int num1, double num2) {
		System.out.println(num1 * num2);
	}

}
