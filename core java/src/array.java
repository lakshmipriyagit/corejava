import java.util.Scanner;

public class array {
	void display(int b[])
	{
		for(int x:b)
		{
			System.out.println(x);
		}
	}
public static void main(String[]args)
{
	int a[]={10,20,30,40};
	array ob=new array();
	ob.display(a);
	
	//System.out.println("enter n value....");
	//Scanner sc=new Scanner(System.in) ;
	//int n=sc.nextInt();
	
	//System.out.println("enter 5 values....");
	//Scanner sc1=new Scanner(System.in) ;
	//for(int i=0;i<a.length;i++)
	//{
	//	a[i]=sc.nextInt();
	//}
	//for(int i=0;i<a.length;i++)
	//{
	//      System.out.println(a[i]);
	//}
	///for(int x:a)	
	////{
		//System.out.println(x);
	//}
}
}
