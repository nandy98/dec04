package testPackage;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Parameterisedprac {
	
	
	
	@Test(dataProvider="loginData",dataProviderClass=DataProv.class)
	public void student(String name,int age) {
		
		System.out.println(name+"and"+age);
	}

}
