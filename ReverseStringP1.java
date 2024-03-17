class ReverseStringP1
{
	public static void main(String[] args)
	{
		System.out.println("Shaikh Nadim KSBSCIT058\n");
		String s="Hello World";
		int l=s.length();
		String str="";
		int i=l-1;
		while(i>=0)
		{
			str=str+s.charAt(i);
			i--;
		}
		System.out.println("The reverse string is: "+str);
	}
}