
public class thread1 implements Runnable
{

	public void run()
	{
		for(int i=0;i<=10;i++)
		{
			System.out.println(Thread.currentThread().getName()+" "+i);
		}
	}
	public static void main(String[] args) {
		thread1 ob=new thread1();
		Thread t1=new Thread(ob,"hello");
		
		t1.start();

	}

}
