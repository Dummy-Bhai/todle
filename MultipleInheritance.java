interface i1
{
	public void myMethod();
}
interface i2
{
	public void myMethod1();
}
class MultipleInherP12B implements i1,i2
{	
	public void myMethod()
	{
		System.out.println("Interface 1 Method Called");
	}
	public void myMethod1()
	{
		System.out.println("Interface 2 Method Called");
	}
	public static void main(String[] args)
	{	
		System.out.println("Shaikh Nadim KSBSCIT058");
		MultipleInherP12B obj=new MultipleInherP12B();
		obj.myMethod();
		obj.myMethod1();
	}
}