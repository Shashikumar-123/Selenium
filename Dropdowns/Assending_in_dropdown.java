package Dropdowns;

import java.awt.AWTException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assending_in_dropdown {

	public static void main(String[] args)  throws InterruptedException, AWTException {
		System.setProperty("webdriver.chrome.driver","./softwares/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		 driver.get("https://www.facebook.com/r.php");
		Thread.sleep(2000);
		WebElement dd = driver.findElement(By.id("month"));
		Select s= new Select(dd);
		
	ArrayList<String> arr=new ArrayList<String>();
		List<WebElement> opt = s.getOptions();
		for(WebElement p:opt)
		{
	String abc = p.getText();
	System.out.println(abc);
	arr.add(abc);
	//System.out.println("-------------------------------");

		}
	//Collections.sort(arr);//assending order
		Collections.sort(arr,Collections.reverseOrder());
				for(String a:arr)
		{
			System.out.println(a);
		}

}

}
