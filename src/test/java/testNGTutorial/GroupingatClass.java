package testNGTutorial;

import org.testng.annotations.Test;

@Test(groups= {"G1"})
public class GroupingatClass {
	public void method()
	{
		System.out.println("Method");
	}
	public void method1()
	{
		System.out.println("Method1");
	}

}
