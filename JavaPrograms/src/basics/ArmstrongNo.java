package basics;
import java.util.Scanner;

public class ArmstrongNo {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int num = scanner.nextInt();
		int len=order(num);
		
		if(armstrong(num,len)) {
			System.out.println("It is an armstrong number");
		}
		else {
			System.out.println("It is not armstrong number ");
		}

	}
	static int order(int n) {
		int len=0;
		while(n!=0) {
			len++;
			n=n/10;
		}
		return len;
	}
	
	static boolean armstrong(int num, int len) {
		int sum=0,temp,digit;
		temp=num;
		
		while(temp>0) {
			digit=temp%10;
			sum=sum+(int)Math.pow(digit, len);
			temp=temp/10;
		};
		
		return num == sum;
		
		
	}

}
