class PalindromeP10
{
	
	public static void main(String[] args)
	{	
		System.out.println("Shaikh Nadim KSBSCIT058");
		String str="hello";
		int l=str.length()-1;
		String rv="";
		while(l>=0)
		{
			rv=rv+str.charAt(l);
			l--;
		}
		if(str.equals(rv))
		{
			System.out.println("The string is a palindrome");
		}
		else
		{
			System.out.println("The string is not a palindrome");
		}
	}
}