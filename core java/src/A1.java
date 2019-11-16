public class A1 {
	String username="lucky";
	double salary=40000;
A1()
{
	
	System.out.println("default...");
	
}
public static void main(String[] args) {
	A ob=new A();
	 	ob.username="siva";
	 	ob.salary=90000;
	System.out.println(ob.username+" "+ob.salary);
	A ob1=new A();
	System.out.println(ob1.username+" "+ob1.salary);
}
}