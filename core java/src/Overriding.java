class L
{
	protected L display()
	{
		System.out.println("display method....");
		return new L();
	}
}
public class Overriding extends L{
	public Overriding display()
	{
		System.out.println("display ....");
		return new Overriding();
	}	
public static void main(String[]args)
{
	Overriding ob=new Overriding();
	ob.display();
}
}
