package week1.day2;

public class IsPrimeNumber {

	public static void main(String[] args) {
         
		int number= 3;
		boolean isPrime=true;
		if(number<=1) {
			isPrime=false;
		}
		else {
			for (int i = 2; i <=number-1; i++) {
				if(number % i==0) {
					System.out.println(number+" is divisible by " +i);
					isPrime=false;
					break;
				}
			}
		}
		
		if(isPrime) {
			System.out.println(number +" is a prime number");
		}
		else {
			System.out.println(number +" isn't a prime number");
		}
	}
}
