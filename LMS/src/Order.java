import java.util.Scanner;

import material.laptops;

public class Order {
public static void main(String[]args)
{
	Scanner sc=new Scanner(System.in);
	for(int i=1;i<=1;i++)
	{
		System.out.println("enter quantity");
		int q=sc.nextInt();
		System.out.println("enter loworder");
		int lowOrder=sc.nextInt();
		laptops ob=new laptops(q,lowOrder);
		ob.orintder();
	}
}
}
