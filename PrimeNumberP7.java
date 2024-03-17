import java.util.Scanner;
class PrimeNumberP7
{
	static boolean isPrime (int n)
   	{
     		int count = 0;
     		if (n < 2)
		{
       			return false;
		}

     		for (int i = 2; i < n; i++)
       		{
     			if (n % i == 0)
			{
        			return false;
			}
       		}
     		return true;
   	}
	public static void main (String[]args)
   	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Shaikh Nadim KSBSCIT058");
		System.out.println("Enter the number: ");
		int n=sc.nextInt();
     		for (int i = 0; i <= n; i++)
		{
       			if (isPrime (i))
			{
        			System.out.println (i);
			}
  		}
	}
}