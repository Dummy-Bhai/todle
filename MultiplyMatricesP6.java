class MultiplyMatricesP6
{
	public static void main(String[] args)
	{
		System.out.println("Shaikh Nadim KSBSCIT058");
		int[][] m1={{1,0,0},{2,4,6},{7,2,9}};
		int[][] m2={{9,0,8},{1,5,2},{3,0,1}};
		int[][] m3=new int[3][3];
		
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				m3[i][j]=0;
				for(int k=0;k<3;k++)
				{
					m3[i][j]+=m1[i][k]*m2[k][j];
				}
			}
		}
		
		System.out.println("The Matrice After Multiplication Is: ");
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				System.out.print(m3[i][j]+"\t");
			}
			System.out.println();
		}
	}
}