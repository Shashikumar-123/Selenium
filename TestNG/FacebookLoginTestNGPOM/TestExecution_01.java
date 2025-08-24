package FacebookLoginTestNGPOM;

import org.testng.annotations.Test;

public class TestExecution_01 extends GenericPage {
	@Test
	public void testcase_01()
	{
		LoginPageObjects lop = new LoginPageObjects(driver);
		lop.Enter_UN();
		lop.Enter_PSW();
		lop.ClickLogin();
	}
	
	
}
