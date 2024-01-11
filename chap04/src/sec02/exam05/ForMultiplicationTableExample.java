package sec02.exam05;

public class ForMultiplicationTableExample {

	public static void main(String[] args) {
		for (int m=2; m<=9; m++) { 						// m=9
			System.out.println("*** " + m + "단 ***");   // m=2, n=1,2,3+...+9
			for (int n=1; n<=9; n++) {
				System.out.println(m + " x " + n + " = " + (m*n));
			}
		}
	}
}
