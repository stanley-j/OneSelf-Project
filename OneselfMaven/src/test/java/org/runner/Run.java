package org.runner;

import org.baseOneSelf.BaseClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import SignInModule._01_valid_username_valid_password;

public class Run extends BaseClass {

	@BeforeClass
	public void test1() {
		System.out.println("Starting");
	}

	@Test
	public void test2() throws Throwable {
		_01_valid_username_valid_password.start();
	}
}
