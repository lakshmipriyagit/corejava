
public class wrapper {
static void change(Integer i)
{
	System.out.println("integer");
}
static void change(Number i)
{
	System.out.println("number");
}

public static void main(String[] args) {
	byte b1=45;
	change(45);
}
}
