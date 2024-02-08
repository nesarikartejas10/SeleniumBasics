package interview_program;

import java.util.Scanner;

public class LargestOfThreeNumber {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter three numbers : ");
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		if(a>b&&a>c)
		{
			System.out.println("Number "+a+" is greater");
		}
		else if(b>a&&b>c)
		{
			System.out.println("Number "+b+" is greater");
		}
		else
		{
			System.out.println("Number "+c+" is greater");
		}
	}

}
