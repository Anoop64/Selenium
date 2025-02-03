package testScript;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class CsSelectors extends Base {
	
	public void tagandid() {
								//tag#id
		WebElement tid1 = driver.findElement(By.cssSelector("button#button-one"));
		WebElement tid2 = driver.findElement(By.cssSelector("div#message-one"));
		WebElement tid3 = driver.findElement(By.cssSelector("input#value-a"));
		WebElement tid4 = driver.findElement(By.cssSelector("input#value-b"));
	}
	public void tagandclass() {
								//tag.class
		WebElement tc1 = driver.findElement(By.cssSelector("div.header-top"));
		WebElement tc2 = driver.findElement(By.cssSelector("div.mb-sec"));
		WebElement tc3 = driver.findElement(By.cssSelector("a.navbar-brand"));
		WebElement tc4 = driver.findElement(By.cssSelector("button.navbar-toggler"));
		WebElement tc5 = driver.findElement(By.cssSelector("section.clearfix"));
	}
	public void tagandattribute() {
								//tag[attribute=value]
		WebElement ta1 = driver.findElement(By.cssSelector("button[id='button-one']"));
		WebElement ta2 = driver.findElement(By.cssSelector("label[for='inputEmail4']"));
		WebElement ta3 = driver.findElement(By.cssSelector("button[id='button-two']"));
		WebElement ta4 = driver.findElement(By.cssSelector("div[id='message-two']"));
		WebElement ta5 = driver.findElement(By.cssSelector("input[id='value-a']"));
	}
	public void tagclassandattribute() {
								//tag.classname[attribute=value]
		WebElement tca1 = driver.findElement(By.className("input.form-control[id='single-input-field']"));
		WebElement tca2 = driver.findElement(By.cssSelector("input.form-control[id='value-a']"));
		WebElement tca3 = driver.findElement(By.cssSelector("input.form-control[id='value-b']"));
		WebElement tca4 = driver.findElement(By.cssSelector(""));
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
