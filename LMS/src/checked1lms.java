
public class checked1lms implements Runnable{
	char c[]={'h','e','l','l','o'};
	public void run()
	{
		for(int i=0;i<=10;i++)
		{
			while(i<5)
			{
				try {
					Thread.currentThread().sleep(1000);
				} 
				catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			System.out.println(c[i++]);
		}
		}
	}
public static void main(String[] args) {
	Thread t=new Thread(new checked1lms());
	t.start();
}
}
