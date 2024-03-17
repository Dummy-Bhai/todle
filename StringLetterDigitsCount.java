class StringDetailsP2
{
	public static void main(String[] args)
	{
		System.out.println("Shaikh Nadim KSBSCIT058");
		String str="I have 10$";
		int letter=0,space=0,number=0,otherchar=0;
		for(int i=0;i<str.length();i++)
		{
			if(Character.isLetter(str.charAt(i)))
			{
				letter+=1;
			}
			else if(Character.isDigit(str.charAt(i)))
			{
				number+=1;
			}
			else if(Character.isSpaceChar(str.charAt(i)))
			{
				space+=1;
			}
			else
			{
				otherchar+=1;
			}
		}
		System.out.println("The string contain;\nLetters: "+letter+"\nSpace: "+space+"\nNumber: "+number+"\nOther Character: "+otherchar);
	}
}