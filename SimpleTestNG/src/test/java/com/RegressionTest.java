package com;

import org.testng.annotations.Test;

public class RegressionTest extends BaseTest{
	
	@Test(groups="BackEnd")
	public void test2() {
		System.out.println("test2");
	}
	@Test(groups="FrontEnd")
	public void test3() {
		System.out.println("test3");
	}
}
