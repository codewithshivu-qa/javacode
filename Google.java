//remember any class which is final we cannot inherit// always parent class will be final in nature//

package finalkeyword;
final class Microsoft
{
	void add()
	{
		System.out.println("login with email");
	}
}
public class Google extends Microsoft
{
   void add()
   {
	   System.out.println("Login with mobile no");
   }
   public static void main(String[] args) 
   {
	Google g1 = new Google();
	g1.add();
	
}
}
