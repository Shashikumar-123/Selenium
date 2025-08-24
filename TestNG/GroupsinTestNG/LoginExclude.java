package GroupsinTestNG;

import org.testng.annotations.Test;

public class LoginExclude {
	@Test(groups={"g1","g2"})
	public void smoke_TC()
	{
		System.out.println("Login Smoke TC");
	}

	@Test(groups={"g1","g2","g3"})
	public void Functional_TC()
	{
		System.out.println("Login Functional TC");
	}

	@Test(groups="g2")
	public void Integration_TC()
	{
		System.out.println("Login Integration TC");
	}

	@Test(groups={"g3","g2"})
	public void End2End_TC()
	{
		System.out.println("Login End2End TC");
	}


}
