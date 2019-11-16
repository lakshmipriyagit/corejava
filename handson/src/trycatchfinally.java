import java.util.Scanner;

public class trycatchfinally {
	
	public static void main(String[] args) {
		System.out.println("enter a value");
	Scanner sc=new Scanner(System.in);
	String a=sc.next();
	System.out.println("enter b value");
	String b=sc.next();
	try
	{
		int x=Integer.parseInt(a);
		int y=Integer.parseInt(b);
		System.out.println(x/y);
	}
	catch(ArithmeticException e)
	{
		System.out.println("devide by zero exception caused");
	}
	finally
	{
		System.out.println("Inside finally block");
	}
}
}
