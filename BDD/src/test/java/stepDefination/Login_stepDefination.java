package stepDefination;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Login_stepDefination {
	WebDriver driver;
	
	@Given("Login page")
	public void login_page() 
	{
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		 
	}

	
	@When("user Enter username  {string}")
	public void user_enter_username(String username) {
	  driver.findElement(By.id("email")).sendKeys(username);  
	}
@When("user enter password {string}")
	public void user_enter_password(String password) {
		driver.findElement(By.id("pass")).sendKeys(password); 	}



	@When("click on login button")
	public void click_on_login_button() {
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
	}

	@Then("Home page should display")
	public void home_page_should_display() {
	   System.out.println("home page displayed");
	}

}
