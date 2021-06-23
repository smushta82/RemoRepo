package com;

import org.testng.annotations.Test;

public class SmokeTest extends BaseTest{
	
	@Test(groups="BackEnd")
	public void test1() {
		System.out.println("test1");
	}
	@Test
	public void test2() {
		System.out.println("test1");
	}
	

}
