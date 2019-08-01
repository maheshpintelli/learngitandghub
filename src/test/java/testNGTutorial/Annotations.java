package testNGTutorial;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Annotations {
	@BeforeSuite
	public void beforeSuite()
	{
		System.out.println("beforeSuite");
	}
	@AfterSuite
	public void afterSuite()
	{
		System.out.println("afterSuite");
	}
	@BeforeTest
	public void beforeTest()
	{
		System.out.println("beforeTest");
	}
	@AfterTest
	public void afterTest()
	{
		System.out.println("afterTest");
	}
	@BeforeClass
	public void beforeClass()
	{
		System.out.println("beforeClass");
	}
	@AfterClass
	public void afterClass()
	{
		System.out.println("afterClass");
	}
	@BeforeMethod
	public void beforemethdo()
	{
		System.out.println("beforemethdo");
	}
	@AfterMethod
	public void afterMethod()
	{
		System.out.println("afterMethod");
	}
	@Test(groups= {"G1"})
	public void testMethod()
	{
		System.out.println("testMethod");
	}
	@Test(groups= {"G1", "G2"})
	public void testMethod1()
	{
		System.out.println("testMethod1");
	}
	}
