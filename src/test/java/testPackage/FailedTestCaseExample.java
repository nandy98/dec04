package testPackage;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import junit.framework.Assert;

public class FailedTestCaseExample {
	
	@BeforeTest
	public void myName() {
		System.out.println("Nandlal");
		Assert.assertEquals(1, 1);
	}
	
	@Test(groups="smoke")
	public void myName0() {
		System.out.println("myName0");
		Assert.assertEquals(1, 1);
	}
	@Test(groups="smoke")
	public void myName1() {
		System.out.println("myName1");
		Assert.assertEquals(1, 1);
	}
	@Test(dependsOnGroups="smoke")
	public void myName2() {
		System.out.println("myName2");
		Assert.assertEquals(1, 1);
	}
	@Test(groups="smoke")
	public void myName3() {
		System.out.println("myName3");
		Assert.assertEquals(1, 1);
	}
	@Test(groups="regression")
	public void myName4() {
		System.out.println("myName4");
		Assert.assertEquals(1, 1);
	}

}
