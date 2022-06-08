package zsgsprogram;

import java.util.ArrayList;
import java.util.Collections;

public class MergeArray {

	public static void main(String[] args) {
		int ar1[] = { 2, 4, 5, 6, 7, 9, 10, 13 };
		int ar2[] = { 2, 3, 4, 5, 6, 7, 8, 9, 11, 15 };
		ArrayList<Integer> Arr = new ArrayList<>();
		for (int i = 0; i < ar1.length; i++) {
			Arr.add(ar1[i]);
		}
		for (int i = 0; i < ar2.length; i++) {
			Arr.add(ar2[i]);
		}
		ArrayList<Integer> A = new ArrayList<>();
		for (int i = 0; i < Arr.size(); i++) {
			if (!A.contains(Arr.get(i))) {
				A.add(Arr.get(i));
			}
		}
		Collections.sort(A);
		System.out.println(A);
	}
}
