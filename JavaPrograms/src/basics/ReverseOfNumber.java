package basics;
import java.util.Scanner;

public class ReverseOfNumber {
	
	public static void main(String[]args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int num = scanner.nextInt();
		int palin=num;
		int temp;
		int rev=0;
		while(num>0) {
			temp = num%10;
			num=num/10;
			rev=rev*10+temp;
		}
		System.out.println("THe reverse of Number is: "+ rev);
		
		if(palin==rev) {
			System.out.println("The number is palindrome");
	}else {
		System.out.println("The number is not palindrome");
	}
	
		
	}

}
