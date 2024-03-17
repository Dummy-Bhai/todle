import java.util.*;
class VectorP13
{	
	public static void main(String[] args)
	{	
		System.out.println("Shaikh Nadim KSBSCIT058");
		Vector v1=new Vector(3,2);
		System.out.println("Check empty or not: "+v1.isEmpty());
		v1.add("Java");
		v1.add("Python");
		v1.add("C");
		System.out.println("Capacity before increment: "+v1.capacity());
		v1.add("C++");
		System.out.println("Capacity after increment: "+v1.capacity());
		System.out.println("Removing element: "+v1.remove(0));
		System.out.println("Get value from index: "+v1.get(1));
		System.out.println("Get index from value: "+v1.indexOf("C"));
		System.out.println("Vector : "+v1.toString());
		System.out.println("Number of elements: "+v1.size());
		System.out.println("First element: "+v1.firstElement());
		System.out.println("Last element: "+v1.lastElement());
	}
}