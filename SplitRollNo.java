package zsgsprogram;

import java.util.Scanner;

public class SplitRollNo {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Number Of Students Roll No");
		int n = scanner.nextInt();
		int m = n / 5;
		for (int i = 1; i <= m; i++) {
			System.out.println("Group No" + i);
			int r = 100 + i;
			for (int j = 1; j <= n / m; j++) {
				System.out.println(r);
				r += m;
			}
		}

	}

}
