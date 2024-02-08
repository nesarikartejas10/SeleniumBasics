package interview_program;

import java.util.Scanner;

public class PalindromeNumber {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number : ");

		int num = sc.nextInt();
		int rev =0;
		int orgNum = num;
		
		while(num>0)
		{
			rev = rev*10 + num%10;
			num = num/10;
		}
		
		if(orgNum==rev)
		{
			System.out.println("Given number is palindrome");
		}
		else {
			System.out.println("Given number is not palindrome");
		}
		sc.close();
	}

}
