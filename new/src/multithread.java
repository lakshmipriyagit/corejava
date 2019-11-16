
public class multithread extends Thread{
	public void run()
	{
		for(int i=0;i<10;i++)
		{
			try
			{
				Thread.sleep(500);
			}
			catch(InterruptedException e)
			{
				System.out.println(e.getClass());
			}
				String sc=Thread.currentThread().getName();
				if(sc.equals("first"))
					System.out.println(sc+" "+i);
				else
					System.out.println(sc+" "+i);
		}
	}
	public static void main(String[] args) {
		multithread t1=new multithread();
		multithread t2=new multithread();
		t1.setName("first");
		t2.setName("second");
		t1.setPriority(MAX_PRIORITY);
		t2.setPriority(MIN_PRIORITY);
		t1.start();
		t2.start();
	}

}
