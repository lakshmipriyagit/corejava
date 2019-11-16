
public class checked implements Runnable{

	public void run()
	{
		for(int i=0;i<=10;i++)
		{
			if (i==5)
			{
				try {
					Thread.currentThread().sleep(5000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			System.out.println(Thread.currentThread().getName()+" "+i);
		}
	}
	public static void main(String[] args) {
		checked ob=new checked();
		Thread t1=new Thread(ob,"hello");
		t1.start();

	}

}


