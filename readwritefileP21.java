import java.io.*;
class readwritefileP21
{
	public static void main(String[] args)
	{
		System.out.println("Shaikh Nadim KSBSCIT058");
		try
		{
			FileInputStream fis=new FileInputStream("xyz.txt");
			FileOutputStream fis1=new FileOutputStream("abc.txt");
			int a=fis.read();
			while(a!=-1)
			{
				fis1.write(a);
				a=fis.read();
			}
			
		}
		
		catch(Exception ex)
		{
			System.out.println("Error Occured");
		}
		
	}
}