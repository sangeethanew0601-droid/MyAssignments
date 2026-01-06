package week1.day2;

public class FibonacciSeries {

	public static void main(String[] args) {
		
		int first = 0;
		int second = 1;
		int range=8;
		
		//print first two Fibonacci numbers
		System.out.print("Fibonacci Series are: "+first+", "+second);
		
		//for loop to generate Fibonacci series
		for (int i = 3; i <=range; i++) {
			int next = first+second;
			System.out.print(", "+next);
			first=second;
			second=next;
		}
	}

}
