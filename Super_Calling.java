//Inheriting and calling constructors in the inheritance by using super calling statement//
package superandthis;
class Grand_Parent
{
	Grand_Parent()
	{
		System.out.println("1");
	
	}
}
class Parent_Class extends Grand_Parent
{
	Parent_Class(int a , int b)  
	{
	    super();
		System.out.println("2");
		
	}
}

public class Super_Calling extends Parent_Class
{
	Super_Calling()
	{
		super(5, 6);   //parameterized super calling statement//
		System.out.println("3");
	}

public static void main(String[] args)
{
	 new Super_Calling();
}
}

