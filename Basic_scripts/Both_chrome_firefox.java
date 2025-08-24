package Basic_scripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Both_chrome_firefox {

	public static void main(String[] args) {

		/*String key ="webdriver.chrome.driver";
		String value ="./softwares/chromedriver.exe";
		*/
		System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
		System.setProperty("webdriver.gecko.driver", "./softwares/geckodriver.exe");

	WebDriver driver	= new ChromeDriver();
	WebDriver driver1	= new FirefoxDriver();
	
	}

}
