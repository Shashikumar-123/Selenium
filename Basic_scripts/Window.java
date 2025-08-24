package Basic_scripts;

import java.awt.Dimension;
import java.awt.Point;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Window {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./softwares/chromedriver.exe");

		WebDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		//Dimension abc = new Dimension(800,360);
		//driver.manage().window().fullscreen();
		org.openqa.selenium.Point p= new org.openqa.selenium.Point(390,200);
		driver.manage().window().setPosition(p);
		
	}

			
	}

