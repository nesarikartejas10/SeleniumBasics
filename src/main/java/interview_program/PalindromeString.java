package interview_program;

import java.util.Scanner;

public class PalindromeString {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a string : ");
		String s = sc.nextLine();
		
		String rev = "";
		String orgStr = s;
		
		for(int i=s.length()-1; i>=0;i--)
		{
			rev = rev + s.charAt(i);
		}
		
		if(orgStr.equals(rev))
		{
			System.out.println("Given string is palindrome");
		}
		else
		{
			System.out.println("Given string is not palindrome");
		}
		sc.close();
	}

}
