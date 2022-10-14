package interviewprgrms;

public class ThreadExample extends Thread {
		
//implementing thread using Thread class
		public void run()
		{
			for(int i=0;i<10;i++)
			{
				System.out.println("Keep Praising");
			}
		}
		public static void main(String[] args) 
		{
			ThreadExample te = new ThreadExample();
			te.setName("Java Thread");
			te.start();
			String name = te.getName();
			System.out.println(name);
			boolean state = te.isAlive();
			System.out.println(state);
	}

}

