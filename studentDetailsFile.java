import java.io.*;
import java.util.Scanner;
class stdwriteP22
{
	public static void main(String[] args)
	{
		System.out.println("Shaikh Nadim KSBSCIT058");
		Scanner sc=new Scanner(System.in);
		try
		{
			FileOutputStream fis1=new FileOutputStream("abc.txt");
			System.out.println("Enter the name: ");
			String name=sc.nextLine();
			System.out.println("Enter the age: ");
			String age=sc.nextLine();
			String data=name+" "+age;
			byte[] b=data.getBytes();
			fis1.write(b);
		}
		
		catch(Exception ex)
		{
			System.out.println("Error Occured");
		}
		
	}
}