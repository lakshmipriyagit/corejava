
public class arithmetic {
	
		void disp(int a,int b)throws division
		{
			if(b==0)
			{
				System.out.println("Arithmetic exception....");
			}
			else
			{
				System.out.println(a/b);
			}
		}
		public static void main(String[] args) throws division
		{
			arithmetic ob=new arithmetic();
			ob.disp(6, 2);

		}

	

}
