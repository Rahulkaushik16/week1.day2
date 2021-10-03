package week1.day2.assignments;

public class MyCalculator {

	public static void main(String[] args) {
		Calculator cal = new Calculator();
		System.out.print("Addition of 23+27+30 is : ");
		cal.add(23, 27, 30);
		System.out.print("Subtraction of 107-79 is : ");
		cal.sub(107, 79);
		System.out.print("Multiplication of 15.5*11.3 is : ");
		cal.mul(15.5, 11.3);
		System.out.print("Division of 90.5/3.5 is : ");
		cal.divide(90.5f, 3.5f);

	}

}
