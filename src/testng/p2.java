package testng;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;


public class p2 
{
	//@Test
	//public void script1()
	//{
		//boolean cond1=false;
		//Assert.assertEquals(cond1, true);
		//Assert.fail();
		//SoftAssert a=new SoftAssert();
		//a.fail();
		//Reporter.log("string1", true);// this methode is to get msg 
	//}
	@Test(groups= {"smoke"})
	public void script1()
	{
		Assert.fail();
		Reporter.log("string1", true);
	}
	@Test(groups= {"smoke"})
	public void script2()
	{
	  Reporter.log("string2", true); 
	}
	@Test(groups= {"smoke"})
	public void script3()
	{
	  Reporter.log("string3", true);
	}
	@Test
	public void script4()
	{
	  Reporter.log("string4", true);
	}
}
