package testScript;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Base {
	
	public WebDriver driver;//for globally declare driver

	public void initializebrowser(){
		driver = new ChromeDriver(); //loading Driver
		driver.get("https://selenium.qabible.in/"); // to launch url
		driver.manage().window().maximize(); //To maximize the window
	}

	public void DriverQuitClose(){
		driver.quit();
		//driver.close();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Base obj = new Base();
		obj.initializebrowser();
		obj.DriverQuitClose();

	}
	

}
