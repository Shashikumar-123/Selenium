package Basic_scripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Fetch_url {


			public static void main(String[] args) throws InterruptedException {
			

					/*String key ="webdriver.chrome.driver";
					String value ="./softwares/chromedriver.exe";
					*/
					System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
					

				WebDriver driver	= new ChromeDriver();
		driver.get("https://www.flipkart.com");
		driver.manage().window().maximize();
		Thread.sleep(3000);
String	title	= driver.getTitle();
System.out.println(title);
String url = driver.getCurrentUrl();
System.out.println(url);
		driver.close();
		//driver.quit();
	}

}
