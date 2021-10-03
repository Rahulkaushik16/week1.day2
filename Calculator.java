package week1.day2.assignments;

public class Calculator {

	public int add(int num1, int num2, int num3) {
		int Sum = num1 + num2 + num3;
		System.out.println(Sum);
		return Sum;

	}

	public int sub(int num1, int num2) {
		int Diff = num1 - num2;
		System.out.println(Diff);
		return Diff;

	}

	public double mul(double num1, double num2) {
		double Multiply = num1 * num2;
		System.out.println(Multiply);
		return Multiply;

	}

	public float divide(float num1, float num2) {
		float Divide = num1 / num2;
		System.out.println(Divide);
		return Divide;

	}

}
