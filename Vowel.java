class Practical11
{
	public static void main(String[] args)
	{
		System.out.println("Shaikh Nadim \nKSBSCIT058");
		String alphabet="A";
		String a1=alphabet.toLowerCase();
		if(a1.equals("a") || a1.equals("e") || a1.equals("i") || a1.equals("o") || a1.equals("u"))
		{
			System.out.println("The Alphabet "+alphabet+" is a vowel");
		}
		else
		{
			System.out.println("The Alphabet "+alphabet+" is not a vowel");
		}
	}
}