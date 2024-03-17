class A
{
	A()
	{
		System.out.println("Class A Called");
	}
}
class B extends A
{
	B()
	{
		System.out.println("Class B Called");
	}
}
class MultilevelInherP12C extends B
{	
	public static void main(String[] args)
	{	
		System.out.println("Shaikh Nadim KSBSCIT058");
		MultilevelInherP12C obj=new MultilevelInherP12C();
	}
}