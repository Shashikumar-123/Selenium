package GroupsinTestNG;

import org.testng.annotations.Test;

public class Login {
	
	@Test(groups="smoke")
	public void smoke_TC()
	{
		System.out.println("Login Smoke TC");
	}

	@Test(groups="FTC")
	public void Functional_TC()
	{
		System.out.println("Login Functional TC");
	}

	@Test(groups="ITC")
	public void Integration_TC()
	{
		System.out.println("Login Integration TC");
	}

	@Test(groups="E2E")
	public void End2End_TC()
	{
		System.out.println("Login End2End TC");
	}

}
