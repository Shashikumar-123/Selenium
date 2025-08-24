package GroupsinTestNG;

import org.testng.annotations.Test;

public class SignUp {
	
	@Test (groups="smoke")
	public void smoke_TC()
	{
		System.out.println("SignUp Smoke TC");
	}

	@Test (groups="FTC")
	public void Functional_TC()
	{
		System.out.println("SignUp Functional TC");
	}

	@Test(groups="ITC")
	public void Integration_TC()
	{
		System.out.println("SignUp Integration TC");
	}

	@Test(groups="E2E")
	public void End2End_TC()
	{
		System.out.println("SignUp End2End TC");
	}

}
