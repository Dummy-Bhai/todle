import java.util.Scanner;
class Practical3
{
	public static void main(String[] args)
	{
		System.out.println("Shaikh Nadim \nKSBSCIT058");
		Scanner obj=new Scanner(System.in);
		String gender;
		System.out.println("Enter the name: ");
		String name=obj.nextLine();
		System.out.println("Enter the age: ");
		int age=obj.nextInt();
		System.out.println("Enter the gender: \n1 for Male \n2 for Female \n3 for Other ");
		int n=obj.nextInt();
		switch(n)
		{
			case 1:
				gender="Male";
				break;
			case 2:
				gender="Female";

				break;
			case 3:
				gender="Other";
				break;
			default:
				System.out.println("Gender Not Recognize");
		}
		if(age<18 && age>0)
		{
			System.out.println("You are Minor");
		}
		if(age>=18)
		{
			System.out.println("You are Major");
		}
	}
}