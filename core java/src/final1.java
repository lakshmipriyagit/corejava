
public class final1 {
 int i=10;
void display()
{
	i=25;
}
public static void main(String[]args)
	{
	final1 ob=new final1();
	ob.display();
		System.out.println(ob.i);
	}
}
