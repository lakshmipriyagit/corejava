import java.util.Scanner;

public class handson1 {

	public static void main(String[] args) {
		System.out.println("enter string....");
		Scanner sc=new Scanner(System.in);
		String s1=sc.next();
		if(s1.length()%2==0)
		{
			System.out.println(s1.substring(0,s1.length()/2));
		}
		else
			System.out.println("null");

	}

}
