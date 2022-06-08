package zsgsprogram;


//USing Abstract Class and method

abstract class Square {

	abstract void square();

	abstract void cylinder();

	void factorialNumber() {

		int i, fact = 1;
		int number = 5;
		for (i = 1; i <= number; i++) {
			fact = fact * i;

		}
		System.out.println("Factorial of" + number + "is:" + fact);

	}

}

class Rectangle extends Square {
	void square() {
		int s = 10;
		int area = s * s;
		System.out.println("Square of Area   :" + area);

	}

	public void rectangle() {
		int width = 5;
		int height = 10;
		int area = width + height;
		System.out.println("Rectangle of Area  :" + area);
	}

	public void cylinder() {
		double radius = 20.1;
		double height = 10.2;
		double volume = ((22 * radius * radius * height) / 7);
		System.out.println("Cylinder of Area of  :" + volume);
	}
}

class QuotientReaminder extends Rectangle {
	int num1 = 5, num2 = 10;

	public void quotientRemainder() {
		int quotient = 0, remainder = 0;

		quotient = num1 / num2;
		remainder = num1 % num2;
		System.out.println("quotient" + "num1+num2" + "is:" + quotient);

		System.out.println("remainder" + "num1+num2" + "is:" + remainder);
	}
}

public class Shapes {

	public static void main(String[] args) {
		QuotientReaminder C = new QuotientReaminder();
		C.square();
		C.rectangle();
		C.cylinder();
		C.quotientRemainder();
		C.factorialNumber();

	}

}
