package sec02.exam06;

public class Test1 {

	public static void main(String[] args) {
		int total = 0;
		int i = 0;
		while (i<10) { // t=45,  i=10   
			i++; //i = 9(10)
			total+=i; //total(55) = total(45) + i(10)
			System.out.print(i); //1+2+3+...+9+10=55
			if(i!=10) { 
				System.out.print("+");
			}
		}
		System.out.println("=" + total);
	}
}
