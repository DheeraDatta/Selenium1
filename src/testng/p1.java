package testng;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class p1 
{
	@BeforeSuite
	public void beforesuite()
	{
		System.out.println("before suit");
	}
	@AfterSuite
	public void aftersuite()
	{
		System.out.println("after suit");
	}
	@BeforeClass
	public void beforeclass()
	{
		System.out.println("before class");
	}
	@AfterTest
	public void aftertest()
	{
		System.out.println("after test");
	}
	@BeforeTest
	public void beforetest()
	{
		System.out.println("before test");
	}
	@AfterClass
	public void afterclass()
	{
		System.out.println("after class");
	}
	@BeforeMethod
	public void beforemethode()
	{
		System.out.println("before methode");
	}
	@AfterMethod
	public void aftermethode()
	{
		System.out.println("after methode");
	}
	@Test
	public void script1()
	{
		System.out.println("script1");
	}
	@Test
	public void script2()
	{
		System.out.println("script2");
	}

}
