package zsgsprogram;

//using multilevel inheritance
import java.util.Scanner;

//Pattern QN 5 (1)
class EAlphabatic {
	int n = 5;

	public void alphabaticPatternE() {
		System.out.println("Letter Pattern \n");

		char ch = 'E';

		for (int i = 0; i < n; i++)

		{
			for (int j = 0; j < n - i; j++) {
				System.out.print(ch);

			}
			System.out.println();

			ch--;

		}
		
	}
}

//Pattern QN 5 (2)
class CAlphabatic extends EAlphabatic {

	int n = 3;

	public void alphabaticPatternC() {
		System.out.println("Letter Pattern \n");
		char ch = 'C';

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n - i; j++) {
				System.out.print(ch);
			}
			System.out.println();
			ch--;
		}

	}

}

//Cross Pattern QN 7
class CrossPattern extends CAlphabatic {
	int n = 5;

	public void crossPattern() {
		System.out.println("Cross pattern \n");

		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n; j++) {
				if (i == j || i + j == n + 1) {
					System.out.print(i);
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}

}

//Reverse Pyramid Star Pattern QN 49
class ReversePyramidStar extends CrossPattern {
	int n = 9, k = 1;

	public void reversePyramidStarPattern() {
		System.out.println("Reverse Pyramid Star Pattern \n");

		for (int i = 0; i <= n-1; i++) {
			for (int j = 0; j <i; j++) {
				System.out.print(" ");
			}
			for (k = 0; k < n-i; k++)

			{
				System.out.print("* ");

			}
			System.out.println();
		}

	}

}



//Number Pyramid Pattern QN 47
class NumberPyramidPattern extends ReversePyramidStar {
	int n = 9;

	public void numberPyramidPattern() {
		System.out.println("Number Pyramid Pattern \n");
		for (int i = 1; i <= n; i++) {
			for (int j = n; j > i; j--) {
				System.out.print(" ");
			}
			for (int k = 1; k <= i; k++) {
				System.out.print(k);
			}
		/*for (int l = i - 1; l >= 1; l--) {
				System.out.print(l);
			}*/
			System.out.println();
		}

	}

}

//C Star Pattern QN 55
class CStarPattern extends NumberPyramidPattern {
	int n = 4;

	public void starPatternC() {
		System.out.println("Star Pattern C Letter \n");
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n; j++) {
				if (i == 1 || i == n || j == 1) {
					System.out.print("*");
				}
			}
			System.out.println();
		}
	}

}

//Number Pyramid QN 56
class NumberPyramidSimple extends CStarPattern {
	int n = 4;
	int k = 1;

	public void numberPyramid() {
		System.out.println("Number Pyramid \n");
		for (int i = n; i >= 1; i--) {
			for (int j = 1; j <= n; j++) {
				if (j >= i) {
					System.out.print(k+" " );
					k++;
				} else {
					System.out.print(" ");

				}
			}
			System.out.println();
		}

	}

}

//Cross Pattern Reverse Number QN 57
class CrossPatternReverse extends NumberPyramidSimple {
	int n = 5;

	public void crossPatternReverse() {
		System.out.println("Cross Pattern Reverse Number \n");
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n; j++) {
				if (i == j || i + j == n + 1) {
					System.out.print(j);
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
}

public class AllPatterns {
	public static void main(String[] args) {
		CrossPatternReverse A = new CrossPatternReverse();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the program select case number 1 To 8");

		switch (sc.nextInt()) {
		case 1:
			A.alphabaticPatternE();
			break;
		case 2:
			A.alphabaticPatternC();
			break;
		case 3:
			A.crossPattern();
			break;
		case 4:
			A.reversePyramidStarPattern();
			break;
		
		case 5:
			A.numberPyramidPattern();
			break;
		case 6:
			A.starPatternC();
			break;
		case 7:
			A.numberPyramid();
			break;
		case 8:
			A.crossPatternReverse();

		}
	}
}