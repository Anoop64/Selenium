package testScript;

import org.openqa.selenium.By;

//import org.openqa.selenium.By;
//import org.openqa.selenium.WebElement;

public class Locators1  {
	
	public void id() {
		WebElement id1 = driver.findElement(By.id(""));
		WebElement id1 = driver.findElement(By.id(""));
		WebElement id3 = driver.findElement(By.id(""));
		
	}
	
	public void classname() {
		WebElement cn1 = driver.findElement(By.className("")));
		
	}
	
	public void name() {
		WebElement n1 = driver.findElement(By.name(""));
		WebElement n2 = driver.findElement(By.name(""));
		
	}
	
	public void linktext() {
		WebElement lt1 = driver.findElement(By.linkText(""));
		
	}
	
	public void partiallinktext() {
		WebElement plt1 = driver.findElement(By.partialLinkText(""));
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
