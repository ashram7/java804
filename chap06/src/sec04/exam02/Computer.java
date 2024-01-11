package sec04.exam02;

public class Computer {
	int sum1(int[] values) { // var values = {1, 2, 3}
		int sum = 0;
		for(int i=0; i<values.length; i++) {
			sum += values[i];
		}
		return sum;
	}
	
	int sum2(int ... values) {// var values = {1, 2, 3}
		int sum = 0;
		for(int i=0; i<values.length; i++) {
			sum += values[i];
		}
		return sum;
	}
}
