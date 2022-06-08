package zsgsprogram;

//without using string

	class Letter {
		char c;

		void chars() {
			while (c <= 'Z') {

				System.out.print(c);
				c++;
			}
			System.out.println();
		}
	}

	public class WithoutStringProgram {

		public static void main(String[] args) {
			Letter l = new Letter();

			l.c = 'X';
			l.chars();
			l.c = 'M';
			l.chars();
		
		}

	}



