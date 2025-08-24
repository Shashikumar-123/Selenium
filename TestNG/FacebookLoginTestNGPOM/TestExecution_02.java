package FacebookLoginTestNGPOM;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestExecution_02 extends GenericPage {
	@Test
	public void testcase_02()
	{
		Assert.fail();
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getPageSource());
	}


}
