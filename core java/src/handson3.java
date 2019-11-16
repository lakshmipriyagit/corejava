import java.util.Scanner;

public class handson3 {

	public static void main(String[] args) {
		System.out.println("enter string....");
		Scanner sc=new Scanner(System.in);
		String s1=sc.next();
		System.out.println(s1.substring(1,s1.length()-1));
	}

}
