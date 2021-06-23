package com;

import org.testng.annotations.Test;

public class testingClass extends BaseTest{

	@Test(groups="FrontEnd")
	public void test4() {
		System.out.println("test4");
	}
	
	@Test(groups="FrontEnd")
	public void test5() {
		System.out.println("test5");
	}
	
}
