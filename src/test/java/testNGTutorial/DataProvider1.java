package testNGTutorial;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProvider1 {
	@DataProvider(name="testDataP")
	public Object [][] myDataProvider()
	{
		Object data [][]=new Object[1][2];
		data[0][0]="Mahesh";
		data[0][1]="Pund";
		return data;
		
	}
	@Test(dataProvider="testDataP")
	public void method(String a, String b)
	{
		System.out.println(a+" "+b);
		
	}

}
