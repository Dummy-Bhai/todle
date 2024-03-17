class SortData
{

	public static void asec(int[] n)
	{
		int temp;
		for(int i=0;i<n.length;i++)
		{
			int k=(n.length)-i;
			for(int j=0;j<k-1;j++)
			{
				if(n[j]>n[j+1])
				{
					temp=n[j+1];
					n[j+1]=n[j];
					n[j]=temp;
				}
			}
		}
		System.out.println("The ascending order is: ");
		for(int i=0;i<n.length;i++)
		{
			System.out.print(n[i]+"  ");
		}
		System.out.println();
	}

	public static void dsec(int[] n)
	{
		int temp;
		for(int i=0;i<n.length;i++)
		{
			int k=(n.length)-i;
			for(int j=0;j<k-1;j++)
			{
				if(n[j]<n[j+1])
				{
					temp=n[j+1];
					n[j+1]=n[j];
					n[j]=temp;
				}
			}
		}
		System.out.println("The descending order is: ");
		for(int i=0;i<n.length;i++)
		{
			System.out.print(n[i]+"  ");
		}
		System.out.println();
	}

	public static void main(String[] args)
	{
		System.out.println("Shaikh Nadim KSBSCIT058");
		int[] n={12,43,2,65,34};
		asec(n);
		dsec(n);
	}
}