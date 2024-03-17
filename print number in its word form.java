import java.util.Scanner;
class Practical4
{
	public static void main(String[] args)
	{
		System.out.println("Shaikh Nadim \nKSBSCIT058");
		Scanner obj=new Scanner(System.in);
		System.out.println("Enter the single digit number: ");
		int n=obj.nextInt();
		if(n>=0 && n<=9)
		{
			switch(n)
			{
				case 0:
					System.out.println("Zero");
					break;
				case 1:
					System.out.println("One");
					break;
				case 2:
					System.out.println("Two");
					break;
				case 3:
					System.out.println("Three");
					break;
				case 4:
					System.out.println("Four");
					break;
				case 5:
					System.out.println("Five");
					break;
				case 6:
					System.out.println("Six");
					break;
				case 7:
					System.out.println("Seven");
					break;
				case 8:
					System.out.println("Eight");
					break;
				case 9:
					System.out.println("Nine");
					break;
				default:
					break;
			}
		}
		else
		{
			System.out.println("Please enter single digit number only");
		}
	}
}