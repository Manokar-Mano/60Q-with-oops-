package zsgsprogram;

import java.util.Scanner;

//using Interface

interface ArraysAA {

	void evenOradd();

	void largestArray();

	void smallestArray();

	void evenPosition();

	void oddPosition();

	void countArray();

	void copyArray();

	void leftRotateArray();

	void duplicateElementArray();

	void sumOfArray();

}

class ArraysBB implements ArraysAA {
	// Even or odd QN 28
	public void evenOradd() {
		int a[] = { 1, 2, 5, 6, 3, 8 };
		System.out.println("odd numbers:");
		for (int i = 0; i < a.length; i++) {
			if (a[i] % 2 != 0) {
				System.out.println(a[i]);

			}

		}

		System.out.println("Even numbers:");
		for (int i = 0; i < a.length; i++) {

			if (a[i] % 2 == 0) {
				System.out.println(a[i]);

			}

		}
		System.out.println();
	}

	// largest element Array Qn 38
	public void largestArray() {
		int[] ar = new int[] { 25, 11, 12, 5, 80, 56 };
		int max = ar[0];
		for (int i = 0; i < ar.length; i++) {

			if (ar[i] > max)
				max = ar[i];

		}

		System.out.println("Largest element present in given array:" + max);

	}

	// Smallest Array QN 39
	public void smallestArray() {
		int[] ar = new int[] { 25, 11, 12, 5, 80, 56 };
		int min = ar[0];
		for (int i = 0; i < ar.length; i++) {

			if (ar[i] < min)
				min = ar[i];

		}

		System.out.println("smallest element present in given array:" + min);

	}
	// Even Position QN 36

	public void evenPosition() {
		int[] ar = new int[] { 1, 2, 3, 4, 5 };

		System.out.println("Elements of given array present on even position:");
		for (int i = 1; i < ar.length; i = i + 2) {
			System.out.println(ar[i]);
		}
	}

	// Copy Array QN 41
	public void copyArray() {
		int ary[] = { 1, 2, 6, 90, 4, 6 };
		int ary1[] = new int[ary.length];

		System.out.println("Copy Array ary1[]  :");
		for (int i = 0; i < ary.length; i++) {
			ary1[i] = ary[i];
			System.out.println(ary1[i] + " " + "\n");
		}

	}

	// Left Rotate Array QN 43
	public void leftRotateArray() {
		int[] ar = new int[] { 1, 2, 3, 4, 5 };
		int n = 3;

		System.out.println("original array:");
		for (int i = 0; i < ar.length; i++) {

			System.out.println(ar[i] + " ");

		}
		for (int i = 0; i < n; i++) {
			int j, first;
			first = ar[0];
			for (j = 0; j < ar.length - 1; j++) {

				ar[j] = ar[j + 1];
			}
			ar[j] = first;
		}
		System.out.println();
		System.out.println("Array after left rotation:");
		for (int i = 0; i < ar.length; i++) {
			System.out.println(ar[i] + " " + "\n");
		}

	}

	// Right Rotation QN 46
	public void rotateRight() {
		int[] ar = new int[] { 1, 2, 3, 4, 5 };
		int n = 3;
		System.out.println("OriginalArray  :");
		for (int i = 0; i < ar.length; i++) {
			System.out.println(ar[i] + " ");

		}
		for (int i = 0; i < n; i++) {
			int j, last;
			last = ar[ar.length - 1];
			for (j = ar.length - 1; j > 0; j--) {
				ar[i] = ar[j - 1];
			}
			ar[0] = last;

		}
		System.out.println();
		System.out.println("Array after right rotation  :");
		for (int i = 0; i < ar.length; i++) {
			System.out.println(ar[i] + " " + "\n");
		}
	}

// odd Position QN37

	public void oddPosition() {
		int[] ar = new int[] { 1, 2, 3, 4, 5 };

		System.out.println("Elements of given array present on odd position:");
		for (int i = 0; i < ar.length; i = i + 2) {
			System.out.print(ar[i] + "\n");

		}
	}

	// Count Array QN 40
	public void countArray() {
		int[] ar = new int[] { 1, 2, 3, 4, 5 };

		System.out.println("Number of elements present in given array:" + ar.length + "\n");

	}

	// Duplicate Element Array QN 44
	public void duplicateElementArray() {
		System.out.println("Duplicate Element Array");
		int ara[] = { 1, 2, 3, 4, 2, 3, 5, 5, 7, 6 };
		for (int i = 0; i < ara.length; i++) {
			for (int j = i + 1; j < ara.length; j++)

			{
				if (ara[i] == ara[j])

				{
					System.out.println(ara[j] + "\n");
				}
			}
		}

	}

	// sum of the element of Array QN 45
	public void sumOfArray() {
		int[] ar = new int[] { 1, 2, 3, 4, 5 };
		int sum = 0;
		for (int i = 0; i < ar.length; i++) {
			sum = sum + ar[i];
			System.out.println("Sum of all the elements of an Array  :" + sum + "\n");
		}
	}
}

public class ArrayProgram extends ArraysBB {
	public void output() {
		ArrayProgram a = new ArrayProgram();
		Scanner s = new Scanner(System.in);
		System.out.println("Enter select case number 1 To 9");
		switch (s.nextInt()) {
		case 1:
			a.largestArray();
			break;
		case 2:

			a.smallestArray();
			break;
		case 3:
			a.evenPosition();
			break;
		case 4:
			a.oddPosition();
			break;
		case 5:
			a.countArray();
			break;
		case 6:
			a.copyArray();
			break;
		case 7:
			a.leftRotateArray();
			break;
		case 8:
			a.duplicateElementArray();
			break;
		case 9:
			a.sumOfArray();
			break;
		}
	}

	public static void main(String[] args) {
		new ArrayProgram().output();
	}
}
