import java.util.Scanner;

public class handon4 {

	public static void main(String[] args) {
		System.out.println("enter string....");
		Scanner sc=new Scanner(System.in);
		String s1=sc.next();
		String a[]=s1.split(",");
		if(a[0].charAt(a[0].length()-1)==a[1].charAt(0))
		{
			
			System.out.println(a[0].substring(0, a[0].length()-1)+""+a[1]);
		}
		else
		{
			System.out.println(a[0]+""+a[1]);
		}
	}

}
