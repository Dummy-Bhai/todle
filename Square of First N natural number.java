class Practical9
{
	public static void main(String[] args)
	{
		System.out.println("Shaikh Nadim \nKSBSCIT058");
		int n=10;
		int sqrt;
		int sum=0;
		while(n>0)
		{
			sqrt=n*n;
			sum=sum+sqrt;
			n--;
		}
		System.out.println("The sum of square of first N natural number is "+sum);
		
	}
}