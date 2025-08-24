package Basic_scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Noukari {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./softwares/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.naukri.com/registration/createAccount?othersrcp=23531&wExp=N&utm_source=google&utm_medium=cpc&utm_campaign=Brand_Login_Register&gad_source=1&gad_campaignid=21008292163&gbraid=0AAAAADLp3cE0-azTgl2lhVHJg2r6xTAcx&gclid=Cj0KCQjwiLLABhCEARIsAJYS6unYF98KCCHCNOQtcadK1Bgm6N8OnzZ8gQBgt_sAw3JUgvLLnpT9KqkaAsYfEALw_wcB&gclsrc=aw.ds");
	Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@placeholder='What is your name?']")).sendKeys("shashikumar");
	driver.findElement(By.xpath("//input[@placeholder='Tell us your Email ID']")).sendKeys("sssb@gmail.com");
	driver.findElement(By.xpath("//input[@maxlength='40']")).sendKeys("shashi@123");
	driver.findElement(By.xpath("//input[@id='mobile']")).sendKeys("9441557604");
	driver.findElement(By.xpath("//div[@data-val='exp']")).click();
	driver.findElement(By.xpath("//button[@type='submit']")).click();
	

	
	
	
	}

}
