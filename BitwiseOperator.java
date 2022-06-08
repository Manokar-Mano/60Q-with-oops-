package zsgsprogram;

import java.util.Scanner;

public class BitwiseOperator {
	
	int a,b;
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value");
		int a=sc.nextInt();
		int b=sc.nextInt();
		System.out.println("a&b is"+(a&b));
		
		System.out.println("a|b is"+(a|b));
		
		System.out.println("a^b is"+(a^b));
		
		System.out.println("~k is"+~a);
		
		
		

	}

}
