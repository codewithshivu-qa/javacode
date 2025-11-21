//math class is one of the predefined class in java which comes under java lang package we need not to import it//
//it is used to perform mathematical operation//
package mathclass;
public class MathClass_Program 
{
	public static void main(String[] args) 
	{
	 System.out.println(Math.addExact(50, 63));//(int,int)
	 System.out.println(Math.addExact(50783838383l, 638478494949l));//(long,long)
	 
	 System.out.println(Math.subtractExact(68, 56));
	 
	 System.out.println(Math.multiplyExact(55, 2));
	 
	 System.out.println(Math.divideExact(35, 4));
	 
	 System.out.println(Math.min(66, 79));
	
	 System.out.println(Math.random());//this method will generate the random number between 0 and 1 of double datatype
	}

}
