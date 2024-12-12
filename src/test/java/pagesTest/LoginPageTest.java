package pagesTest;

import org.testng.annotations.Test;
import baseUtil.BaseClass;

public class LoginPageTest extends BaseClass {
	
	@Test
	public void loginPageBasicValidationTest() {
		login.loginPageBasicValidation();
	}
	
	@Test
	public void invalidCredentialTest() {
		login.invalidCredentialValidation();
	}
	
	@Test
	public void validCredentialTest(){
		login.validCredentialValidation();
	}

}