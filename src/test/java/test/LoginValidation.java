package test;

import org.testng.annotations.Test;

import pom.Login;

public class LoginValidation extends BaseTest{
	
	@Test
	public void ValidUsernameValidPasswordTest() {
		String username = "Sam@gmail.com";
		String password = "Test1234";
		Login login = new Login(driver);
		login.loginWithCredentials(username , password);
	}
	/*
	 * updated the code base from b1 branch
	 */
	@Test
	public void InValidUsernameValidPasswordTest() {
		String username = "InValid-Sam@gmail.com";
		String password = "Test1234";
		Login login = new Login(driver);
		login.loginWithCredentials(username , password);
	}
}
