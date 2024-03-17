import java.io.*;
class readfileP20
{
	public static void main(String[] args)
	{
		System.out.println("Shaikh Nadim KSBSCIT058");
		try
		{
			FileInputStream fis=new FileInputStream("xyz.txt");
			int a=fis.read();
			while(a!=-1)
			{
				System.out.print((char)a);
				a=fis.read();
			}
			
		}
		
		catch(Exception ex)
		{
			System.out.println("Error Occured");
		}
		
	}
}