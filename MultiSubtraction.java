package zsgsprogram;

import java.util.Scanner;
//Multiplication Table 
interface Table{
	void mul();
	void sub();
}

public class MultiSubtraction implements Table {

	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	@Override
	public void mul() {
		for(int i=1;i<=n;i++) {
			System.out.println(i + " * " + n + " = " + n * i);
		}
		
	}
	
	//Subtraction Table
	@Override
	public void sub() {
		System.out.println();
		for(int i=1;i<=n;i++) {
			System.out.println(i + " - " + n + " = " + (n - i));
		}
		
	}
	public static void main(String[] args) {
		MultiSubtraction M=new MultiSubtraction();
		M.mul();
		M.sub();
	}
}
