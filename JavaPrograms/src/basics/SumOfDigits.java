package basics;
import java.util.Scanner;

public class SumOfDigits {
	
	public static void main(String[]args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int num=scanner.nextInt();
		int temp;
		int sum=0;
		while(num>0) {
			temp = num%10;
			num=num/10;
			sum=sum+temp;
		}
		
		System.out.println("The sum of digits of number is : "+ sum);
	}

}
