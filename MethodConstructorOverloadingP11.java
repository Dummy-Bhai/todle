class MethodConstructorOverloadingP11
{
	MethodConstructorOverloadingP11()
	{
		System.out.println("Constructor Without Parameter");
	}
	MethodConstructorOverloadingP11(int a)
	{
		a*=a;
		System.out.println("Constructor With Parameter");
	}

	public void myMethod()
	{
		System.out.println("Method Without Parameter");
	}	

	public void myMethod(int a)
	{
		a*=a;
		System.out.println("Method With Parameter");
	}
	
	public static void main(String[] args)
	{	
		System.out.println("Shaikh Nadim KSBSCIT058");
		
		MethodConstructorOverloadingP11 obj1=new MethodConstructorOverloadingP11();
		MethodConstructorOverloadingP11 obj2=new MethodConstructorOverloadingP11(10);

		obj1.myMethod();
		obj1.myMethod(10);

	}
}