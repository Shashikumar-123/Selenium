package Actions;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.awt.event.WindowStateListener;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class scroll {

	public static void main(String[] args) throws InterruptedException, AWTException {
System.setProperty("webdriver.chrome.driver","./softwares/chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.sentientgaming.com/");
		
		driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		WebElement ele = driver.findElement(By.xpath("//a[.='Events']"));

JavascriptExecutor js = (JavascriptExecutor)driver;
js.executeScript("arguments[0].scrollIntoView()",ele);

ele.getText();
ele.click();



}}
