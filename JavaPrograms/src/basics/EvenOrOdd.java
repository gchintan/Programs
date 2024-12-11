package basics;
import java.util.Scanner;

public class EvenOrOdd {
	public static void main(String[]args) {
		Scanner scanner=  new Scanner(System.in);
		System.out.println("Enter the number");
		int num = scanner.nextInt();
		
		if(num%2==0) {
			System.out.println("The number is even");
		}
		else {
			System.out.println("The number is odd");
		}
		//using ternery operator
		//String result = num%2==0?"Even number":"Odd number"
		//System.out.println(result);
		
		//using bitwise operator
		//static bool isEven(int number){
		//return (!(number&1)); 
		//n&1 is 1, then odd , else even
	}

}
