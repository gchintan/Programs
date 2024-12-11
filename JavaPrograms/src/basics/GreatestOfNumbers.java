 package basics;
 import java.util.Scanner;

public class GreatestOfNumbers {
	public static void main(String[]args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter the first number: ");
		int a = scanner.nextInt();
		System.out.println("enter the second number: ");
		int b = scanner.nextInt();
		System.out.println("enter the third number: ");
		int c = scanner.nextInt();
		
		if((a>b)&&(a>c)) {
			System.out.println(a + "is the greatest");
		}
		else if((b>a)&&(b>c)) {
			System.out.println(b + "is the greatest");
			
		}
		else {
			System.out.println(c + "is the greatest");
		}
			
		//// find the largest b/w num1 and num2 & store in temp
	    //temp = num1>num2 ? num1:num2;
	    
	    // find the largest b/w temp and num3 & finally printing it
	    //result = temp>num3 ? temp:num3
		
	}

}
