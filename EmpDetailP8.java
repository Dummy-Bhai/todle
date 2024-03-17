import java.util.Scanner;
class EmpDetailP8
{
	public static void main (String[]args)
   	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Shaikh Nadim KSBSCIT058");
		String name,age,address;
		System.out.println("Enter;\nName: ");
		name=sc.nextLine();
		System.out.println("Age: ");
		age=sc.nextLine();
		System.out.println("Address: ");
		address=sc.nextLine();
		System.out.println("Hello, "+name+" Your age is "+age+" and you stay at "+address);
	}
}