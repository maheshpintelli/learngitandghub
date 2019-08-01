package testNGTutorial;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProvider2 {
	
	@DataProvider(name="DP")
	public String[] dataProviderMethod()
	{
		String data[]=new String[3];
		data[0]="abc";
		data[1]="ijk";
		data[2]="pqr";
		return data;
	}
	@Test(dataProvider="DP")
	public void method(String name)
	{
		System.out.println(name);
	}

}
