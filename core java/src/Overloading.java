
public class Overloading {
	void sum(int a,long b)
	{
		System.out.println(a+b);
	}
	void sum(int a,int b,int c)
	{
		System.out.println(a+b+c);
	}
	public static void main(String[]args)
	{
		Overloading ob=new Overloading();
		ob.sum(20, 39);
		ob.sum(20, 20,30);
	}
}
