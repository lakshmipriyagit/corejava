
public class edemo {

	public static void main(String[] args) {
		System.out.println("hi...");
		try{
			String s=args[0];
			int n=Integer.parseInt(s);
			int c=10/n;
			System.out.println(n);
		}
		catch(ArrayIndexOutOfBoundsException i)
		{
			System.out.println("ArrayIndexOutOfBounds exception...");
		}
		catch (NumberFormatException  e) {
			System.out.println(e.getMessage());
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("hello...");

	}

}
