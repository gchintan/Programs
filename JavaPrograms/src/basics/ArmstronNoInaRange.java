package basics;

import java.util.Scanner;

public class ArmstronNoInaRange {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the range: ");
		int num1=scanner.nextInt();
		int num2=scanner.nextInt();
		System.out.println("Armstrong numbers are: ");
		
		
		for (int i=num1;i<=num2;i++) {
			int sum=0;
			int num=i;
			int len=order(i);
			
			while(num>0) {
			
			int temp=num%10;
			num=num/10;
			sum=sum+(int)Math.pow(temp, len);
			};
			
		
		if (sum==i){
			System.out.println(i+" ");
		}
			
		 
		}
	}
	
	
	static int order(int n) {
		int i=0;
		while(n!=0) {
			i++;
			n=n/10;
		}
		return i;
	}

}
