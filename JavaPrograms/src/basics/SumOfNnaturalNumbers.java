package basics;
import java.util.Scanner;

public class SumOfNnaturalNumbers {
	public static void main(String[]args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int n = scanner.nextInt();
		int sum=0;
		for(int i=0;i<=n;i++) {
			sum=sum+i;
		}
		System.out.println("The sum is: "+ sum );
		
		//using formula
		//(n*(n+1)/2)
		
		
		//using recursion
		//static int getSum(int n){
		//if(n==0)
			//return n;
		//return n+getSum(n-1);
		
		//System.out.println(getSum(n));
	}

}
//for sum of number in given range
//use for loop initialize i with the first number
//use formula b*(b+1)/2-a*(a+1)/2+a
//use recursion
//getSum(int sum, int a, int b)
//if(i>b)return sum;
//return i+getSum(sum,a+1,b);