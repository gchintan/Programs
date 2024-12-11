package basics;
import java.util.Scanner;

public class PrimeNoInRange {
	
	public static void main(String[]args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the first value: ");
		int num1=scanner.nextInt();
		System.out.println("Enter the second value: ");
		int num2=scanner.nextInt();
		
		for (int i=num1;i<=num2;i++) {
			if(isPrime(i))
				System.out.println(i);
		}
	}
	
	static boolean isPrime(int n) {
		int count=0;
		if(n<2)
			return false;
		for(int i=2;i<n/2;i++) {
			if(n%i==0)
				return false;
		}
		return true;		
	}

}
