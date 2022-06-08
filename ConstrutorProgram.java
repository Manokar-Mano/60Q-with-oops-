package zsgsprogram; 

//Largest Number QN 30
class Program{
	int temp,a,b,c;
	public Program() {   //Default construtor
		a=10;
		b=15;
		c=20;
	}
	public void largestNumber() {
		temp = a > b ? a : b;
		 int largest = c > temp ? c : temp;

		System.out.println("The largest number is:" + largest + "\n");

	}
}

public class ConstrutorProgram {

	public static void main(String[] args) {
		Program p=new Program();
		p.largestNumber();
		
	

	}

}
