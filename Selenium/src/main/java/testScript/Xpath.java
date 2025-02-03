package testScript;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

							//Xpath of 2 types - Absolute & Relative Xpath.
							//We are using Relative Xpath
public class Xpath extends Base { 
	
	public void xpath() {
							//Syntax - //tag[@attribute='value']
		
									// // :-Select current node
									//	@ :-Selects attribute
									// []=to filter elements based on conditions.
							
		WebElement xp1 = driver.findElement(By.xpath("//button[@id='button-one']"));
		WebElement xp2 = driver.findElement(By.xpath("//input[@id='single-input-field']"));
		WebElement xp3 = driver.findElement(By.xpath("//input[@id='value-a']"));
		WebElement xp4 = driver.findElement(By.xpath("//div[@id='message-two']"));


	}
	public void contains() {
							// Syntax //tag[contains(@attribute,'value')]
		
		WebElement c1 = driver.findElement(By.xpath("//label[contains(@for,'inputEmail4')]"));
		WebElement c2 = driver.findElement(By.xpath("//div[contains(@id,'message-one')]"));
		WebElement c3 = driver.findElement(By.xpath("//button[contains(@id,'button-one')]"));
		WebElement c4 = driver.findElement(By.xpath("//input[contains(@id,'value-a')]"));
	}
	public void startswith() {
							// Syntax //tag[starts-with(@id,'value')]
		WebElement sw1 = driver.findElement(By.xpath("//label[starts-with(@for,'inputEmail4')]"));
		WebElement sw1 = driver.findElement(By.xpath("//input[starts-with(@id,'single-input-field')]"));
		WebElement sw1 = driver.findElement(By.xpath("//div[starts-with(@id,'message-one')]"));
		WebElement sw1 = driver.findElement(By.xpath("//button[starts-with(@id,'button-two')]"));

		
	}
	public void text() {
							// Syntax //tag[text()='text']
		WebElement t1 = driver.findElement(By.xpath("//label[text()='Enter Message']"));
		WebElement t1 = driver.findElement(By.xpath(""));
		WebElement t1 = driver.findElement(By.xpath(""));
		WebElement t1 = driver.findElement(By.xpath(""));

		
	}
	public void and() {
							//Syntax //tag[@attribute='value' and @attribute='value']
		
	}
	public void or() {
							//Syntax //tag[@attribute='value' or @attribute='value']

		
	}
		
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
