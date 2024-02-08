package interview_program;

public class SwapNumber {

	public static void main(String[] args) {

		//Logic 1: using third variable
		int a = 10;
		int b = 20;
		System.out.println("before swapping : "+a+":"+b);

		int c= a;
		a=b;
		b=c;
		System.out.println("after swapping : "+a+":"+b);

		//Logic 2: using + and - operator(without 3rd variable)
		int x = 10;
		int y = 20;
		System.out.println("before swapping : "+x+":"+y);

		x=x+y;
		y=x-y;
		x=x-y;

		System.out.println("after swapping : "+x+":"+y);

		//Logic 2: using * and / operator(without 3rd variable)
		int p = 10;
		int q = 20;
		System.out.println("before swapping : "+p+":"+q);

		p=p+q;
		q=p-q;
		p=p-q;

		System.out.println("after swapping : "+p+":"+q);
	}

}
