package practise;

public class Test2  {

public static void main(String[] args) {
	
	String s="madam";
	String rev="";
	String orgStr=s;
	
	for(int i=s.length()-1; i>=0;i--)
	{
		rev=rev+s.charAt(i);
	}
	if(orgStr.equals(rev))
	{
		System.out.println("string is palindrom");
	}
	else {
		System.out.println("string is not palindrom");
	}
}
	
}