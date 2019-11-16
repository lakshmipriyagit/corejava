
public class A {
	String username="lucky";
	double salary=40000;
A()
{
	this("siva",90000);
	System.out.println("default...");
	
}
public A(String username,double salary)
{
	this.username=username;
	this.salary=salary;
	System.out.println("parameterized...");
	
}
class B{}

public static void main(String[] args) {
		A ob=new A();
		System.out.println(ob.username+" "+ob.salary);
		System.out.println(ob instanceof A);
		
	}

}
