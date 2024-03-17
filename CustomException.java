import java.util.Scanner;
class MarksOutOfBoundsException extends Exception
{
	MarksOutOfBoundsException()
	{
	}
}
class MarksExcepP16
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Shaikh Nadim KSBSCIT058");
		System.out.println("Enter the marks: ");
		int marks=sc.nextInt();
		try
		{
			if(marks>100)
			{
				throw new MarksOutOfBoundsException();
			}
		}
		catch(MarksOutOfBoundsException ex)
		{
			System.out.println("Invalid Marks!!");
		}
	}
}