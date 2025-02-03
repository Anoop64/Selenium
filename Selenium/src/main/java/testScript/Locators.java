package testScript;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Locators extends Base {

									//WebElement elementname=driver.findElement(By.Locator("locator value"));
	public void id() {
		WebElement id1 = driver.findElement(By.id("single-input-field"));
		WebElement id2 = driver.findElement(By.id("button-one"));
		WebElement id3 = driver.findElement(By.id("value-a"));
		WebElement id4 = driver.findElement(By.id("value-b"));
		WebElement id5 = driver.findElement(By.id("button-two"));
		WebElement id6 = driver.fi
		
	}
	
	public void classname() {
		WebElement e1 = driver.findElement(By.className("header-top"));
		WebElement e2 = driver.findElement(By.className("mb-sec"));
		WebElement e3 = driver.findElement(By.className("col-lg-9 col-md-9 col-sm-12 col-xs-12"));
		WebElement e4 = driver.findElement(By.className("list-group list-group-flush"));
		WebElement e5 = driver.findElement(By.className("collapse navbar-collapse"));

	}
	
	public void name() {
		WebElement n1 = driver.findElement(By.name("viewport"));
		WebElement n2 = driver.findElement(By.name("description"));
		WebElement n3 = driver.findElement(By.name("keywords"));
		WebElement n4 = driver.findElement(By.name("author"));
		
	}
	
	public void linkText() {
		WebElement l1 = driver.findElement(By.linkText("Simple Form Demo"));
		WebElement l2 = driver.findElement(By.linkText("Checkbox Demo"));
		WebElement l3 = driver.findElement(By.linkText("Radio Buttons Demo"));
		WebElement l4 = driver.findElement(By.linkText("Select Input"));
		WebElement l5 = driver.findElement(By.linkText("Form Submit"));
		WebElement l6 = driver.findElement(By.linkText("Ajax Form Submit"));
		WebElement l7 = driver.findElement(By.linkText("Jquery Select2"));
		
	}
	
	public void partialLinkText() {
		WebElement p1 = driver.findElement(By.partialLinkText("Jquery Se"));
		WebElement p1 = driver.findElement(By.partialLinkText("Ajax Fo"));
		WebElement p1 = driver.findElement(By.partialLinkText("Select I"));
		WebElement p1 = driver.findElement(By.partialLinkText("Radio Bu"));
		WebElement p1 = driver.findElement(By.partialLinkText("Checkbox De"));

		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locators locators = new Locators();
		locators.id();

	}

}
