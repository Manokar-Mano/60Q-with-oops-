package zsgsprogram;
//Getter Setter method QN 17
class Circle{
	private double pi;
	 public double getPi() {
		return pi;
	}
	public void setPi(double d) {
		this.pi = d;
	}
	private int X;
	public int getX() {
		return X;
	}
	public void setX(int x) {
		X = x;
	}
	public int getY() {
		return Y;
	}
	public void setY(int y) {
		Y = y;
	}
	private int Y;

double Area() {
	// calculate outer circle
			double outerCircle = pi * X* X;
			// calculate inner circle
			double innerCircle = pi * Y * Y;
			return outerCircle-innerCircle ;
			
}
	
}
public class ConcentricCircle {

	public static void main(String[] args) {
		Circle C=new Circle();
		C.setX(10);
		C.setY(5);
		C.setPi(3.1415926536);
		System.out.println("Concentric Circle value" + C.Area());

	}

}
