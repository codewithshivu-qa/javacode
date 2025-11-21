//Any variable is final we cannot change the value//
//Any Method is final we cannot override//only non static method will override so non static method will be final//


package finalkeyword;
class AMZ_1
{
	 final void login() //since its final we cannot override just observe under child class method is highlighting with red//
	{
		System.out.println("login with email id");
	}
}

public class Method_Override extends AMZ_1
{
	void login()
	{
		
		System.out.println("Login with phone no");
	}
	public static void main(String[] args) 
	{
		Method_Override m1 = new Method_Override();
		m1.login();
	}


}
