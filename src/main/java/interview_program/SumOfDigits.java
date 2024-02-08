package interview_program;

import java.util.Scanner;

public class SumOfDigits {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number : ");
		int num = sc.nextInt();
		int sum = 0;
		
		while(num>0)
		{
			int rem = num%10;
			sum = sum + rem;
			num = num/10;
		}
		
		System.out.println("sum of digits are : "+sum);
		sc.close();
		
	}

}
