package GroupsinTestNG;

import org.testng.annotations.Test;

public class Inbox {
	
	@Test (groups="smoke")
	public void smoke_TC()
	{
		System.out.println("Inbox Smoke TC");
	}

	@Test (groups="FTC")
	public void Functional_TC()
	{
		System.out.println("Inbox Functional TC");
	}

	@Test (groups="ITC")
	public void Integration_TC()
	{
		System.out.println("Inbox Integration TC");
	}

	@Test(groups="E2E")
	public void End2End_TC()
	{
		System.out.println("Inbox End2End TC");
	}

}
