import java.util.Scanner;
class Practical5
{
	public static void main(String[] args)
	{
		System.out.println("Shaikh Nadim \nKSBSCIT058");
		Scanner obj=new Scanner(System.in);
		System.out.println("Enter the first number.");
		int n1=obj.nextInt();
		System.out.println("Enter the second number.");
		int n2=obj.nextInt();
		System.out.println("Enter \n1 for Addition \n2 for Subtraction \n3 for Multiplication \n4 for Division \n5 for Module");
		int menu=obj.nextInt();
		switch(menu)
		{
			case 1:
				System.out.println("The addition is "+(n1+n2));
				break;
			case 2:
				System.out.println("The subtraction is "+(n1-n2));
				break;
			case 3:
				System.out.println("The multiplication is "+(n1*n2));
				break;
			case 4:
				if(n2==0)
				{
					System.out.println("Not Divisible By Zero");
					break;
				}
				else
				{
					System.out.println("The division is "+(n1/n2));
					break;
				}
			case 5:
				if(n2==0)
				{
					System.out.println("Not Divisible By Zero");
					break;
				}
				else
				{
					System.out.println("The module is "+(n1%n2));
					break;
				}
				
		}
	}
}