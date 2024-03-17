import java.util.Scanner;
class Practical2
{
	public static void main(String[] args)
	{
		System.out.println("Shaikh Nadim \nKSBSCIT058");
		int totalmarks;
		Scanner obj=new Scanner(System.in);
		System.out.println("Enter The Name: ");
		String name=obj.nextLine();
		System.out.println("Enter The RollNo: ");
		int rollno=obj.nextInt();
		System.out.println("Enter The Paper1 Marks Out Of 100: ");
		int p1=obj.nextInt();
		System.out.println("Enter The Paper2 Marks Out Of 100: ");
		int p2=obj.nextInt();
		System.out.println("Enter The Paper3 Marks Out Of 100: ");
		int p3=obj.nextInt();
		System.out.println("Enter The Paper4 Marks Out Of 100: ");
		int p4=obj.nextInt();
		if(p1>=40 && p2>=40 && p3>=40 && p4>=40)
		{
			totalmarks=p1+p2+p3+p4;
			System.out.println("Total Marks: "+totalmarks+"\nResult: Pass");
		}
		else
		{
			totalmarks=p1+p2+p3+p4;
			System.out.println("Total Marks: "+totalmarks+"\nResult: Fail");
		}
	}
}