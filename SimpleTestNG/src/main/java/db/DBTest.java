package db;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DBTest {


	@Test(dataProvider = "dp")
	public void f(Integer n, String s) {
	}

	@DataProvider
	public Object[][] dp() {
		return new Object[][] {
			new Object[] { 1, "a" },
			new Object[] { 2, "b" },
		};
	}

}
