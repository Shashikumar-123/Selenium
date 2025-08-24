package testNGFrameWork;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Dependency {
	@Test()
	public void signup()
    {
    System.out.println("signup");
    }
	
	@Test(dependsOnMethods = "signup")
	public void login()
    {
	Assert.fail();
    System.out.println("login");
    
    }
	
	@Test(dependsOnMethods = "login")
	public void homepage()
    {
    System.out.println("home page");
    }
	
	@Test(enabled = false)
	public void logout()
    {
    System.out.println("logout");
    }
}
