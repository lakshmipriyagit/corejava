import java.util.Scanner;

public class handson5 {

	public static void main(String[] args) {
		System.out.println("enter first string....");
		Scanner sc=new Scanner(System.in);
		String s1=sc.next();
		System.out.println("enter second string....");
		String s2=sc.next();
		if(s1.length()<s2.length())
		{
			System.out.print(s1+""+s2+""+s1);
		}
		else if(s2.length()<s1.length())
		{
			System.out.print(s2+""+s1+""+s2);
		}
		else
			System.out.println("both strings are of same length");

	}

}