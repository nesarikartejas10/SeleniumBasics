package interview_program;

public class FibonacciSeries {

	//fibonacci no is starts with 0 and 1 after that each no is sum of two preceeding nos.
	public static void main(String[] args) {
		
		int n1=0, n2=1;
		int sum = 0;
		
		System.out.print(n1+" "+n2);
		
		for(int i=2; i<=10; i++)
		{
			sum = n1+n2;
			System.out.print(" "+sum+" ");
			n1=n2;
			n2=sum;
		}
	}

}
