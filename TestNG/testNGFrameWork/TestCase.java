package testNGFrameWork;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestCase {
	
	@Test
	public void signup()
    {
    System.out.println("signup");
    }
	
	@Test
	public void login()
    {
	
    System.out.println("login");
    
    }
	
	@Test(invocationCount = 2)
	public void homepage()
    {
    System.out.println("home page");
    }
	
	@Test
	public void logout()
    {
    System.out.println("logout");
    }
}
