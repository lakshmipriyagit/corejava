import java.util.Scanner;

public class handson {

	public static void main(String[] args) {
		System.out.println("enter string....");
		Scanner sc=new Scanner(System.in);
		String s1=sc.next();
		for(int i=1;i<=s1.length();i++)
			System.out.print(s1.substring(0,2));
		
	}

}