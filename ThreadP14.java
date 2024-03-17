class A extends Thread
{
	A()
	{
		System.out.println("Thread is called");
	}
}
class ThreadP14
{	
	public static void main(String[] args)
	{	
		System.out.println("Shaikh Nadim KSBSCIT058");
		A obj=new A();
		Thread t1=new Thread(obj);
		try
		{
		System.out.println("State: "+t1.getState());
		t1.start();
		System.out.println("State: "+t1.getState());
		t1.join();
		System.out.println("State: "+t1.getState());
		}
		catch(Exception e)
		{
			System.out.println("Error");
		}
	}
        
}