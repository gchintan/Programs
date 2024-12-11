package basics;
import java.util.Scanner;

public class PrimeNumber {
	
	public static void main(String[]args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int num = scanner.nextInt();
		
		boolean isPrime = true;
		
		if(num<2) {
			isPrime=false;
		}
		else if(num==2) {
			isPrime=true;
		}
		else if(num%2==0) {
			isPrime=false;
		}
		else {
			for (int i=3;i<num/2;i=i+2) {
				if(num%i==0) {
					isPrime=false;
					break;
				}
			}
		}
		
		if(isPrime) {
			System.out.println("Prime number");
		}
		else {
			System.out.println("not prime");
		}
		
		
		
	}

}
