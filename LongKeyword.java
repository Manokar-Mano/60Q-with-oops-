package zsgsprogram;

//Static Inner Class
class OuterClass {
	static long min = -923456L;
	static long max = 9324568L;

	static class InnerClass {
		void display() {
			System.out.println("min" + min);
			System.out.println("max" + max);

		}
	}
}

public class LongKeyword {

	public static void main(String[] args) {
		OuterClass.InnerClass i = new OuterClass.InnerClass();
		i.display();

	}

}
