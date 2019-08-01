package testNGTutorial;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderinTestNG {
	@DataProvider(name="dataContainer")
	public Object[] myDataProvide()
	{
		Object data[]=new Object[3];
		data[0]="Mahesh";
		data[1]="D";
		data[2]="Pund";
		return data;
	}
	
	@Test(dataProvider="dataContainer")
	public void method(String a)
	{
		System.out.println(a);
	}
	

}
