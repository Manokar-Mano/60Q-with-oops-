package zsgsprogram;

//Local Inner Class
class OuterCls {
	void display() {

		class InnerClass {
			int x = 10, y = 5, t;

			void innerDisplay() {
				System.out.println("Swapping Two Number");
				t = x;
				x = y;
				y = t;

				System.out.println("After swapping:" + x + " " + y);
			}

		}
		InnerClass i = new InnerClass();
		i.innerDisplay();
	}
}

public class SwappingProgram {

	public static void main(String[] args) {
		OuterCls c = new OuterCls();
		c.display();

	}

}
