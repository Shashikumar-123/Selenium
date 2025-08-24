package Actions;

import java.awt.AWTException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Selectcls {

		public static void main(String[] args)  throws InterruptedException, AWTException {
			System.setProperty("webdriver.chrome.driver","./softwares/chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			driver.navigate().to("https://demoapps.qspiders.com/ui/dropdown?sublist=0");
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	
		WebElement ele = driver.findElement(By.id("select3"));
		Select s = new Select(ele);
		ArrayList<String>arr = new ArrayList<>();
List<WebElement> opt = s.getOptions();
for(WebElement all: opt)
	{
String txt = all.getText();	
arr.add(txt);
}
Collections.sort(arr);
for(String a:arr)
{
	System.out.println(a);
}
	}
}
