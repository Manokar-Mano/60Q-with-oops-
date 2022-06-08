package zsgsprogram;
//Normal Method Program

class ExtraProgram {
	// VowelOr Consonant QN 29
	public void vowelOrConsotant() {
		char ch = 'i';
		if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
			System.out.println(ch + " " + "is Vowel");
		} else {
			System.out.println(ch + "is Consonant");
		}

	}

	// Positive Or Negative QN 32 //
	public void positiveOrNegative() {
		int num = 10;

		if (num > 0) {
			System.out.println("The number is positive");
		} else if (num < 0) {
			System.out.println("The number is negative");

		} else {
			System.out.println("The number is zero");
		}

	}

	// Alphabatic Or Not QN 33
	public void alphabaticOrNot() {
		System.out.println();
		int point1 = 67;
		int point2 = 39;
		int point3 = 83;
		boolean checkAlp1 = Character.isAlphabetic(point1);
		if (checkAlp1) {
			System.out.println("point   " + (char) point1 + "  " + "is an alphabet");
		} else {
			System.out.println("point  " + (char) point1 + "is not an alphabet");
		}
		boolean checkAlp2 = Character.isAlphabetic(point2);
		if (checkAlp2) {
			System.out.println("point  " + (char) point2 + "is an alphabet");
		} else {
			System.out.println("point  " + (char) point2 + "is not an alphabet ");
		}
		boolean checkAlp3 = Character.isAlphabetic(point3);
		if (checkAlp3) {
			System.out.println("point  " + (char) point3 + " " + "is an alphabet");
		} else {
			System.out.println("point  " + (char) point3 + "is not an alphabet");
		}
		System.out.println();

	}

	// Recursion Reverse QN 52(1)
	public void reverseString1() {
		System.out.println("Recursion Reverse String :");
		String s[] = "one two three".split(" ");

		String a = " ";
		for (int i = s.length - 1; i >= 0; i--) {

			a += s[i] + " ";
		}

		System.out.println(a.substring(0, a.length() - 1) + "\n");

	}

	// Recursion Reverse QN 52(2)
	public void reverseStrig2() {
		System.out.println("Recursion Reverse String :");

		String s[] = "i love india".split(" ");

		String a = " ";
		for (int i = s.length - 1; i >= 0; i--) {

			a += s[i] + " ";
		}

		System.out.println(a.substring(0, a.length() - 1) + "\n");

	}
}

public class AllPrograms {
	public static void main(String[] args) {
		ExtraProgram E = new ExtraProgram();
		E.vowelOrConsotant();
		E.positiveOrNegative();
		E.alphabaticOrNot();
		E.reverseString1();
		E.reverseStrig2();

	}
}
