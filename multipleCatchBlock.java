class excepP19
{
	public static void main(String[] args)
	{
		System.out.println("Shaikh Nadim KSBSCIT058");
		try
		{
			int a=100/0;
		}
		catch(ArithmeticException ex1)
		{
			System.out.println("Error Occured");
		}
		catch(Exception ex)
		{
			System.out.println("Error Occured");
		}
		
	}
}