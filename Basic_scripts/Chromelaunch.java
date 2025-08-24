package Basic_scripts;

import org.openqa.selenium.chrome.ChromeDriver;

public class Chromelaunch {

	public static void main(String[] args) {
		
	String key = "webdriver.chrome.driver";
	String value="./softwares/chromedriver.exe";

System.setProperty(key,value);
ChromeDriver driver = new ChromeDriver();
	}

}
