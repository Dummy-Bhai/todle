class SmallestLargestElementInArrayP4
{
	public static void main(String[] args)
	{
		System.out.println("Shaikh Nadim KSBSCIT058");
		int[] n={23,43,54,12,65,83};
		int min=n[0],max=n[0];
		for(int i=1;i<n.length;i++)
		{
			if(n[i]<min)
			{
				min=n[i];
			}
			if(n[i]>max)
			{
				max=n[i];
			}
		}
		System.out.println("The Largest Element in the array is: "+max+"\nThe Smallest Element in the array is: "+min);
	}
}