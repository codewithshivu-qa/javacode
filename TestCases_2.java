package practisemavenpackage.practisemavenproject;

import org.testng.annotations.Test;

public class TestCases_2 extends Launchandquit 
{
	@Test
	public void searchandlogout() throws InterruptedException
	{

	HomePage h1 = new HomePage(driver);
	h1.accandlist(driver);
	h1.signin();
	
	LoginPage l1 = new LoginPage(driver);
	l1.un();
	l1.click();
	l1.pw();
	l1.lgin();
	h1.search_product();
    h1.search();
    h1.accandlist(driver);
    h1.logedout();
}
}