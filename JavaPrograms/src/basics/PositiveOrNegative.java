package basics;
import java.util.Scanner;

public class PositiveOrNegative {
	
	public static void main(String[]args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the number");
		int num = scanner.nextInt();
		
		
		
		if (num>0) {
			System.out.println("The number is positive");
		}
		else if(num<0) {
			System.out.println("The number is negative");
		}
		else
			System.out.println("Zero");
	}
	
	//Using ternery operator
	//String result = num>0?"The number is positive" :"The number is negative";
	//System.out.println(result);

}
