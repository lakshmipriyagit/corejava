import java.util.Scanner;

public class Main {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in) ;
	int n=sc.nextInt();
	int s=1;
	for(int i=n;i>=1;i--)
	{
		for(int j=1;j<=i;j++)
		{
			System.out.print("b");
		}
		if(i!=n)
		{
			for(int k=1;k<=s;k++)
			{
				System.out.print("*");	
			}
		s=s+2;
		}
	for(int j=i;j>=1;j--)
	{
		if(j!=n)
		System.out.print("b");
	}
	System.out.println();
	}
	System.out.println();
}
}
