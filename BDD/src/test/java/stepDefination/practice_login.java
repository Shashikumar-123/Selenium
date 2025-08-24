package stepDefination;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class practice_login {
	WebDriver driver;
	@Given("login page")
	public void login_page() {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
	}

	@When("ender valid {string}")
	public void ender_valid(String username) {
	   driver.findElement(By.id("email")).sendKeys(username);
	}

	@When("enter valid {string}")
	public void enter_valid(String password) {
		   driver.findElement(By.id("pass")).sendKeys(password);

	}

	@When("click login button")
	public void click_login_button() {
	   driver.findElement(By.name("login")).click();
	   
	}

	@Then("account should successfully login")
	public void account_should_successfully_login() {
		   System.out.println("home page displayed");

	}

}
