class A
{
	A()
	{
		System.out.println("Class A is called");
	}
}
class B extends A
{
	B()
	{
		System.out.println("Class B inheriting class A");
	}
}
class C extends A
{
	C()
	{
		System.out.println("Class C inheriting class A");
	}
}
class HierachicalInherP12D
{	
	public static void main(String[] args)
	{	
		System.out.println("Shaikh Nadim KSBSCIT058");
		B obj1=new B();
		C obj2=new C();
	}
}