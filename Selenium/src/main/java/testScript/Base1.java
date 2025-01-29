package testScript;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Base1 {
	
	public WebDriver driver;
	
	public void initializebrowser() {
		driver = new ChromeDriver();
		driver.get("https://www.bmw.in/en/index.html");
		
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Base1 base1 = new Base1();
		base1.initializebrowser();

	}

}
