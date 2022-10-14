package interviewprgrms;

public class ThreadDemo implements Runnable
{
	public void run()
	{
		for(int i=1;i<4;i++)
		{
			System.out.println("hey threa1 started");
		}
	}
	public static void main(String[] args)
	{
		ThreadDemo td1 = new ThreadDemo();
		Thread t1= new Thread(td1);
		t1.start();
		
		ThreadDemo td2 = new ThreadDemo();
		Thread t2 = new Thread(td2);
		t2.start();
	}
}