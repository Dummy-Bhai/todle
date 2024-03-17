interface A
{
	public void print1();
}
interface B extends A
{
	public void print2();
}

class interfaceP17B implements B
{
	public void print1()
	{
		System.out.println("Its Interface A Extended By B");
	}
	public void print2()
	{
		System.out.println("Its Interface B");
	}
	public static void main(String[] args)
	{
		System.out.println("Shaikh Nadim KSBSCIT058");
		interfaceP17B obj=new interfaceP17B();
		obj.print1();
		obj.print2();
	}
}