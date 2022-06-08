package zsgsprogram;

//Nested inner class
class Outer {
	char ch1 = 'A';

	class Inner {

		char ch2 = 'B';

		public void ascii() {
			int asciivalue1 = ch1;
			int asciivalue2 = ch2;
			System.out.println("The ASCII value of" + ch1 + "is:" + asciivalue1);
			System.out.println("The ASCII value of" + ch2 + "is:" + asciivalue2 );

		}

	}
}

public class AsciiValueProgram {
	public static void main(String args[]) {
		Outer.Inner i = new Outer().new Inner();
		i.ascii();

	}

}
