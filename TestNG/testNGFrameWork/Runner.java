package testNGFrameWork;

import org.testng.annotations.Test;

public class Runner extends Generic {
	@Test
	public void title()
	{
		System.out.println(driver.getTitle());
	}
	
	@Test
	public void url()
	{
		System.out.println(driver.getCurrentUrl());
	}
}
