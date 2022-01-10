package Testngbase;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Sampletest 
{
	@Test(priority=1,description="This testcase will loginapplication")
	public void logintest()
	{
		System.out.println("My test kk");
		Assert.assertEquals(07, 11);
	}
	@Test(priority=2,description="This testcase will add users")
	public void addusers()
	{
		System.out.println("kk add users");
	}

	@Test(priority=3,description="This testcase will logout from application")
	public void logout()
	{
		System.out.println("kk has logout");
	}
}
