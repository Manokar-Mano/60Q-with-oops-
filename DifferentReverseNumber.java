package zsgsprogram;

//QN 3
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


	public class DifferentReverseNumber {

	public void main(String[] args) throws IOException {
		int i, rem, cal = 0;

		// Scanner Alternate BufferReader using
		BufferedReader Buffer_Reader = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the value");
		int a = Integer.parseInt(Buffer_Reader.readLine());
		int temp = a;

		while (a != 0) {
			rem = a % 10;
			cal = (cal * 10) + rem;
			a = a / 10;

		}
		System.out.println(cal);
		System.out.println(temp);
		int result = temp - cal;
		System.out.println(result); 

	}

}

	
