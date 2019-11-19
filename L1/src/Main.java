import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		System.out.println("Enter an integer");
		Scanner sc=new Scanner(System.in);
		int x=sc.nextInt();
		Integer ob=new Integer(x);
	System.out.println("The binary equivalent of "+ob+" is "+ob.toBinaryString(ob));
	System.out.println("The hexadecimal equivalent of "+ob+" is "+ob.toHexString(ob));
	System.out.println("The octal equivalent of "+ob+" is "+ob.toOctalString(ob));
	System.out.println("Byte value of "+ob+" is "+ob.byteValue());
	System.out.println("Short value of "+ob+" is "+ob.shortValue());
	System.out.println("Long value of "+ob+" is "+ob.longValue());
	System.out.println("Float value of "+ob+" is "+ob.floatValue());
	System.out.println("Double value of "+ob+" is "+ob.doubleValue());
	
}
}
