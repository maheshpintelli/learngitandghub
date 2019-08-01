package testNGTutorial;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class AssertionTest {
	@Test
	public void hardassertion()
	{
		String s="Mahesh";
		String s1="Me";
		Assert.assertEquals(s, s1);
//		Assert.assertNotEquals(s, s1);
//		Assert.assertFalse(s=="Mahesh");
//		Assert.assertTrue(s=="Mahesh");
//		Assert.assertNull("Mahesh");
//		Assert.fail();
		System.out.println("Hasrd Assertion Completed");
	}
@Test
	public void softAssetion()
	{
	SoftAssert soft=new SoftAssert();
	String s="Mahesh";
	String s1="Me";
	soft.assertEquals(s, s1);
	System.out.println("Softasssertion Completed");
	soft.assertAll();
	
	
	}
}
