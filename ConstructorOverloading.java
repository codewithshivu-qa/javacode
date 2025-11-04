//developing multiple constructors but variation in argument list is called Constructor Overloading//
package basics;
public class ConstructorOverloading 
{
	ConstructorOverloading()
	{
		String name="Shivakumar";
		int age= 17;
		System.out.println("Student name is :"+name);
		System.out.println("Student age is :"+age);
	}
	ConstructorOverloading(int a,int b, int c)
	{
		int result = a+b+c;
		System.out.println("result is :"+result);
	}
	
	ConstructorOverloading(byte a,int b, short c)
	{
		int result = a+b+c;
		System.out.println("result is :"+result);
	}
	ConstructorOverloading(String name, String Password)
	{
		System.out.println("welcome to facebook");
	}
	public static void main(String[] args)
	{
		new ConstructorOverloading();
		new ConstructorOverloading(5,6,7);
		ConstructorOverloading c1= new ConstructorOverloading((byte)5,(int)6,(short)5); //you can call constructor by creating object as well//
		new ConstructorOverloading("ram","Ram@123");
	}
   
}
