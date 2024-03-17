class SumOfDigitInCharArrayP3
{

	public long cal_sum(char[] ch)
	{
		long sum=0;
		for(int i=0;i<ch.length;i++)
		{
			sum=sum+ch[i];
		}
		return sum;
	}
	public static void main(String[] args)
	{
		System.out.println("Shaikh Nadim KSBSCIT058\n");
		char[] ch={0,4,2,7,5};
		SumOfDigitInCharArrayP3 obj=new SumOfDigitInCharArrayP3();
		
		long result=obj.cal_sum(ch);

		System.out.println("The sum of Digits of Char Array is: "+result);
	}
}