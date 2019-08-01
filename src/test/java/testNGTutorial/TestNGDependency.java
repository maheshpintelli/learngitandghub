package testNGTutorial;

import org.testng.annotations.Test;

public class TestNGDependency {
	@Test
	public void stepOne() {
		System.out.println("Executing stepOne");
	}

	@Test
	public void stepTwo() {
		System.out.println("Executing stepOne->stepTwo");
	}

	@Test
	public void stepThree() {
		System.out.println("Executing stepOne->stepTwo->stepThree");
	}	

}
