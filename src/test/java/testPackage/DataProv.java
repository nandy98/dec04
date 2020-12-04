package testPackage;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class DataProv {
	
	
	@DataProvider(name="loginData")
	public Object logindata() {
		return new Object[][] {
			{"Nandlal",25},
			{"Sat",30}
		};
	}

}
