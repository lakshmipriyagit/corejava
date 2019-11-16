
public class nestedclass {

	private int data=30;
	class inner
	{
		void msg()
		{
			System.out.println("data is "+data);
		}
	}
	public static void main(String[] args) {
		nestedclass ob=new nestedclass();
		//System.out.println(ob.new inner());
		nestedclass.inner in=ob.new inner();
		in.msg();
	}

}
