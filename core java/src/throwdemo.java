
public class throwdemo {
	void disp(int i)throws myexception
	{
		if(i<18)
		{
			throw new myexception("age should not be less than 18");
		}
		else
		{
			System.out.println("eligible for vote  "+i);
		}
	}
	public static void main(String[] args)  throws myexception
	{
throwdemo ob=new throwdemo();
ob.disp(9);
	}

}
