
public class Egexception {

	public static void main(String[] args) {
		try
		{
			String s=args[0];
			int i=Integer.parseInt(s);
			//System.out.println(i);
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("ArrayIndexOutOfBoundsException");
		}
		catch(NumberFormatException e)
		{
			System.out.println("NumberFormatException");
		}
		System.out.println("hello");
	}

}
