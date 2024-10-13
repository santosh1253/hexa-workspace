package multithreading;

public class RunnablExample  {


	public static void main(String[] args) {
		Runnable r = RunnablExample::printNumbers;
		Thread t = new Thread(r);
		t.setName("guru");
		t.start();
		Thread t1=new Thread(r);
		t1.setName("pavan");
		t1.setPriority(Thread.MAX_PRIORITY);
		t1.start();
		Thread t2=new Thread(r);
		t2.setName("santosh");
		t2.setPriority(Thread.NORM_PRIORITY);
		t2.start();
		
	}
	synchronized public static void printNumbers()
	{
		for(int i=0;i<10;i++)
		{
			System.out.println(i+" "+Thread.currentThread().getName());
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

	
}
