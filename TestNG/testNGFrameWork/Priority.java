package testNGFrameWork;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Priority {
	@Test(priority = 2)
	public void signup()
    {
    System.out.println("signup");
    }
	
	@Test(priority = 3)
	public void login()
    {
    System.out.println("login");
    
    }
	
	@Test
	public void homepage()
    {
    System.out.println("home page");
    }
	
	@Test(priority = 4)
	public void logout()
    {
    System.out.println("logout");
    }
}
