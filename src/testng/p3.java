package testng;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class p3
{
	@Test(invocationCount=5)
	public void script1()
	{
	  Reporter.log("string1", true);
	}
	

}
