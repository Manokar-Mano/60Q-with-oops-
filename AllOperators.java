package zsgsprogram;
//using Multiple Inheritance 

import java.util.Scanner;

interface operatorA {
	void program18();

	void program19();

	void program20();

}

interface operatorB {
	void program21();

	void program23();

}

class OperatorC implements operatorA, operatorB {
	Scanner sc = new Scanner(System.in);

	@Override
	public void program21() {
		System.out.println("enter the value of y");
		int y = sc.nextInt();
		int z = (++y * (y++ + 5));
		System.out.println(z);

	}

	@Override
	public void program23() {
		System.out.println("enter the value of x");
		int x = sc.nextInt();
		int x1 = ++x - x++ + -x;
		System.out.println("output of 23" + x1);

	}

	@Override
	public void program18() {
		System.out.println("enter the value of a");

		int a = sc.nextInt();
		System.out.println("enter the value of b");
		int b = sc.nextInt();
		System.out.println("++a-b-- =" + " " + (++a - b--));
		System.out.println("a%b++ =" + " " + (a % b++));
		System.out.println("a*=b+5 =" + " " + (a *= b + 5));
		System.out.println("69>>>2 =" + " " + (69 >>> 2));

	}

	@Override
	public void program19() {
		System.out.println("enter the value of a");
		int a = sc.nextInt();
		a += a++ + ++a + --a + a--;
		System.out.println("output of 19=" + a);

	}

	@Override
	public void program20() {
		System.out.println("enter the value of x");
		int x = sc.nextInt();
		x = x++ * 2 + 3 * -x;
		System.out.println("20th output=" + x);

	}

}

public class AllOperators extends OperatorC {

	public void input() {
		AllOperators A = new AllOperators();
		Scanner sc = new Scanner(System.in);
		System.out.println("enter 1  18th Program");
		System.out.println("enter 2 19th Program ");
		System.out.println("enter 3 20th Program");
		System.out.println("enter 4 21th Program");
		System.out.println("enter 5 22th Program");
		System.out.println("enter 6 23rd Program");

		switch (sc.nextInt()) {
		case 1:
			A.program18();
			break;
		case 2:
			A.program19();
			break;
		case 3:
			A.program20();
			break;
		case 4:
			A.program21();
			break;
		case 5:
			A.program23();
			break;
		}
	}

	public static void main(String[] args) {
		new AllOperators().input();

	}
}
