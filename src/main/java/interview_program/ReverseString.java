package interview_program;

import java.util.Scanner;

public class ReverseString {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a string : ");
		String s = sc.nextLine();
		
		String rev = "";
		
		for(int i=s.length()-1; i>=0; i--) {
			
			rev = rev+s.charAt(i);
		}
		
		System.out.println("Reverse string of "+s+" is : "+rev);
		sc.close();
	}

}
