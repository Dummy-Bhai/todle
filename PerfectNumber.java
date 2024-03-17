class Practical10
{
	public static void main(String[] args)
	{
		System.out.println("Shaikh Nadim \nKSBSCIT058");
		int n=6;
		int n1=1;
		int sum=0;
		while(n1<=n/2)
		{
			if(n%n1==0)
			{
				sum=sum+n1;
			}
			n1++;
		}
		if(sum==n)
		{
			System.out.println(n+" is a perfect number");
		}
		else
		{
			System.out.println(n+" is not a perfect number");
		}
		
	}
}