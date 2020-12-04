package testPackage;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class FailedTestCaseExample2 {
	
	@Test
	public void myName() {
		SoftAssert st=new SoftAssert();
		System.out.println("softAssert started");
		st.assertEquals(1, 2);
		st.assertEquals(1, 1);
		st.assertEquals(3, 2);
		System.out.println("softAssert end");
		st.assertAll();
	}
	
	/*@Test
	public void harda() {
		System.out.println("Hard Assert Start");
		Assert.assertEquals(2, 1);
		Assert.assertEquals(2, 1);
		Assert.assertEquals(1, 1);
		System.out.println("hard assert end");
		
	}*/



}
